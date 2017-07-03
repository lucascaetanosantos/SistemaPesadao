/**
 * 
 */
package br.com.pesadao.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pesadao.dao.ItemVendaDao;
import br.com.pesadao.dao.ProdutoDao;
import br.com.pesadao.model.ItemVenda;
import br.com.pesadao.model.Produto;

/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class ItemVendaBean {
	private ItemVenda itemVenda = new ItemVenda();
	private List<ItemVenda> itensVenda = new ArrayList<ItemVenda>();
	private List<Produto> produtos;

	private PedidoVendaBean pedidoVendaBean;

	public ItemVendaBean() {
		produtos = new ProdutoDao().listarProdutos();
	}

	public String salvar() {
		new ItemVendaDao().salvar(itemVenda);
		itensVenda = new ItemVendaDao().listarItensVenda(itemVenda.getPedidoItemVenda().getId());
		itemVenda = new ItemVenda();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item salvo com sucesso!"));
		return "venda";
	}
	
	public void excluir() {
		new ItemVendaDao().excluir(itemVenda);
		produtos = new ProdutoDao().listarProdutos();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item excluído com sucesso!"));
		itensVenda = new ItemVendaDao().listarItensVenda(itemVenda.getPedidoItemVenda().getId());
	}

	public void prepararModel(ItemVenda itemVenda) {
		this.itemVenda = itemVenda;
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
	 * @return the produtos
	 */
	public List<Produto> getProdutos() {
		return produtos;
	}

	/**
	 * @param produtos the produtos to set
	 */
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	/**
	 * @return the pedidoVendaBean
	 */
	public PedidoVendaBean getPedidoVendaBean() {
		return pedidoVendaBean;
	}

	/**
	 * @param pedidoVendaBean the pedidoVendaBean to set
	 */
	public void setPedidoVendaBean(PedidoVendaBean pedidoVendaBean) {
		this.pedidoVendaBean = pedidoVendaBean;
	}
}
