package br.com.pesadao.model;

public enum Sexo {

	MASCULINO("Masculino", "M"), 
	FEMININO("Feminino", "F");

	private String label;
	private String abrev;

	private Sexo(String label,String abrev){
		this.label=label;
		this.abrev=abrev;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAbrev() {
		return abrev;
	}

	public void setAbrev(String abrev) {
		this.abrev = abrev;
	}

}
