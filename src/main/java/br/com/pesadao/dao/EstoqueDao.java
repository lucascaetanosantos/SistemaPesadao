/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.Estoque;


/**
 * @author Lucas
 *
 */
public class EstoqueDao {

	@SuppressWarnings("unchecked")
	public List<Estoque> listarEstoque() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Estoque Order By lastUpdate");
		return query.getResultList();
	}
}
