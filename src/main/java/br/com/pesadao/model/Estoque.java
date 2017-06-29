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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Aluno
 *
 */
@Entity
public class Estoque implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4191167450429854103L;
	private Integer id;
	private Produto produtoEstoque;
	private int quantidadeEstoque;
	private Date lastUpdate;
	private double totalEstoque;

	/**
	 * 
	 */
	public Estoque() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param produtoEstoque
	 * @param quantidadeEstoque
	 * @param lastUpdate
	 * @param totalEstoque
	 */
	public Estoque(Integer id, br.com.pesadao.model.Produto produtoEstoque, int quantidadeEstoque, Date lastUpdate,
			double totalEstoque) {
		super();
		this.id = id;
		this.produtoEstoque = produtoEstoque;
		this.quantidadeEstoque = quantidadeEstoque;
		this.lastUpdate = lastUpdate;
		this.totalEstoque = totalEstoque;
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
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the produtoEstoque
	 */
	@ManyToOne
	@JoinColumn
	public Produto getProdutoEstoque() {
		return produtoEstoque;
	}

	/**
	 * @param produtoEstoque
	 *            the produtoEstoque to set
	 */
	public void setProdutoEstoque(Produto produtoEstoque) {
		this.produtoEstoque = produtoEstoque;
	}

	/**
	 * @return the quantidadeEstoque
	 */
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	/**
	 * @param quantidadeEstoque
	 *            the quantidadeEstoque to set
	 */
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * @param lastUpdate
	 *            the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * @return the totalEstoque
	 */
	public double getTotalEstoque() {
		return totalEstoque;
	}

	/**
	 * @param totalEstoque
	 *            the totalEstoque to set
	 */
	public void setTotalEstoque(double totalEstoque) {
		this.totalEstoque = totalEstoque;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		Estoque other = (Estoque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Estoque [id=" + id + ", produtoEstoque=" + produtoEstoque + ", quantidadeEstoque=" + quantidadeEstoque
				+ ", lastUpdate=" + lastUpdate + ", totalEstoque=" + totalEstoque + "]";
	}

}
