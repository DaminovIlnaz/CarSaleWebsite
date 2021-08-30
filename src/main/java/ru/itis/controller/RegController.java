package ru.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itis.dto.UserDto;

@Controller
public class RegController {

    @ModelAttribute("userDto")
    public UserDto setSignUpForm() {
        return new UserDto();
    }

    @GetMapping
    public String getReg(){
        return "reg";
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg(@RequestParam String login, @RequestParam String password){
        System.out.println(login + " " + password);
        return "main";
    }

}
