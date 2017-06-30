package br.com.pesadao.bean;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.com.pesadao.model.Usuario;
import br.com.pesadao.model.Usuarios;


@ManagedBean
@SessionScoped
public class LoginBean {

	private br.com.pesadao.model.Usuario usuario = new Usuario();

	private String nomeUsuario;
	private String senha;
	private boolean loggedIn;
	private Usuarios usuarios;

	public String logar() {

		FacesContext context = FacesContext.getCurrentInstance();

		if ("gerente".equals(nomeUsuario) && "123".equals(senha)) {
			this.usuarios = Usuarios.GERENTE;
			return prepararAcesso();

		} else if ("coordenadorCompra".equals(nomeUsuario) && "123".equals(senha)) {
			this.usuarios = Usuarios.COORDENADORDECOMPRA;
			return prepararAcesso();

		} else if ("coordenadorFinanceiro".equals(nomeUsuario) && "123".equals(senha)) {
			this.usuarios = Usuarios.COORDENADORFINANCEIRO;
			return prepararAcesso();

		} else if ("cadastrante".equals(nomeUsuario) && "123".equals(senha)) {
			this.usuarios = Usuarios.CADASTRANTE;
			return prepararAcesso();

		} else if ("atendente".equals(nomeUsuario) && "123".equals(senha)) {
			this.usuarios = Usuarios.ATENDENTE;
			return prepararAcesso();

		} else {
			FacesMessage menssagem = new FacesMessage("Usuário ou senha inválidos!");
			menssagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, menssagem);
		}

		return null;
	}

	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login?faces-redirect=true";
	}

	public String prepararAcesso() {
		this.usuario.setNome(this.nomeUsuario);
		this.usuario.setDataLogin(new Date());
		this.loggedIn = true;
		return "produto?faces-redirect=true";
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Usuarios getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}