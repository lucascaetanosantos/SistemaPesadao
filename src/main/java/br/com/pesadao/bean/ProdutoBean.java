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

import br.com.pesadao.dao.ProdutoDao;
import br.com.pesadao.model.Produto;


/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class ProdutoBean {
	private Produto produto = new Produto();
	private List<Produto> produtos = new ArrayList<Produto>();

	
	public ProdutoBean(){
		// TODO Auto-generated constructor stub
		produtos = new ProdutoDao().listarProdutos();
	}
	
	public String salvar(){
		new ProdutoDao().salvar(produto);
		produtos = new ProdutoDao().listarProdutos();
		produto = new Produto();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Produto cadastrado com sucesso!"));
		return "produtolist";
	}
	
	public String editar(Produto produto){
		this.produto = produto;
		return "produtocad?faces-redirect=true";
	}
	
	public String excluir() {
		this.produto.setActive(false);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Produto excluído com sucesso!"));
		return "produtolist";
	}

	public void prepararModel(Produto produto) {
		this.produto = produto;
	}

	/**
	 * @return the produto
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
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
}
