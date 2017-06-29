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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Aluno
 *
 */
@Entity
public class ItemCompra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5175850452290987018L;
	private Integer id;
	private Produto produtoItemCompra;
	private PedidoCompra pedidoItemCompra;
	private Integer quantidadeItemCompra;
	private double valorItemCompra;
	private Date dataCadastroItemCompra = new Date();

	/**
	 * 
	 */
	public ItemCompra() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param produtoItemCompra
	 * @param pedidoItemCompra
	 * @param quantidadeItemCompra
	 * @param valorItemCompra
	 * @param dataCadastroItemCompra
	 */
	public ItemCompra(Integer id, Produto produtoItemCompra, PedidoCompra pedidoItemCompra,
			Integer quantidadeItemCompra, double valorItemCompra, Date dataCadastroItemCompra) {
		super();
		this.id = id;
		this.produtoItemCompra = produtoItemCompra;
		this.pedidoItemCompra = pedidoItemCompra;
		this.quantidadeItemCompra = quantidadeItemCompra;
		this.valorItemCompra = valorItemCompra;
		this.dataCadastroItemCompra = dataCadastroItemCompra;
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
	 * @return the produtoItemCompra
	 */
	@ManyToOne
	@JoinColumn
	public Produto getProdutoItemCompra() {
		return produtoItemCompra;
	}

	/**
	 * @param produtoItemCompra the produtoItemCompra to set
	 */
	public void setProdutoItemCompra(Produto produtoItemCompra) {
		this.produtoItemCompra = produtoItemCompra;
	}

	/**
	 * @return the pedidoItemCompra
	 */
	@ManyToOne
	@JoinColumn
	public PedidoCompra getPedidoItemCompra() {
		return pedidoItemCompra;
	}

	/**
	 * @param pedidoItemCompra the pedidoItemCompra to set
	 */
	public void setPedidoItemCompra(PedidoCompra pedidoItemCompra) {
		this.pedidoItemCompra = pedidoItemCompra;
	}

	/**
	 * @return the quantidadeItemCompra
	 */
	public Integer getQuantidadeItemCompra() {
		return quantidadeItemCompra;
	}

	/**
	 * @param quantidadeItemCompra the quantidadeItemCompra to set
	 */
	public void setQuantidadeItemCompra(Integer quantidadeItemCompra) {
		this.quantidadeItemCompra = quantidadeItemCompra;
	}

	/**
	 * @return the valorItemCompra
	 */
	public double getValorItemCompra() {
		return valorItemCompra;
	}

	/**
	 * @param valorItemCompra the valorItemCompra to set
	 */
	public void setValorItemCompra(double valorItemCompra) {
		this.valorItemCompra = valorItemCompra;
	}

	/**
	 * @return the dataCadastroItemCompra
	 */
	@Temporal(TemporalType.DATE)
	public Date getDataCadastroItemCompra() {
		return dataCadastroItemCompra;
	}

	/**
	 * @param dataCadastroItemCompra the dataCadastroItemCompra to set
	 */
	public void setDataCadastroItemCompra(Date dataCadastroItemCompra) {
		this.dataCadastroItemCompra = dataCadastroItemCompra;
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
		ItemCompra other = (ItemCompra) obj;
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
		return "ItemCompra [id=" + id + ", produtoItemCompra=" + produtoItemCompra + ", pedidoItemCompra="
				+ pedidoItemCompra + ", quantidadeItemCompra=" + quantidadeItemCompra + ", valorItemCompra="
				+ valorItemCompra + ", dataCadastroItemCompra=" + dataCadastroItemCompra + "]";
	}
}
