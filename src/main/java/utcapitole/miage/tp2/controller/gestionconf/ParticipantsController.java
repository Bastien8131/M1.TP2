package utcapitole.miage.tp2.controller.gestionconf;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import utcapitole.miage.tp2.model.gestionconf.Participants;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/gestionconf/participants")
public class ParticipantsController {
    List<Participants> participants = new ArrayList<>();

    @PostMapping("/insert")
    public String addParticipants(@ModelAttribute Participants participant, Model model) {
        System.out.println(participant);

        for (Participants p : participants) {
            if(p.getEmailPart().equalsIgnoreCase(participant.getEmailPart())) {
                System.out.println("l'email de ce participant exist déjà");
                model.addAttribute("message", "l'email de ce participant exist déjà");
                model.addAttribute("participant", participant);
                return "redirect:/";
            }
        }

        participants.add(participant);
        model.addAttribute("message", "Compte à etais crée");
        model.addAttribute("participant", participant);
        return "redirect:/";
    }

    @GetMapping("/list")
    public String listParticipants(Model model) {
        model.addAttribute("participants", participants);
        return "gestionconf/participants/list/list";
    }
}
