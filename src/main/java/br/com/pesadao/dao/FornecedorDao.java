/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.Fornecedor;

/**
 * @author Lucas
 *
 */
public class FornecedorDao {

	public void salvar(Fornecedor fornecedor) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(fornecedor);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Fornecedor> listarFornecedores() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Fornecedor where active='1' Order By id");
		return query.getResultList();
	}

}
