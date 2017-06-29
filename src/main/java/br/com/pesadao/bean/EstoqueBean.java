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

import br.com.pesadao.dao.EstoqueDao;
import br.com.pesadao.model.Estoque;
import br.com.pesadao.relatorio.ReportFactory;


/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class EstoqueBean {
	
	private List<Estoque> listEstoque = new ArrayList<>();

	public EstoqueBean() {
		listEstoque = new EstoqueDao().listarEstoque();
	}

	public void getRelatorio() {
		ReportFactory report = new ReportFactory();
		if (listEstoque.size() > 0) {
			report.getRelatorio("estoque");
		}else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Não há registros!"));
		}
	}

	public List<Estoque> getListEstoque() {
		return listEstoque;
	}

	public void setListEstoque(List<Estoque> listEstoque) {
		this.listEstoque = listEstoque;
	}

}
