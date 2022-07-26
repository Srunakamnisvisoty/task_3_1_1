package kata.edu.spring.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

public interface IndexController {

    @GetMapping({"/", "/index"})
    String index(ModelMap modelMap);
}
