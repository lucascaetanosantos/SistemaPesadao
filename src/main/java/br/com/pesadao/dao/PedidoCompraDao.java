/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.PedidoCompra;


/**
 * @author Lucas
 *
 */
public class PedidoCompraDao {

	public void salvar(PedidoCompra pedidocompra) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(pedidocompra);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<PedidoCompra> listarPedidoCompra() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from PedidoCompra Order By id");
		return query.getResultList();
	}
}
