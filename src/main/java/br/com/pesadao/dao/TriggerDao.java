package br.com.pesadao.dao;

public class TriggerDao {

	public void triggerProdutoEstoque() {
		String produtoEstoque = "CREATE TRIGGER produto_estoque AFTER INSERT"
				+ "ON PRODUTO FOR EACH ROW"
				+ "INSERT INTO ESTOQUE(estoque.est_descricao, estoque.est_produto)"
				+ "VALUES(produto.pro_nome, produto.pro_id);";
	}

}
