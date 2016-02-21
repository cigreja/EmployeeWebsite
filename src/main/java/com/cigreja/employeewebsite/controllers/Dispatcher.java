
package com.cigreja.employeewebsite.controllers;

import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.servlet.ModelAndView;

/**
 * Dispatcher
 * @author Carlos Igreja
 * @since  Feb 18, 2016
 */
@Controller
@RequestMapping( value = "/")
public class Dispatcher {

    @RequestMapping(method = GET)
    public ModelAndView home(){
        HashMap<String,String> model = new HashMap<>();
        model.put("msg", "Hello World!");
        return new ModelAndView("home", model);
    }
}
