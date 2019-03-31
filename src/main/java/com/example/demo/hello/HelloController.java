package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.hello.data.HelloForm;

@Controller
public class HelloController {

	@ModelAttribute
	HelloForm setUpForm() {
		return new HelloForm();
	}

	@RequestMapping(value = { "/hello" }, method = { RequestMethod.GET })
	public ModelAndView getInit(ModelAndView mv) {
		System.out.println("HelloController.getInit");

		mv.setViewName("hello/hello");
		HelloForm form = new HelloForm();
		form.setVal("初期値");
		mv.addObject("helloForm", form);
		
		return mv;
	}

	@RequestMapping(value = { "/hello" }, method = { RequestMethod.POST })
	public ModelAndView postInit(ModelAndView mv) {
		System.out.println("HelloController.postInit");

		mv.setViewName("hello/hello");
		HelloForm form = (HelloForm)mv.getModel().get("helloForm");
		System.out.println("フォームからサブミット値>>" + form.getVal());
		
		return mv;
	}

}
