package com.springapp.mvc.controller;

import com.springapp.mvc.bo.RioBo;
import com.springapp.mvc.repository.RioDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Coupang on 2014. 9. 23..
 */
@Controller
@RequestMapping("/board")
public class BoardController {


	@Autowired
	private RioBo rioBo;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(ModelMap model) {
		List<RioDB> rioBoList = rioBo.getAll();
		return "list";
	}
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(ModelMap model) {
		return "modify";
	}
	@RequestMapping(value = "/reply", method = RequestMethod.GET)
	public String reply(ModelMap model) {
		return "reply";
	}
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public String view(ModelMap model) {
		return "view";
	}
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write(ModelMap model) {
		return "write";
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(ModelMap model) {
		return "delete";
	}
}
