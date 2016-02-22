
package com.cigreja.employeewebsite.controllers;

import com.cigreja.employeewebsite.business.Employee;
import com.cigreja.employeewebsite.data.HibernateEmployeeRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.servlet.ModelAndView;

/**
 * AddController
 * @author Carlos Igreja
 * @since  Feb 21, 2016
 */
@Controller
@RequestMapping(value = "/Add")
public class AddController {
    
    HibernateEmployeeRepository hibernateRepository;

    @RequestMapping(method = POST)
    public ModelAndView add(HttpServletRequest request){
        
        HashMap<String,String> model = new HashMap<>();
        String view = "home";
            
        try {
            // get the Employee information
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String gender = request.getParameter("gender");
            int age = Integer.parseInt(request.getParameter("age"));
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            Date dateOfBirth = formatter.parse(request.getParameter("dateOfBirth"));
            double salary = Double.parseDouble(request.getParameter("salary"));
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            Employee employee = new Employee(firstName, lastName, gender, age,
                    dateOfBirth, salary, email, phone);
            
            // persist the Employee
            hibernateRepository.save(employee);
            
        } catch (ParseException ex) {
            // add error message to model
        }
        return new ModelAndView(view,model);
    }
}
