package it.epicode.be.segreteria.model;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Corso {

	private String codice;
	@NotEmpty(message = "Inserire la meteria")
	private String materia;
	@NotEmpty(message = "Inserire l'indirizzo")
	private String indirizzo;
	@Min(10)
	private Integer numeroEsami;

}
