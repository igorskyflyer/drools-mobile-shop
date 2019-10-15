package com.sample;

import java.awt.Desktop;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.compiler.PackageBuilder;
import org.drools.rule.Package;
import org.goodoldai.jeff.wizard.JEFFWizard;

public class DroolsTest {

    public static final void main(String[] args) {
        try {
        	
        	//Ucitavanje baze znanja
            RuleBase ruleBase = readRules();
            
            //Kreiranje radne memorije
            WorkingMemory workingMemory = ruleBase.newStatefulSession();
            
            //Kreiranje instance mehanizma za objasnjavanje
            JEFFWizard ef = new JEFFWizard();
            ef.setInternationalization(false);
            //Postavljanje naslova objasnjenja i kreiranje praznog objasnjenja
            
            
            //Kreiranje cinjenica
            Mobilni mob = new Mobilni();
            mob.setUkljucujeSe("Da");
            mob.setRestartujeSe("Ne");
            mob.setDetektujeSDkarticu("Ne");
            //Pravila
            //Unosenje cinjenica u radnu memoriju
            workingMemory.insert(mob);
            
            //Unosenje instance mehanizma za objasnjavanje u radnu memoriju kao globalne promenljive
            workingMemory.setGlobal("ef", ef);
            
            //Pokretanje ES
            workingMemory.fireAllRules();   
            
            //Ispisivanje rezultata
            System.out.println(mob);
            
            //Pravljenje PDF fajla koji sadrzi objasnjenje i njegovo prikazivanje
            ef.generatePDFReport("Objasnjenje.pdf",false);
            if (Desktop.isDesktopSupported())
            	java.awt.Desktop.getDesktop().browse(java.net.URI.create((new java.io.File("Objasnjenje.pdf").toURI().toString())));
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

 	private static RuleBase readRules() throws Exception {
		//Ucitavanje pravila iz fajla
		Reader source = new InputStreamReader( DroolsTest.class.getResourceAsStream( "/KvaroviMobilnihTelefona.drl" ) );
		
		//Kreiranje paketa koji sadrzi sva pravila
		PackageBuilder builder = new PackageBuilder();
		
		builder.addPackageFromDrl( source );
		
		Package pkg = builder.getPackage();
		
		//Kreiranje baze znanja i dodavanje paketa u nju
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage( pkg );
		return ruleBase;
	}
	
}
