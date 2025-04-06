package utcapitole.miage.tp2.controller.math;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/math")
public class MathController {

    @GetMapping("")
    public String math() {
        return "math/index";
    }

    @GetMapping("/calc")
    public String calc(
            @RequestParam("inf") int inf,
            @RequestParam("sup") int sup,
            Model model) {
        System.out.println(inf + " _ " + sup);
        List<Integer> rs = new ArrayList<>();
        for (int i = inf; i < sup; i++) {
            rs.add(i);
        }


        model.addAttribute("rs", rs);

        return "math/index";
    }


}
