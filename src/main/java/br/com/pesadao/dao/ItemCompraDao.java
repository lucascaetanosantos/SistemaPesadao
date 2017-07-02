/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.ItemCompra;


/**
 * @author Lucas
 *
 */
public class ItemCompraDao {

	public void salvar(ItemCompra itemcompra) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(itemcompra);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unchecked")
	public List<ItemCompra> listarItensCompra(int pedidoCompra) {
		EntityManager entityManager = JPAUtil.getEntityManager();
<<<<<<< HEAD
		Query query = entityManager.createQuery("from ItemCompra where pedidoItemCompra_id="+pedidoCompra);
=======
		Query query = entityManager.createQuery("from ItemCompra where pedidoItemCompra= :pedido  Order By id");
		query.setParameter("pedido", pedidoCompra);
>>>>>>> branch 'master' of https://github.com/lucascaetanosantos/SistemaPesadao.git
		return query.getResultList();
	}
	
	public void excluir(ItemCompra itemcompra) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		itemcompra = entityManager.merge(itemcompra);
		entityManager.remove(itemcompra);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
