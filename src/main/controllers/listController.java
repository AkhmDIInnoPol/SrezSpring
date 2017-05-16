package main.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Di on 27.04.2017.
 */
@Controller
//@RequestMapping/*(value = "/listStudents")*/
public class listController
{





    @RequestMapping(value = "/students" ,method = RequestMethod.GET)
    public String showList(Model model,
                           @RequestParam(value = "editStudentBtn", required = false)  String buttonClicked
    )
    {






        return "listStudents";
    }
}
