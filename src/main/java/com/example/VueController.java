package com.example;


import java.lang.reflect.Array;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class VueController {

    private static final String template = "%s!";

    
    @RequestMapping("vue")
    public Vue[] vue(@RequestParam(value="name", defaultValue="YAKS") String name) {
        
    	
    	Vue[] v= new Vue[7];
    	
    	String[] a = new String[3];
    	a[0]= "Inventaire-msa";
    	a[1]= "Entrees de stock";
    	a[2]= "Sorties de stock";
    	
    	String[] b = new String[2];
    	b[0]= "Ecritures comptables";
    	b[1]= "Evenements";
    	
    	String[] c = new String[6];
    	c[0]= "Informations generales";
    	c[1]= "Antecedants";
    	c[2]= "Examen medical";
    	c[3]= "stomatherapeute";
    	c[4]="Documents";
    	c[5]="Suivi";
    	
    	
    	v[0] =new Vue("GESTION DE STOCK", "#/gestion-stock","gestion-stock", a);
    	v[1] =new Vue("COMPTABILITE", "#/msa-comptabilite","msa-comptabilite", b);
    	v[2] =new Vue("Patient", "#/msa-patient","msa-patient", c);
    	v[3] =new Vue("REFERENTIEL HOPITAUX", "#/referentiel-hopitaux","referentiel-hopitaux", a);
    	v[4] =new Vue("TABLEAU DE BORD", "#/tableau-bord","tableau-bord", a);
    	v[5] =new Vue("AGENDA", "#/agenda-msa","agenda-msa", a);
    	v[6] =new Vue("ADMINISTRATION", "#/msa-administration","msa-administration", a);
    	
    	return v;
    }
}