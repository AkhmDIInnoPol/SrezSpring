package main.controllers;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Di on 27.04.2017.
 */
@Controller
public class HelloController
{


    private static final Logger logger = Logger.getLogger(HelloController.class);


    @RequestMapping(value = "/helloAdmin", method = RequestMethod.GET)
    public String helloAdmin()
    {
        return "helloAdmin";
    }






    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView post(@RequestParam(value = "login") String login,
                             @RequestParam(value = "password") String pass)
    {
        ModelAndView mav = new ModelAndView();



        return mav;
    }

}
