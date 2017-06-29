/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.ContaPagar;

/**
 * @author Lucas
 *
 */
public class ContaPagarDao {

	public void salvar(ContaPagar contaPagar) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(contaPagar);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<ContaPagar> listarContasPagar() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from ContaPagar  Order By id");
		return query.getResultList();
	}
}
