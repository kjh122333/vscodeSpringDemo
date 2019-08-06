package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public ModelAndView index() {
        System.out.println("!@#!#!@#!@!#!@#!@#!@#");
        ModelAndView view =new ModelAndView();
        view.setViewName("hello");
        view.addObject("name", "Hello");     
        return  view;
    }

   @RequestMapping(value="/hello2")
   public ModelAndView hello() {
       ModelAndView view =new ModelAndView();
       view.setViewName("hello2");
       view.addObject("name", "Hello2");       
       return view;
   }
   

}