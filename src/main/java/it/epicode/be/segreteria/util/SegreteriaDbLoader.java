package it.epicode.be.segreteria.util;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.epicode.be.segreteria.model.Corso;
import it.epicode.be.segreteria.model.SegreteriaDB;
import it.epicode.be.segreteria.model.Studente;

@Component
public class SegreteriaDbLoader implements CommandLineRunner  {

	@Autowired
	ApplicationContext ctx;
	
	
	@Override
	public void run(String... args) throws Exception {
		SegreteriaDB segreteriaDB = ctx.getBean(SegreteriaDB.class);
		valorizzaDb(segreteriaDB);
	}
	
	private void valorizzaDb(SegreteriaDB segreteriaDB) {
		Corso c1 = new Corso("C11234","Storia Contemporanea","Filosofia",12);
		Corso c2 = new Corso("B12567","Chirurgia","Medicina",15);
		Corso c3 = new Corso("C11234","Grammatica latina","Lettere",10);
		
		Studente s1 = new Studente("AA952","Alessio","Giovannini",LocalDate.parse("1991-05-22"),"AleGio@hotmail.it","Bologna",c1);
		Studente s2 = new Studente("BB783","Andrea","Rovigno",LocalDate.parse("1995-12-12"),"AndreRovi@hotmail.it","Milano",c2);
		Studente s3 = new Studente("CC589","Matteo","Silvestri",LocalDate.parse("1996-08-10"),"MatteSilv@hotmail.it","Bolzano",c3); 
		
		
		segreteriaDB.aggiungiStudente(s1);
		segreteriaDB.aggiungiStudente(s2);
		segreteriaDB.aggiungiStudente(s3);
		
	}

}
