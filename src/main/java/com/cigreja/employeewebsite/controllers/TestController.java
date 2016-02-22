
package com.cigreja.employeewebsite.controllers;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.servlet.ModelAndView;

/**
 * TestController
 * @author Carlos Igreja
 * @since  Feb 22, 2016
 */
@Controller
@RequestMapping("/Test")
public class TestController {

    @RequestMapping(method = POST)
    public ModelAndView test(HttpServletRequest request){
        HashMap<String,String> model = new HashMap<>();
        String view = "home";
        
        // get posted data
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        
        return new ModelAndView(view, model);
    }
}
