/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.PedidoVenda;


/**
 * @author Lucas
 *
 */
public class PedidoVendaDao {

	public void salvar(PedidoVenda pedidoVenda) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(pedidoVenda);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<PedidoVenda> listarPedidosVenda() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from PedidoVenda Order By id");
		return query.getResultList();
	}
	
}
