
package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private void addData(Model model) {
        model.addAttribute("appName", "Product Portal");
        model.addAttribute("subject", "SOF3022 - Spring Boot MVC");
        model.addAttribute("semester", "Summer 2026");
        model.addAttribute("message",
                "Chào mừng bạn đến với hệ thống quản lý sản phẩm");
    }

    @GetMapping("/home/index")
    public String index(Model model) {
        addData(model);
        return "home/index";
    }

    @GetMapping("/home/about")
    public String about(Model model) {
        addData(model);
        return "home/about";
    }

    @GetMapping("/home/help")
    public String help(Model model) {
        addData(model);
        return "home/help";
    }
}
