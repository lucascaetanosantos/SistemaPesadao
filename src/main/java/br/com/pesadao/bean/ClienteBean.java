/**
 * 
 */
package br.com.pesadao.bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pesadao.dao.ClienteDao;
import br.com.pesadao.model.Cliente;
import br.com.pesadao.model.Estado;
import br.com.pesadao.model.Sexo;

/**
 * @author Lucas
 *
 */
@ManagedBean
@SessionScoped
public class ClienteBean {

	private Cliente cliente = new Cliente();
	private List<Estado> estados = Arrays.asList(Estado.values());
	private List<Sexo> sexos = Arrays.asList(Sexo.values());
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public ClienteBean() {
		// TODO Auto-generated constructor stub
		clientes = new ClienteDao().listarClientes();
	}

	public String salvar() {
		new ClienteDao().salvar(cliente);
		clientes = new ClienteDao().listarClientes();
		cliente = new Cliente();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente cadastrado com sucesso!"));
		return "cliente";
	}

	public String editar(Cliente cliente) {
		this.cliente = cliente;
		return "cliente";
	}

	public String excluir() {
		this.cliente.setActive(false);
		new ClienteDao().salvar(cliente);
		clientes = new ClienteDao().listarClientes();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente excluído com sucesso!"));
		return "cliente";
	}

	public void prepararModel(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getDataAtual() {
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}

	public void limpar(){
		this.cliente = new Cliente();
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the estados
	 */
	public List<Estado> getEstados() {
		return estados;
	}

	/**
	 * @param estados
	 *            the estados to set
	 */
	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	/**
	 * @return the sexos
	 */
	public List<Sexo> getSexos() {
		return sexos;
	}

	/**
	 * @param sexos
	 *            the sexos to set
	 */
	public void setSexos(List<Sexo> sexos) {
		this.sexos = sexos;
	}

	/**
	 * @return the clientes
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * @param clientes
	 *            the clientes to set
	 */
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
