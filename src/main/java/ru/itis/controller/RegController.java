package ru.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.itis.dto.UserDto;
import ru.itis.model.Country;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
@Validated
public class RegController {

    @ModelAttribute("userDto")
    public UserDto setSignUpForm() {
        return new UserDto();
    }

    @GetMapping
    public String getReg(ModelMap modelMap){
        ArrayList<Country> country = new ArrayList<>();
        country.add(new Country(1L, "RUS", "Russia"));
        country.add(new Country(1L, "USA", "USA"));
        country.add(new Country(1L, "UK", "United Kingdom"));
        country.add(new Country(1L, "AUS", "Australia"));
        country.add(new Country(1L, "FR", "France"));
        modelMap.addAttribute("country", country);

        modelMap.addAttribute("user", new UserDto());
        return "reg";
    }

    @ModelAttribute("userDto")
    public UserDto setUserDto() {
        return new UserDto();
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg(@Valid @ModelAttribute("userDto") UserDto userDto, BindingResult result, Model m){
        System.out.println(userDto.toString());
        if(result.hasErrors()) {
            return "reg";
        }
        m.addAttribute("message", "Successfully saved User!");
        return "main";
    }

}
