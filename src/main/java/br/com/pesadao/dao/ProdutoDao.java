/**
 * 
 */
package br.com.pesadao.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.pesadao.model.Produto;

/**
 * @author Lucas
 *
 */
public class ProdutoDao {
	
	public void salvar(Produto produto){
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(produto);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	@SuppressWarnings("unchecked")
	public List<Produto> listarProdutos(){
		EntityManager entityManager = JPAUtil.getEntityManager();
		Query query = entityManager.createQuery("from Produto Order By descricaoProduto Where status=1");
		return query.getResultList();
	}

}
