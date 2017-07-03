/**
 * 
 */
package br.com.pesadao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 * @author Aluno
 *
 */
@Entity
public class Fornecedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3169248106609063597L;
	private Integer id;
	private String nomeFornecedor;
	private String fantasiaFornecedor;
	private String cnpjFornecedor;
	private Date dataCadastroFornecedor = new Date();
	private String enderecoFornecedor;
	private String bairroFornecedor;
	private String cidadeFornecedor;
	private String complementoFornecedor;
	private String telefonePrincipalFornecedor;
	private String telefoneAlternativoFornecedor;
	private String ieFornecedor;
	private String imFornecedor;
	private Date dataFundacaoFornecedor;
	private Estado ufFornecedor;
	private String emailFornecedor;
	private boolean active = true;
	private Date lastUpdate = new Date();

	/**
	 * 
	 */
	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nomeFornecedor
	 * @param fantasiaFornecedor
	 * @param cnpjFornecedor
	 * @param dataCadastroFornecedor
	 * @param enderecoFornecedor
	 * @param bairroFornecedor
	 * @param cidadeFornecedor
	 * @param complementoFornecedor
	 * @param telefonePrincipalFornecedor
	 * @param telefoneAlternativoFornecedor
	 * @param ieFornecedor
	 * @param imFornecedor
	 * @param dataFundacaoFornecedor
	 * @param ufFornecedor
	 * @param emailFornecedor
	 * @param active
	 * @param lastUpdate
	 */
	public Fornecedor(String nomeFornecedor, String fantasiaFornecedor, String cnpjFornecedor,
			Date dataCadastroFornecedor, String enderecoFornecedor, String bairroFornecedor, String cidadeFornecedor,
			String complementoFornecedor, String telefonePrincipalFornecedor, String telefoneAlternativoFornecedor,
			String ieFornecedor, String imFornecedor, Date dataFundacaoFornecedor, Estado ufFornecedor,
			String emailFornecedor) {
		super();
		this.nomeFornecedor = nomeFornecedor;
		this.fantasiaFornecedor = fantasiaFornecedor;
		this.cnpjFornecedor = cnpjFornecedor;
		this.dataCadastroFornecedor = dataCadastroFornecedor;
		this.enderecoFornecedor = enderecoFornecedor;
		this.bairroFornecedor = bairroFornecedor;
		this.cidadeFornecedor = cidadeFornecedor;
		this.complementoFornecedor = complementoFornecedor;
		this.telefonePrincipalFornecedor = telefonePrincipalFornecedor;
		this.telefoneAlternativoFornecedor = telefoneAlternativoFornecedor;
		this.ieFornecedor = ieFornecedor;
		this.imFornecedor = imFornecedor;
		this.dataFundacaoFornecedor = dataFundacaoFornecedor;
		this.ufFornecedor = ufFornecedor;
		this.emailFornecedor = emailFornecedor;
	}

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue
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
	 * @return the nomeFornecedor
	 */
	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	/**
	 * @param nomeFornecedor the nomeFornecedor to set
	 */
	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	/**
	 * @return the fantasiaFornecedor
	 */
	public String getFantasiaFornecedor() {
		return fantasiaFornecedor;
	}

	/**
	 * @param fantasiaFornecedor the fantasiaFornecedor to set
	 */
	public void setFantasiaFornecedor(String fantasiaFornecedor) {
		this.fantasiaFornecedor = fantasiaFornecedor;
	}

	/**
	 * @return the cnpjFornecedor
	 */
	@CNPJ
	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}

	/**
	 * @param cnpjFornecedor the cnpjFornecedor to set
	 */
	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
	}

	/**
	 * @return the dataCadastroFornecedor
	 */
	public Date getDataCadastroFornecedor() {
		return dataCadastroFornecedor;
	}

	/**
	 * @param dataCadastroFornecedor the dataCadastroFornecedor to set
	 */
	public void setDataCadastroFornecedor(Date dataCadastroFornecedor) {
		this.dataCadastroFornecedor = dataCadastroFornecedor;
	}

	/**
	 * @return the enderecoFornecedor
	 */
	public String getEnderecoFornecedor() {
		return enderecoFornecedor;
	}

	/**
	 * @param enderecoFornecedor the enderecoFornecedor to set
	 */
	public void setEnderecoFornecedor(String enderecoFornecedor) {
		this.enderecoFornecedor = enderecoFornecedor;
	}

	/**
	 * @return the bairroFornecedor
	 */
	public String getBairroFornecedor() {
		return bairroFornecedor;
	}

	/**
	 * @param bairroFornecedor the bairroFornecedor to set
	 */
	public void setBairroFornecedor(String bairroFornecedor) {
		this.bairroFornecedor = bairroFornecedor;
	}

	/**
	 * @return the cidadeFornecedor
	 */
	public String getCidadeFornecedor() {
		return cidadeFornecedor;
	}

	/**
	 * @param cidadeFornecedor the cidadeFornecedor to set
	 */
	public void setCidadeFornecedor(String cidadeFornecedor) {
		this.cidadeFornecedor = cidadeFornecedor;
	}

	/**
	 * @return the complementoFornecedor
	 */
	public String getComplementoFornecedor() {
		return complementoFornecedor;
	}

	/**
	 * @param complementoFornecedor the complementoFornecedor to set
	 */
	public void setComplementoFornecedor(String complementoFornecedor) {
		this.complementoFornecedor = complementoFornecedor;
	}

	/**
	 * @return the telefonePrincipalFornecedor
	 */
	public String getTelefonePrincipalFornecedor() {
		return telefonePrincipalFornecedor;
	}

	/**
	 * @param telefonePrincipalFornecedor the telefonePrincipalFornecedor to set
	 */
	public void setTelefonePrincipalFornecedor(String telefonePrincipalFornecedor) {
		this.telefonePrincipalFornecedor = telefonePrincipalFornecedor;
	}

	/**
	 * @return the telefoneAlternativoFornecedor
	 */
	public String getTelefoneAlternativoFornecedor() {
		return telefoneAlternativoFornecedor;
	}

	/**
	 * @param telefoneAlternativoFornecedor the telefoneAlternativoFornecedor to set
	 */
	public void setTelefoneAlternativoFornecedor(String telefoneAlternativoFornecedor) {
		this.telefoneAlternativoFornecedor = telefoneAlternativoFornecedor;
	}

	/**
	 * @return the ieFornecedor
	 */
	public String getIeFornecedor() {
		return ieFornecedor;
	}

	/**
	 * @param ieFornecedor the ieFornecedor to set
	 */
	public void setIeFornecedor(String ieFornecedor) {
		this.ieFornecedor = ieFornecedor;
	}

	/**
	 * @return the imFornecedor
	 */
	public String getImFornecedor() {
		return imFornecedor;
	}

	/**
	 * @param imFornecedor the imFornecedor to set
	 */
	public void setImFornecedor(String imFornecedor) {
		this.imFornecedor = imFornecedor;
	}

	/**
	 * @return the dataFundacaoFornecedor
	 */
	@Temporal(TemporalType.DATE)
	public Date getDataFundacaoFornecedor() {
		return dataFundacaoFornecedor;
	}

	/**
	 * @param dataFundacaoFornecedor the dataFundacaoFornecedor to set
	 */
	public void setDataFundacaoFornecedor(Date dataFundacaoFornecedor) {
		this.dataFundacaoFornecedor = dataFundacaoFornecedor;
	}

	/**
	 * @return the ufFornecedor
	 */
	public Estado getUfFornecedor() {
		return ufFornecedor;
	}

	/**
	 * @param ufFornecedor the ufFornecedor to set
	 */
	public void setUfFornecedor(Estado ufFornecedor) {
		this.ufFornecedor = ufFornecedor;
	}

	/**
	 * @return the emailFornecedor
	 */
	@Email
	public String getEmailFornecedor() {
		return emailFornecedor;
	}

	/**
	 * @param emailFornecedor the emailFornecedor to set
	 */
	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}

	/**
	 * @return the active
	 */
	@Column(columnDefinition = "INT DEFAULT 1")
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the lastUpdate
	 */
	@Temporal(TemporalType.DATE)
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
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
		Fornecedor other = (Fornecedor) obj;
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
		return "Fornecedor [id=" + id + ", nomeFornecedor=" + nomeFornecedor + ", fantasiaFornecedor="
				+ fantasiaFornecedor + ", cnpjFornecedor=" + cnpjFornecedor + ", dataCadastroFornecedor="
				+ dataCadastroFornecedor + ", enderecoFornecedor=" + enderecoFornecedor + ", bairroFornecedor="
				+ bairroFornecedor + ", cidadeFornecedor=" + cidadeFornecedor + ", complementoFornecedor="
				+ complementoFornecedor + ", telefonePrincipalFornecedor=" + telefonePrincipalFornecedor
				+ ", telefoneAlternativoFornecedor=" + telefoneAlternativoFornecedor + ", ieFornecedor=" + ieFornecedor
				+ ", imFornecedor=" + imFornecedor + ", dataFundacaoFornecedor=" + dataFundacaoFornecedor
				+ ", ufFornecedor=" + ufFornecedor + ", emailFornecedor=" + emailFornecedor + ", active=" + active
				+ ", lastUpdate=" + lastUpdate + "]";
	}
}
