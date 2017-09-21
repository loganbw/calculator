package com.logan.calculator.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    @RequestMapping("/" )
    public String indext(){
        return "index";
    }
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String index(@RequestParam("number1") double number1,
                        @RequestParam("operators") String operators,
                        @RequestParam("number2") double number2, Model model){
        if (operators.equals("+")){
           double result = number1 + number2;

           model.addAttribute("result",number1 + " + "+ number2 + " = " +result);
        }
        if (operators.equals("-")){
            double result = number1 - number2;
            model.addAttribute("result", number1 + " - "+ number2 + " = " +result);

        }
        if (operators.equals("*")){
            double result = number1 * number2;
            model.addAttribute("result", number1 + " * "+ number2 + " = " +result);
        }
        if (operators.equals("/")){
            double result = number1 / number2;
            model.addAttribute("result", number1 + " / "+ number2 + " = " +result);
        }

        return "index";
    }
}
