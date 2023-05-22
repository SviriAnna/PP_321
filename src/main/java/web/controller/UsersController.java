package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;


@Controller
@RequestMapping("/users")
public class UsersController {

    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "someUsers";
    }
    @GetMapping("/{id}")
    public String showUserPage(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.showUserById(id));
        return "show";
    }
    @GetMapping (value = "/new")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "addingUser-view";
    }
    @PostMapping()
    public String save(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
    @GetMapping("/{id}/edit")
    public String editUser(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userService.showUserById(id));
        return "edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user")User user, @PathVariable("id") int id) {
        userService.update(id, user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        userService.delete(id);
        return "redirect:/users";
    }
}
