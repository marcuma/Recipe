package guru.springframework.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "index.html"})
    public String getIndexPage(Model model) {
        model.addAttribute("title", "Index Page");
        return "index";
    }
}
