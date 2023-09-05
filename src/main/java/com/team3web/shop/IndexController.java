package com.team3web.shop;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
    
    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Locale locale, Model model) {
        logger.info("Welcome home! The client locale is {}.", locale);
        
        return "index";
    }
    
}
