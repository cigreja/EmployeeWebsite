
package com.cigreja.mavenproject1.controllers;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * HelloController
 * @author Carlos Igreja
 * @since  Feb 21, 2016
 */
@Controller
@RequestMapping(value="/")
public class HelloController {
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView hello(){
        HashMap<String,String> model = new HashMap<>();
        model.put("msg","hello msg");
        return new ModelAndView("hello",model);
    }
}
