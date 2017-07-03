package br.com.pesadao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Triggers {
	
	public static void main(String[] args) {
		preparaBanco();
	}

	private static String sql = "CREATE TRIGGER PRODUTO_ESTOQUE AFTER INSERT ON PRODUTO FOR EACH ROW "
			+ " INSERT INTO ESTOQUE(ESTOQUE.produtoEstoque_id) VALUES(NEW.id);"
			
			+ " CREATE TRIGGER ITEMCOMPRA_CONTAPAGAR AFTER INSERT ON ITEMCOMPRA FOR EACH ROW "
			+ " UPDATE contapagar SET contapagar.valorContaPagar = contapagar.valorContaPagar +"
			+ " (NEW.quantidadeItemCompra * NEW.valorItemCompra)"
			+ " WHERE contapagar.pedidoContaPagar_id = NEW.pedidoItemCompra_id;"

			+ " CREATE TRIGGER ITEMCOMPRA_ESTOQUE AFTER INSERT ON ITEMCOMPRA FOR EACH ROW"
			+ " UPDATE ESTOQUE SET estoque.quantidadeEstoque = ESTOQUE.quantidadeEstoque +"
			+ " NEW.quantidadeItemCompra, ESTOQUE.totalEstoque = ESTOQUE.totalEstoque +"
			+ " (NEW.quantidadeItemCompra * NEW.valorItemCompra)"
			+ " WHERE NEW.produtoItemCompra_id = estoque.produtoEstoque_id;"

			+ " CREATE TRIGGER PEDIDOCOMPRA_CONTAPAGAR AFTER INSERT ON PEDIDOCOMPRA FOR EACH ROW"
			+ " INSERT INTO contapagar(contapagar.pedidoContaPagar_id) VALUES (NEW.id);"

			+ " CREATE TRIGGER ITEMVENDA_CONTARECEBER AFTER INSERT ON ITEMVENDA FOR EACH ROW"
			+ " UPDATE contareceber SET contareceber.valorContaReceber = contareceber.valorContaReceber +"
			+ " (NEW.quantidadeItemVenda * itemvenda.valorItemCompra)"
			+ " WHERE contareceber.pedidoContaReceber_id = NEW.pedidoItemVenda_id;"

			+ " CREATE TRIGGER ITEMVENDA_ESTOQUE AFTER INSERT ON ITEMVENDA FOR EACH ROW"
			+ " UPDATE ESTOQUE SET estoque.quantidadeEstoque = ESTOQUE.quantidadeEstoque +"
			+ " NEW.quantidadeItemVenda, ESTOQUE.totalEstoque = ESTOQUE.totalEstoque +"
			+ " (NEW.quantidadeItemVenda * itemvenda.valorItemCompra)"
			+ " WHERE NEW.produtoItemVenda_id = estoque.produtoEstoque_id;"

			+ " CREATE TRIGGER PEDIDOVENDA_CONTARECEBER AFTER INSERT ON PEDIDOVENDA FOR EACH ROW"
			+ " INSERT INTO contareceber(contareceber.pedidoContaReceber_id) VALUES (NEW.id);";

	public static void preparaBanco() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemapesadao", "root", "123456");
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.execute();
		} catch (SQLException e) {
			System.out.println("Conexão errada em util trigger: " + e);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
