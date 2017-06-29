package br.com.pesadao.dao;

import javax.persistence.EntityManager;

public class TriggerDao {

	String trigger;

	public void triggerProdutoEstoque() {
		trigger = "CREATE TRIGGER PRODUTO_ESTOQUE AFTER INSERT ON PRODUTO FOR EACH ROW "
				+ "INSERT INTO ESTOQUE(estoque.est_descricao, estoque.est_produto) "
				+ "VALUES(produto.pro_nome, produto.pro_id);";

		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(trigger);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void triggerPedidoVenda() {
		trigger = "CREATE TRIGGER PEDIDOVENDA_CONTASRECEBER AFTER INSERT ON PEDIDOVENDA FOR EACH ROW "
				+ "INSERT INTO CONTASRECEBER(contasreceber.rec_pedidoVenda)" + "VALUES (pedidovenda.ven_id);";
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(trigger);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void triggerPedidoCompra() {
		trigger = "CREATE TRIGGER PEDIDOCOMPRA_CONTASPAGAR AFTER INSERT ON PEDIDOVENDA FOR EACH ROW"
				+ "DECLARE contador TINYINT DEFAULT 0;" + " WHILE contador < pedidovenda.pec_parcelaPedido DO"
				+ "INSERT INTO contaspagar(contaspagar.pag_pedidoCompra, contaspagar.pag_parcela)"
				+ "VALUES (pedidovenda.pec_id, pedidovenda.pec_parcelaPedido)	SET contador = contador + 1;"
				+ "END WHILE;";
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(trigger);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void triggerItemVenda() {
		trigger = "CREATE TRIGGER ITEMVENDA_CONTASRECEBER AFTER INSERT ON ITEMVENDA FOR EACH ROW"
				+ "UPDATE contasreceber SET contasreceber.rec_valor = contasreceber.rec_valor + "
				+ "(itemvenda.itv_qtde * itemvenda.itv_valorUnitario) "
				+ "WHERE contasreceber.rec_pedidoVenda = new.itv_pedidoVenda;"
				+ "UPDATE estoque SET estoque.est_qtde = estoque.est_qtde - itemvenda.itv_qtde,"
				+ "estoque.est_valorTotal = estoque.est_valorTotal - (itemvenda.itv_valorUnitario * itemvenda.itv_qtde)"
				+ "WHERE estoque.est_produto = itemvenda.itv_produto;";
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(trigger);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void triggerItemCompra() {
		trigger = "CREATE TRIGGER ITEMCOMPRA_CONTASPAGAR AFTER INSERT" + "ON ITEMCOMPRA FOR EACH ROW"
				+ "UPDATE contaspagar SET contaspagar.pag_valorTotal = contaspagar.pag_valorTotal +"
				+ "((NEW.itc_quantidade * itemcompra.itc_valorUnitarioCompra) / contaspagar.pag_parcela)"
				+ "WHERE contaspagar.pag_pedidoCompra = itemcompra.itc_pedido;"
				+ "UPDATE estoque SET estoque.est_qtde = estoque.est_qtde + itemcompra.itc_quantidade,"
				+ "estoque.est_valorTotal = estoque.est_valorTotal + (itemcompra.itc_valorUnitarioCompra * itemcompra.itc_quantidade)"
				+ "WHERE estoque.est_produto = itemcompra.itc_produto;";
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(trigger);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
