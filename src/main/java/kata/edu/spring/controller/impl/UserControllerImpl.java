package kata.edu.spring.controller.impl;

import kata.edu.spring.controller.UserController;
import kata.edu.spring.model.User;
import kata.edu.spring.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/users")
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Override
    public String create(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "user";
    }

    @Override
    public String preUpdate(ModelMap modelMap, Long id) {
        modelMap.addAttribute("user-update", userService.findOne(id));
        return "user";
    }

    @Override
    public String create(User user) {
        userService.save(user);
        return "redirect:/index";
    }

    @Override
    public String remove(Long id) {
        userService.remove(id);
        return "redirect:/index";
    }

    @Override
    public String update(User user) {
        userService.save(user);
        return "redirect:/index";
    }
}
