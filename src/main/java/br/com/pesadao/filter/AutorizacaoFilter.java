/**
 * 
 */
package br.com.pesadao.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.pesadao.bean.LoginBean;
import br.com.pesadao.model.Usuarios;

/**
 * @author Lucas
 *
 */
@WebFilter(filterName = "LoginFilter", urlPatterns = "*.xhtml")
public class AutorizacaoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		LoginBean loginBean = (LoginBean) ((HttpServletRequest) request).getSession().getAttribute("loginBean");
		String contextPath = ((HttpServletRequest) request).getContextPath();

		HttpServletRequest req = (HttpServletRequest) request;
		String endereco = req.getRequestURI();

		if (req.getRequestURI().endsWith("/login.xhtml")) {

		} else if (loginBean == null || !loginBean.isLoggedIn()) {
			((HttpServletResponse) response).sendRedirect(contextPath + "/login.xhtml");

		} else if (loginBean.getUsuarios() == Usuarios.ATENDENTE
				&& (!(endereco.contains("venda") || endereco.contains("index") || endereco.contains("restrito")))) {
			((HttpServletResponse) response).sendRedirect(contextPath + "/acessorestrito.xhtml");

		} else if (loginBean.getUsuarios() == Usuarios.CADASTRANTE
				&& !(endereco.contains("cliente") || endereco.contains("produto") || endereco.contains("fornecedor")
						|| endereco.contains("index") || endereco.contains("restrito"))) {
			((HttpServletResponse) response).sendRedirect(contextPath + "/acessorestrito.xhtml");

		} else if (loginBean.getUsuarios() == Usuarios.COORDENADORDECOMPRA
				&& !(endereco.contains("compra") || endereco.contains("index") || endereco.contains("restrito"))) {
			((HttpServletResponse) response).sendRedirect(contextPath + "/acessorestrito.xhtml");

		} else if (loginBean.getUsuarios() == Usuarios.COORDENADORFINANCEIRO
				&& !(endereco.contains("conta") || endereco.contains("index") || endereco.contains("restrito"))) {
			((HttpServletResponse) response).sendRedirect(contextPath + "/acessorestrito.xhtml");

		}

		chain.doFilter(request, response);

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
