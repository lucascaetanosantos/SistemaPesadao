/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.Cliente;


/**
 * @author Lucas
 *
 */
public class ClienteDao {
	
	public void salvar(Cliente cliente) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> listarClientes() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Cliente where active='1' Order By nomeCliente");
		return query.getResultList();
	}

	public Cliente porId(Integer id) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		return entityManager.find(Cliente.class, id);
	}

}
