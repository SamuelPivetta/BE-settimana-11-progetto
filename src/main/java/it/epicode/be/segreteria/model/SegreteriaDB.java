package it.epicode.be.segreteria.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SegreteriaDB {

	private Map<String, Studente> studenti = new HashMap<String, Studente>();
	private Map <String,Corso> corsi = new HashMap<String, Corso>();
	
	
	public void aggiungiStudente(Studente studente) {
		//fare controllo poi
		
	
		studenti.put(studente.getMatricola(), studente);
		
	}
	
	public void aggiungiCorso(Corso corso) {
		corsi.put(corso.getCodice(), corso);
	}
	public void cancellaCorso(String codice) {
		studenti.remove(codice);
		
	}
	
	public void cancellaStudente(String matricola) {
		studenti.remove(matricola);
		
	}
	
 
	public Collection<Studente> getAllStudenti(){
		return studenti.values();
	}
	
	public Collection<Corso> getAllCorsi(){
		List<Corso> corsi = new ArrayList<Corso>();
		Corso c1 = new Corso("C11234","Storia Contemporanea","Filosofia",12);
		Corso c2 = new Corso("B12567","Chirurgia","Medicina",15);
		Corso c3 = new Corso("C11234","Grammatica latina","Lettere",10);
		corsi.add(c1);
		corsi.add(c2);
		corsi.add(c3);
		return corsi;
		
	}
	

}
