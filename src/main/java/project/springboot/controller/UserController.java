package project.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.springboot.model.User;
import project.springboot.services.UserServices;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    private final UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }
    @GetMapping("/users")
    public String userList(Model model){
        List<User> user = userServices.listUsers();
        model.addAttribute("user1s", user);
        return "user";
    }
    @GetMapping("/")
    public String userList2(){
        List<User> user = userServices.listUsers();
        return "user";
    }
    @GetMapping("/users/new")
    public String newUser(Model model) {
        model.addAttribute("newUser", new User());
        return "newUser";
    }
    @PostMapping("/users/new")
    public String create(User user){
        userServices.save(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        userServices.delete(id);
        return "redirect:/users";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userServices.show(id));
        return "editTable";
    }
    @PostMapping("/edit/{id}")
    public String update(User user) {
        userServices.save(user);
        return "redirect:/users";
    }


}
