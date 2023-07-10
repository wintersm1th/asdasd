package o.e;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    public HelloWorldController() {
        System.out.println("asdsaddd");
    }
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "mainView";
    }

    @RequestMapping("/")
    public String shit(Model model) {
        model.addAttribute("message", "Hello World!");
        return "mainView";
    }
}
