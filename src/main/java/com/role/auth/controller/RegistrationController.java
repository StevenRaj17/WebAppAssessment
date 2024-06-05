package com.role.auth.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.role.auth.DTO.UserRegisteredDTO;
import com.role.auth.service.DefaultUserService;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private final DefaultUserService userService;

    public RegistrationController(DefaultUserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegisteredDTO userRegistrationDto() {
        return new UserRegisteredDTO();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegisteredDTO registrationDto) {
        try {
            userService.save(registrationDto);
        } catch (IllegalArgumentException e) {
            return "redirect:/registration?error";
        }
        return "redirect:/registration?success";
    }
}
