package poly.edu.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestGetPost {

    @RequestMapping("/showForm")
    public String showForm(@RequestParam("page") Optional<Integer> optPage,
                           @RequestParam("username") Optional<String> optUN,
                           @RequestParam("password") Optional<String> optPW,
                           Model model) {
        
        model.addAttribute("test", "Noi dung test");
        
        int p = optPage.orElse(0) + 5;
        model.addAttribute("page", p);
        model.addAttribute("username", optUN.orElse("Guest"));
        model.addAttribute("password", optPW.orElse("123"));
        return "home/showForm";
    }
}