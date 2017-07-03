package br.com.pesadao.util;

import javax.persistence.EntityManager;

import br.com.pesadao.dao.JPAUtil;
import br.com.pesadao.model.Produto;

public class PopulaProduto {
	
	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

		Produto produto1 = new Produto("Tęnis", "Nike", "Plástico", "Vermelho");
		Produto produto2 = new Produto("Short", "Lacoste", "Algodăo", "Laranja");
		Produto produto3 = new Produto("Camiseta", "Ellus", "Couro", "Amarelo");
		Produto produto4 = new Produto("Moletom", "Mormaii", "Polipropileno", "Verde");
		Produto produto5 = new Produto("Calça", "Adidas", "Malha", "Azul");
		Produto produto6 = new Produto("Bermuda", "Hering", "Algodăo", "Roxo");
		Produto produto7 = new Produto("Camisa", "Obey", "Malha", "Verde");
		Produto produto8 = new Produto("Jaqueta", "Hollister", "Couro", "Preto");
		Produto produto9 = new Produto("Suéter", "Gap", "Polipropileno", "Azul");
		Produto produto10 = new Produto("Boné", "Puma", "Plástico", "Preto");
		
		em.persist(produto1);
		em.persist(produto2);
		em.persist(produto3);
		em.persist(produto4);
		em.persist(produto5);
		em.persist(produto6);
		em.persist(produto7);
		em.persist(produto8);
		em.persist(produto9);
		em.persist(produto10);

		em.getTransaction().commit();
		em.close();
	}
}
