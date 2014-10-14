package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zcfrank1st on 10/14/14.
 */
@Controller
public class WelcomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home () {
        return new ModelAndView("redirect:/content/index.html");
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    @ResponseBody
    public String demo () {
        return "hahah";
    }

    // TODO  设置dispatcher
}
