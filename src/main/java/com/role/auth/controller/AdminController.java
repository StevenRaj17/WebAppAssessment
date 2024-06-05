package com.role.auth.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.role.auth.model.User;
import com.role.auth.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/adminportal")
public class AdminController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String displayDashboard(Model model, HttpServletRequest request, HttpServletResponse response) {
        String user = returnUsername(request);
        model.addAttribute("userDetails", user);
        return "adminportal";
    }

    private String returnUsername(HttpServletRequest request) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        UserDetails user = (UserDetails) securityContext.getAuthentication().getPrincipal();
        User users = userRepository.findByEmail(user.getUsername());
        return users.getName();
    }
}
