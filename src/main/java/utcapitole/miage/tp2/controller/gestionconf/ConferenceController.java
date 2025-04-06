package utcapitole.miage.tp2.controller.gestionconf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import utcapitole.miage.tp2.model.gestionconf.Conferences;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/gestionconf/conference")
public class ConferenceController {
    List<Conferences> conferences = new ArrayList<>();

    @RequestMapping("/insert")
    public String addConference(Conferences conference) {
        System.out.println(conference);
        conferences.add(conference);
        return "redirect:/";
    }

    @RequestMapping("/list")
    public String listConferences() {
        return "gestionconf/conference/list/list";
    }
}
