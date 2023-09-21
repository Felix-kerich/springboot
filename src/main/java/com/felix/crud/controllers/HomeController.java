package com.felix.crud.controllers;

import com.felix.crud.entities.UserEntity;
import com.felix.crud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {
    private final UserService userService;
    @GetMapping
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("user",new UserEntity());
        return "index";
    }
    @GetMapping("/dashboard")
   public String dashboard(Model model){
        return "dashboard";
    }
    @PostMapping("/create-user")
   public String dashboard(@ModelAttribute UserEntity user,Model model){
       userService.saveUser(user);
        List<UserEntity> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers",allUsers);
        return "dashboard";
    }

}
