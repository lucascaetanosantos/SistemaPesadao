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

import br.com.pesadao.dao.ContaReceberDao;
import br.com.pesadao.model.ContaReceber;


/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class ContaReceberBean {
	
	private ContaReceber contaReceber = new ContaReceber();
	private List<ContaReceber> contasReceber = new ArrayList<ContaReceber>();

	public ContaReceberBean() {
		contasReceber = new ContaReceberDao().listarContasReceber();
	}

	public String salvar() {
		new ContaReceberDao().salvar(contaReceber);
		contasReceber = new ContaReceberDao().listarContasReceber();
		contaReceber = new ContaReceber();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Conta a pagar cadastrada com sucesso!"));
		return "contaspagarlist?faces-redirect=true";
	}

	/**
	 * @return the contaReceber
	 */
	public ContaReceber getContaReceber() {
		return contaReceber;
	}

	/**
	 * @param contaReceber the contaReceber to set
	 */
	public void setContaReceber(ContaReceber contaReceber) {
		this.contaReceber = contaReceber;
	}

	/**
	 * @return the contasReceber
	 */
	public List<ContaReceber> getContasReceber() {
		return contasReceber;
	}

	/**
	 * @param contasReceber the contasReceber to set
	 */
	public void setContasReceber(List<ContaReceber> contasReceber) {
		this.contasReceber = contasReceber;
	}
}
