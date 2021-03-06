package com.rizomm.sensaxion.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by anthonycallaert on 22/01/16.
 */
@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = {"/", "/home"})
    public ModelAndView welcome(){
        LOGGER.debug("Getting home page");

        ModelAndView modelAndView = new ModelAndView("home");

        return modelAndView;
    }
}
