package utcapitole.miage.tp2.controller.gestionconf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticController {

    @RequestMapping("")
    public String index() {
        return "redirect:/index.html";
    }

    @RequestMapping("/gestionconf/participants/form")
    public String gestionconf() {
        return "redirect:/gestionconf/participants/insert/insert.html";
    }

}
