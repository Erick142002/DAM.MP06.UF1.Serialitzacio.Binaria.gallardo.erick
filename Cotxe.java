package Gallardo.Erick.dam.mp05.uf1.p02.serialitzacio.binaria.model.domain;

import java.io.Serializable;
import java.util.Objects;

public class Cotxe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String matricula;
	private String marca;
	private String model;
	private String numeroBastidor;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	@Override
	public String toString() {
		return "Cotxe [matricula=" + matricula + ", marca=" + marca + ", model=" + model + ", numeroBastidor="
				+ numeroBastidor + ", getMatricula()=" + getMatricula() + ", getMarca()=" + getMarca() + ", getModel()="
				+ getModel() + ", getNumeroBastidor()=" + getNumeroBastidor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, matricula, model, numeroBastidor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cotxe other = (Cotxe) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(matricula, other.matricula)
				&& Objects.equals(model, other.model) && Objects.equals(numeroBastidor, other.numeroBastidor);
	}

}
