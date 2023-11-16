package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

    private final List<Vizitka> seznamKontaktu = List.of(
            new Vizitka("Lenka Grygarová", "Navínko,s.r.o.", "Francouzská 6019/65", "708 00 Ostrava", "lenka@navinko.cz", "+420 733 504 367", "https://www.navinko.cz/"),
            new Vizitka("Rudolf Galia", "PARTYSTANY Ostrava", "Mlýnská 1694/11", "702 00 Ostrava", "info@partystanyostrava.cz", null, null),
            new Vizitka("David Valíček", "FOOD ATELIER", "Staříč 13", "739 43 Staříč", "info@foodatelier.cz", " +420 602 775 857", "https://www.foodatelier.cz/"),
            new Vizitka("Zuzana Mánková", "Tietoevry Czechia s.r.o.", "nám. Biskupa Bruna 3399/5", "70200 Ostrava", null, null, "https://www.tietoevry.com/cz/"),
            new Vizitka("Martin Wanke", "AT Computers", "Těšínská 1970/56", "710 00 Ostrava", "obchod@atcomp.cz", null, null)

    );

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView modelAndView = new ModelAndView("seznam");
        modelAndView.addObject("seznamKontaktu", seznamKontaktu);
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("detail");
        modelAndView.addObject("vizitka", seznamKontaktu.get(id));
        return modelAndView;
    }
}
