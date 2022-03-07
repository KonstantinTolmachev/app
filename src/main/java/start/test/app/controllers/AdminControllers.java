package start.test.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminControllers {


    @GetMapping("/")
    public String admin( Model model) {
        model.addAttribute("title", "Администратор");
        return "Authorization";
    }



}
