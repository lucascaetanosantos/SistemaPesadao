/**
 * 
 */
package br.com.pesadao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

/**
 * @author Aluno
 *
 */
@Entity
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6876859919594365877L;
	private Integer id;
	private String nomeCliente;
	private Sexo sexoCliente;
	private String idadeCliente;
	private String cpfCliente;
	private String enderecoCliente;
	private String bairroCliente;
	private String cidadeCliente;
	private Estado ufCliente;
	private String telefoneCliente;
	private String celularCliente;
	private String emailCliente;
	private Date dataCadastroCliente = new Date();
	private Date lastUpdate = new Date();
	private boolean active = true;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nomeCliente
	 * @param sexoCliente
	 * @param idadeCliente
	 * @param cpfCliente
	 * @param enderecoCliente
	 * @param bairroCliente
	 * @param cidadeCliente
	 * @param ufCliente
	 * @param telefoneCliente
	 * @param celularCliente
	 * @param emailCliente
	 * @param dataCadastroCliente
	 * @param lastUpdateCliente
	 * @param active
	 */
	public Cliente(Integer id, String nomeCliente, Sexo sexoCliente, String idadeCliente,
			String cpfCliente, String enderecoCliente, String bairroCliente, String cidadeCliente,
			Estado ufCliente, String telefoneCliente, String celularCliente, String emailCliente,
			Date dataCadastroCliente, Date lastUpdate, boolean active) {
		super();
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.sexoCliente = sexoCliente;
		this.idadeCliente = idadeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		this.bairroCliente = bairroCliente;
		this.cidadeCliente = cidadeCliente;
		this.ufCliente = ufCliente;
		this.telefoneCliente = telefoneCliente;
		this.celularCliente = celularCliente;
		this.emailCliente = emailCliente;
		this.dataCadastroCliente = dataCadastroCliente;
		this.lastUpdate = lastUpdate;
		this.active = active;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nomeCliente
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * @param nomeCliente the nomeCliente to set
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * @return the sexoCliente
	 */
	@Enumerated(EnumType.STRING)
	public Sexo getSexoCliente() {
		return sexoCliente;
	}

	/**
	 * @param sexoCliente the sexoCliente to set
	 */
	public void setSexoCliente(Sexo sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	/**
	 * @return the idadeCliente
	 */
	public String getIdadeCliente() {
		return idadeCliente;
	}

	/**
	 * @param idadeCliente the idadeCliente to set
	 */
	public void setIdadeCliente(String idadeCliente) {
		this.idadeCliente = idadeCliente;
	}

	/**
	 * @return the cpfCliente
	 */
	@CPF
	public String getCpfCliente() {
		return cpfCliente;
	}

	/**
	 * @param cpfCliente the cpfCliente to set
	 */
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	/**
	 * @return the enderecoCliente
	 */
	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	/**
	 * @param enderecoCliente the enderecoCliente to set
	 */
	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	/**
	 * @return the bairroCliente
	 */
	public String getBairroCliente() {
		return bairroCliente;
	}

	/**
	 * @param bairroCliente the bairroCliente to set
	 */
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}

	/**
	 * @return the cidadeCliente
	 */
	public String getCidadeCliente() {
		return cidadeCliente;
	}

	/**
	 * @param cidadeCliente the cidadeCliente to set
	 */
	public void setCidadeCliente(String cidadeCliente) {
		this.cidadeCliente = cidadeCliente;
	}

	/**
	 * @return the ufCliente
	 */
	public Estado getUfCliente() {
		return ufCliente;
	}

	/**
	 * @param ufCliente the ufCliente to set
	 */
	public void setUfCliente(Estado ufCliente) {
		this.ufCliente = ufCliente;
	}

	/**
	 * @return the telefoneCliente
	 */
	public String getTelefoneCliente() {
		return telefoneCliente;
	}

	/**
	 * @param telefoneCliente the telefoneCliente to set
	 */
	public void setTelefoneCliente(String telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}

	/**
	 * @return the celularCliente
	 */
	public String getCelularCliente() {
		return celularCliente;
	}

	/**
	 * @param celularCliente the celularCliente to set
	 */
	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}

	/**
	 * @return the emailCliente
	 */
	@Email
	public String getEmailCliente() {
		return emailCliente;
	}

	/**
	 * @param emailCliente the emailCliente to set
	 */
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	/**
	 * @return the dataCadastroCliente
	 */
	@Temporal(TemporalType.DATE)
	public Date getDataCadastroCliente() {
		return dataCadastroCliente;
	}

	/**
	 * @param dataCadastroCliente the dataCadastroCliente to set
	 */
	public void setDataCadastroCliente(Date dataCadastroCliente) {
		this.dataCadastroCliente = dataCadastroCliente;
	}

	/**
	 * @return the lastUpdateCliente
	 */
	@Temporal(TemporalType.DATE)
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdateCliente the lastUpdateCliente to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nomeCliente=" + nomeCliente + ", sexoCliente=" + sexoCliente + ", idadeCliente="
				+ idadeCliente + ", cpfCliente=" + cpfCliente + ", enderecoCliente=" + enderecoCliente
				+ ", bairroCliente=" + bairroCliente + ", cidadeCliente=" + cidadeCliente + ", ufCliente=" + ufCliente
				+ ", telefoneCliente=" + telefoneCliente + ", celularCliente=" + celularCliente + ", emailCliente="
				+ emailCliente + ", dataCadastroCliente=" + dataCadastroCliente + ", lastUpdateCliente="
				+ lastUpdate + ", active=" + active + "]";
	}
	
}
