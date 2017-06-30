/**
 * 
 */
package br.com.pesadao.bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pesadao.dao.FornecedorDao;
import br.com.pesadao.dao.PedidoCompraDao;
import br.com.pesadao.model.Fornecedor;
import br.com.pesadao.model.ItemCompra;
import br.com.pesadao.model.PedidoCompra;


/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class PedidoCompraBean {

	private PedidoCompra pedidoCompra = new PedidoCompra();
	private ItemCompra itemCompra = new ItemCompra();
	private List<PedidoCompra> pedidosCompra = new ArrayList<PedidoCompra>();
	private List<ItemCompra> itensCompra = new ArrayList<ItemCompra>();
	private List<Fornecedor> fornecedores;

	public PedidoCompraBean() {
		pedidosCompra = new PedidoCompraDao().listarPedidoCompra();
		fornecedores = new FornecedorDao().listarFornecedores();
	}

	public String salvar() {
		new PedidoCompraDao().salvar(pedidoCompra);
		pedidosCompra = new PedidoCompraDao().listarPedidoCompra();
		prepararModel(pedidoCompra);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pedido salvo com sucesso!! "));
		return "pedidocompralist";
	}

	public void prepararModel(PedidoCompra pedidoCompra) {
		this.pedidoCompra = pedidoCompra;
	}

	public String getDataAtual() {
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}
	
	/**
	 * @return the pedidosCompra
	 */
	public List<PedidoCompra> getPedidosCompra() {
		return pedidosCompra;
	}

	/**
	 * @param pedidosCompra the pedidosCompra to set
	 */
	public void setPedidosCompra(List<PedidoCompra> pedidosCompra) {
		this.pedidosCompra = pedidosCompra;
	}

	/**
	 * @return the itensCompra
	 */
	public List<ItemCompra> getItensCompra() {
		return itensCompra;
	}

	/**
	 * @param itensCompra the itensCompra to set
	 */
	public void setItensCompra(List<ItemCompra> itensCompra) {
		this.itensCompra = itensCompra;
	}

	/**
	 * @return the pedidoCompra
	 */
	public PedidoCompra getPedidoCompra() {
		return pedidoCompra;
	}
	/**
	 * @param pedidoCompra the pedidoCompra to set
	 */
	public void setPedidoCompra(PedidoCompra pedidoCompra) {
		this.pedidoCompra = pedidoCompra;
	}
	/**
	 * @return the itemCompra
	 */
	public ItemCompra getItemCompra() {
		return itemCompra;
	}
	/**
	 * @param itemCompra the itemCompra to set
	 */
	public void setItemCompra(ItemCompra itemCompra) {
		this.itemCompra = itemCompra;
	}
	/**
	 * @return the pedidosCompras
	 */
	public List<PedidoCompra> getPedidosCompras() {
		return pedidosCompra;
	}
	/**
	 * @param pedidosCompras the pedidosCompras to set
	 */
	public void setPedidosCompras(List<PedidoCompra> pedidosCompras) {
		this.pedidosCompra = pedidosCompras;
	}
	/**
	 * @return the itemCompras
	 */
	public List<ItemCompra> getItemCompras() {
		return itensCompra;
	}
	/**
	 * @param itemCompras the itemCompras to set
	 */
	public void setItemCompras(List<ItemCompra> itemCompras) {
		this.itensCompra = itemCompras;
	}
	/**
	 * @return the fornecedores
	 */
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	/**
	 * @param fornecedores the fornecedores to set
	 */
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
}
