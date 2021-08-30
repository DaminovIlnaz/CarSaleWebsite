package ru.itis.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itis.dto.UserDto;

@Controller
public class TestController {

    @GetMapping("test")
    public String getReg(ModelMap model){
        model.addAttribute("test", "test attr");
        return "test/test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String reg(@RequestParam String login, @RequestParam String password, @RequestParam Boolean gender, @RequestParam(defaultValue = "false") Boolean subscription){
        System.out.println(login + " " + password + " " + gender + " " + subscription);
        return "/test/test";
    }

    @ModelAttribute("userDto")
    public UserDto setUserDto() {
        return new UserDto();
    }

    @RequestMapping(value = "/test2", method = RequestMethod.POST)
    public String reg(@ModelAttribute("userDto") UserDto userDto){
        System.out.println(userDto.getLogin() + " " + userDto.getPassword() + " " + userDto.getGender() + " " + userDto.getSubscription());
        return "main";
    }

}
