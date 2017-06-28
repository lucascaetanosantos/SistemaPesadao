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
public class PedidoVenda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4123155329062449608L;
	private Integer id;
	private Cliente clientePedidoVenda;
	private Integer parcelaPedidoVenda;
	private Date dataCadastroPedidoVenda = new Date();

	/**
	 * 
	 */
	public PedidoVenda() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param clientePedidoVenda
	 * @param parcelaPedidoVenda
	 * @param dataCadastroPedidoVenda
	 */
	public PedidoVenda(Integer id, Cliente clientePedidoVenda, Integer parcelaPedidoVenda,
			Date dataCadastroPedidoVenda) {
		super();
		this.id = id;
		this.clientePedidoVenda = clientePedidoVenda;
		this.parcelaPedidoVenda = parcelaPedidoVenda;
		this.dataCadastroPedidoVenda = dataCadastroPedidoVenda;
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
	 * @return the clientePedidoVenda
	 */
	@ManyToOne
	@JoinColumn
	public Cliente getClientePedidoVenda() {
		return clientePedidoVenda;
	}

	/**
	 * @param clientePedidoVenda the clientePedidoVenda to set
	 */
	public void setClientePedidoVenda(Cliente clientePedidoVenda) {
		this.clientePedidoVenda = clientePedidoVenda;
	}

	/**
	 * @return the parcelaPedidoVenda
	 */
	public Integer getParcelaPedidoVenda() {
		return parcelaPedidoVenda;
	}

	/**
	 * @param parcelaPedidoVenda the parcelaPedidoVenda to set
	 */
	public void setParcelaPedidoVenda(Integer parcelaPedidoVenda) {
		this.parcelaPedidoVenda = parcelaPedidoVenda;
	}

	/**
	 * @return the dataCadastroPedidoVenda
	 */
	@Temporal(TemporalType.DATE)
	public Date getDataCadastroPedidoVenda() {
		return dataCadastroPedidoVenda;
	}

	/**
	 * @param dataCadastroPedidoVenda the dataCadastroPedidoVenda to set
	 */
	public void setDataCadastroPedidoVenda(Date dataCadastroPedidoVenda) {
		this.dataCadastroPedidoVenda = dataCadastroPedidoVenda;
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
		PedidoVenda other = (PedidoVenda) obj;
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
		return "PedidoVenda [id=" + id + ", clientePedidoVenda=" + clientePedidoVenda + ", parcelaPedidoVenda="
				+ parcelaPedidoVenda + ", dataCadastroPedidoVenda=" + dataCadastroPedidoVenda + "]";
	}
}
