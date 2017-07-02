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
public class PedidoCompra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1401222025226149853L;
	private Integer id;
	private Fornecedor fornecedorPedidoCompra;
	private Integer parcelaPedidoCompra;
	private Date dataCadastroPedidoCompra = new Date();

	/**
	 * 
	 */
	public PedidoCompra() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param fornecedorPedidoCompra
	 * @param parcelaPedidoCompra
	 * @param dataCadastroPedidoCompra
	 */
	public PedidoCompra(Integer id, Fornecedor fornecedorPedidoCompra, Integer parcelaPedidoCompra,
			Date dataCadastroPedidoCompra) {
		super();
		this.id = id;
		this.fornecedorPedidoCompra = fornecedorPedidoCompra;
		this.parcelaPedidoCompra = parcelaPedidoCompra;
		this.dataCadastroPedidoCompra = dataCadastroPedidoCompra;
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
	 * @return the fornecedorPedidoCompra
	 */
	@ManyToOne
	@JoinColumn
	public Fornecedor getFornecedorPedidoCompra() {
		return fornecedorPedidoCompra;
	}

	/**
	 * @param fornecedorPedidoCompra
	 *            the fornecedorPedidoCompra to set
	 */
	public void setFornecedorPedidoCompra(Fornecedor fornecedorPedidoCompra) {
		this.fornecedorPedidoCompra = fornecedorPedidoCompra;
	}

	/**
	 * @return the parcelaPedidoCompra
	 */
	public Integer getParcelaPedidoCompra() {
		return parcelaPedidoCompra;
	}

	/**
	 * @param parcelaPedidoCompra
	 *            the parcelaPedidoCompra to set
	 */
	public void setParcelaPedidoCompra(Integer parcelaPedidoCompra) {
		this.parcelaPedidoCompra = parcelaPedidoCompra;
	}

	/**
	 * @return the dataCadastroPedidoCompra
	 */
	@Temporal(TemporalType.DATE)
	public Date getDataCadastroPedidoCompra() {
		return dataCadastroPedidoCompra;
	}

	/**
	 * @param dataCadastroPedidoCompra
	 *            the dataCadastroPedidoCompra to set
	 */
	public void setDataCadastroPedidoCompra(Date dataCadastroPedidoCompra) {
		this.dataCadastroPedidoCompra = dataCadastroPedidoCompra;
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
		PedidoCompra other = (PedidoCompra) obj;
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
		return "PedidoCompra [id=" + id + ", fornecedorPedidoCompra=" + fornecedorPedidoCompra
				+ ", parcelaPedidoCompra=" + parcelaPedidoCompra + ", dataCadastroPedidoCompra="
				+ dataCadastroPedidoCompra + "]";
	}
}
