package kata.edu.spring.controller.impl;

import kata.edu.spring.controller.IndexController;
import kata.edu.spring.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping
public class IndexControllerImpl implements IndexController {

    private final UserService userService;

    @Override
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("userList", userService.getAll());
        return "index";
    }
}
