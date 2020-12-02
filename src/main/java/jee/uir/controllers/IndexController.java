package jee.uir.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
	Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Value("${spring.application.name}")
    String appName;
 
    @RequestMapping("/")
    public String homePage() {
        //model.addAttribute("appName", appName);
        //logger.trace("A TRACE Message");
        //logger.debug("A DEBUG Message");
        //logger.warn("A WARN Message");
        //logger.info("A WARN Message");
        //logger.error("An ERROR Message");
        return "index";
    }

}
