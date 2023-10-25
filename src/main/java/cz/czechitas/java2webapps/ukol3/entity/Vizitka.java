package cz.czechitas.java2webapps.ukol3.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vizitka {

    private String jmeno;
    private String firma;
    private String ulice;
    private String obecPSC;
    private String celaAdresa;
    private String email;
    private String telefon;
    private String web;

    public Vizitka() {

    }

    public Vizitka(String jmeno, String firma, String ulice, String obecPSC, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obecPSC = obecPSC;
        this.email = email;
        this.telefon = telefon;
        this.web = web;
    }

    public String getCelaAdresa() {
        return ulice + obecPSC;
    }

}
