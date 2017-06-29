/**
 * 
 */
package br.com.pesadao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Aluno
 *
 */
@Entity
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2772573434436068129L;
	private Integer id;
	private Date cadastroProduto = new Date();
	private String descricaoProduto;
	private String marcaProduto;
	private String composicaoProduto;
	private String corProduto;
	private boolean active = true;
	private Date lastUpdate = new Date();

	/**
	 * 
	 */
	public Produto() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param cadastroProduto
	 * @param descricaoProduto
	 * @param marcaProduto
	 * @param composicaoProduto
	 * @param corProduto
	 * @param status
	 * @param lastUpdate
	 */
	public Produto(Integer id, Date cadastroProduto, String descricaoProduto, String marcaProduto,
			String composicaoProduto, String corProduto, boolean active, Date lastUpdate) {
		super();
		this.id = id;
		this.cadastroProduto = cadastroProduto;
		this.descricaoProduto = descricaoProduto;
		this.marcaProduto = marcaProduto;
		this.composicaoProduto = composicaoProduto;
		this.corProduto = corProduto;
		this.active = active;
		this.lastUpdate = lastUpdate;
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
	 * @return the cadastroProduto
	 */
	@Temporal(TemporalType.DATE)
	public Date getCadastroProduto() {
		return cadastroProduto;
	}

	/**
	 * @param cadastroProduto the cadastroProduto to set
	 */
	public void setCadastroProduto(Date cadastroProduto) {
		this.cadastroProduto = cadastroProduto;
	}

	/**
	 * @return the descricaoProduto
	 */
	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	/**
	 * @param descricaoProduto the descricaoProduto to set
	 */
	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	/**
	 * @return the marcaProduto
	 */
	public String getMarcaProduto() {
		return marcaProduto;
	}

	/**
	 * @param marcaProduto the marcaProduto to set
	 */
	public void setMarcaProduto(String marcaProduto) {
		this.marcaProduto = marcaProduto;
	}

	/**
	 * @return the composicaoProduto
	 */
	public String getComposicaoProduto() {
		return composicaoProduto;
	}

	/**
	 * @param composicaoProduto the composicaoProduto to set
	 */
	public void setComposicaoProduto(String composicaoProduto) {
		this.composicaoProduto = composicaoProduto;
	}

	/**
	 * @return the corProduto
	 */
	public String getCorProduto() {
		return corProduto;
	}

	/**
	 * @param corProduto the corProduto to set
	 */
	public void setCorProduto(String corProduto) {
		this.corProduto = corProduto;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param status the status to set
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
		Produto other = (Produto) obj;
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
		return "Produto [id=" + id + ", cadastroProduto=" + cadastroProduto + ", descricaoProduto=" + descricaoProduto
				+ ", marcaProduto=" + marcaProduto + ", composicaoProduto=" + composicaoProduto + ", corProduto="
				+ corProduto + ", active=" + active + ", lastUpdate=" + lastUpdate + "]";
	}
}
