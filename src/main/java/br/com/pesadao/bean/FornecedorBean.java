/**
 * 
 */
package br.com.pesadao.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pesadao.dao.FornecedorDao;
import br.com.pesadao.model.Estado;
import br.com.pesadao.model.Fornecedor;


/**
 * @author Lucas
 *
 */

@ManagedBean
@SessionScoped
public class FornecedorBean {
	
	private Fornecedor fornecedor = new Fornecedor();
	private List<Estado> estados = Arrays.asList(Estado.values());
	private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public FornecedorBean() {
		fornecedores = new FornecedorDao().listarFornecedores();
	}

	public String salvar(){
		new FornecedorDao().salvar(fornecedor);
		fornecedores = new FornecedorDao().listarFornecedores();
		fornecedor = new Fornecedor();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fornecedor cadastrado com sucesso!"));
		return "fornecedorlist";
	}

	public String editar(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
		return "fornecedorlist";
	}

	public String excluir() {
		this.fornecedor.setActive(false);
		new FornecedorDao().salvar(fornecedor);
		fornecedores = new FornecedorDao().listarFornecedores();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fornecedor excluído com sucesso!"));
		return "fornecedor";
	}
	
	public void prepararModel(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * @return the fornecedor
	 */
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	/**
	 * @param fornecedor the fornecedor to set
	 */
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	/**
	 * @return the estados
	 */
	public List<Estado> getEstados() {
		return estados;
	}

	/**
	 * @param estados the estados to set
	 */
	public void setEstados(List<Estado> estados) {
		this.estados = estados;
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
