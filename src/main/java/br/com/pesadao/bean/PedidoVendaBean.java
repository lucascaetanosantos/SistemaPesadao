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

import br.com.pesadao.dao.ClienteDao;
import br.com.pesadao.dao.PedidoVendaDao;
import br.com.pesadao.model.Cliente;
import br.com.pesadao.model.ItemVenda;
import br.com.pesadao.model.PedidoVenda;


/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class PedidoVendaBean {

	private PedidoVenda pedidoVenda = new PedidoVenda();
	private ItemVenda itemVenda = new ItemVenda();
	private List<PedidoVenda> pedidosVenda = new ArrayList<PedidoVenda>();
	private List<ItemVenda> itensVenda = new ArrayList<ItemVenda>();
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private PedidoVenda ultimoPedido;

	public PedidoVendaBean() {
		pedidosVenda = new PedidoVendaDao().listarPedidosVenda();
		clientes = new ClienteDao().listarClientes();
	}

	public String salvar() {
		new PedidoVendaDao().salvar(pedidoVenda);
		pedidosVenda = new PedidoVendaDao().listarPedidosVenda();
		prepararModel(pedidoVenda);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pedido cadastrado com sucesso!! "));
		return "pedidovenda";

	}
	
	public void prepararModel(PedidoVenda pedidoVenda) {
		this.pedidoVenda = pedidoVenda;
	}

	public String getDataAtual() {
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}
	
	public void resgataUltimoRegistro(){
		for(PedidoVenda ped : pedidosVenda){
			setUltimoPedido(ped);
		}
	}
	
	public PedidoVenda getUltimoPedido() {
		return ultimoPedido;
	}
	
	public void setUltimoPedido(PedidoVenda ultimoPedido) {
		this.ultimoPedido = ultimoPedido;
	}

	/**
	 * @return the pedidoVenda
	 */
	public PedidoVenda getPedidoVenda() {
		return pedidoVenda;
	}

	/**
	 * @param pedidoVenda the pedidoVenda to set
	 */
	public void setPedidoVenda(PedidoVenda pedidoVenda) {
		this.pedidoVenda = pedidoVenda;
	}

	/**
	 * @return the itemVenda
	 */
	public ItemVenda getItemVenda() {
		return itemVenda;
	}

	/**
	 * @param itemVenda the itemVenda to set
	 */
	public void setItemVenda(ItemVenda itemVenda) {
		this.itemVenda = itemVenda;
	}

	/**
	 * @return the pedidosVenda
	 */
	public List<PedidoVenda> getPedidosVenda() {
		return pedidosVenda;
	}

	/**
	 * @param pedidosVenda the pedidosVenda to set
	 */
	public void setPedidosVenda(List<PedidoVenda> pedidosVenda) {
		this.pedidosVenda = pedidosVenda;
	}

	/**
	 * @return the itensVenda
	 */
	public List<ItemVenda> getItensVenda() {
		return itensVenda;
	}

	/**
	 * @param itensVenda the itensVenda to set
	 */
	public void setItensVenda(List<ItemVenda> itensVenda) {
		this.itensVenda = itensVenda;
	}

	/**
	 * @return the clientes
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * @param clientes the clientes to set
	 */
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

}
