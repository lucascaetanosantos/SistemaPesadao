/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.ContaReceber;


/**
 * @author Lucas
 *
 */
public class ContaReceberDao {

	public void salvar(ContaReceber contaReceber) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(contaReceber);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<ContaReceber> listarContasReceber() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from ContaReceber  Order By id");
		return query.getResultList();
	}
}
