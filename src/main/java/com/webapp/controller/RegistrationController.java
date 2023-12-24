package com.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.entity.Registration;
import com.webapp.service.RegistrationService;
import com.webapp.util.EmailSender;

@Controller
public class RegistrationController {
	@Autowired
    private EmailSender sender;
	@Autowired
	private RegistrationService service;

	//http://localhost:8080/viewReg
	@RequestMapping("/viewReg")
	public String viewReg() {
		return "new_reg";
	}
	@RequestMapping("/saveReg")
	public String SaveReg(
			@RequestParam("email") String email,
			Registration reg,
			ModelMap model
			) {
		service.SaveReg(reg);
		sender.sendEmail(email, "Ewlcome", "test");
		model.addAttribute("msg", "Information Saved!!!");
		return "new_reg";
	}
	@RequestMapping("/allReg")
	public String AllRegistration(ModelMap model) {
		List<Registration> reg=service.AllRegistration();
		model.addAttribute("registration", reg);
		return "list_Reg";
	}
	@RequestMapping("/delete")
	public String deleteReg(@RequestParam("id") long id,ModelMap model) {
		service.deleteReg(id);
		List<Registration> reg=service.AllRegistration();
		model.addAttribute("registration", reg);
		return "list_Reg";
	}
	@RequestMapping("/GetAllRegistration")
	public String GetReg(long id,ModelMap model) {
		Registration registration = service.GetReg(id);
		model.addAttribute("reg", registration);
		return "update_Reg";
	}
	@RequestMapping("/Update")
	public String updatereg(Registration registration,ModelMap model) {
		service.updatereg(registration);
		List<Registration> reg=service.AllRegistration();
		model.addAttribute("registration", reg);
		return "list_Reg";
	}
}
