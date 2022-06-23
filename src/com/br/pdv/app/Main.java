package com.br.pdv.app;

import com.br.pdv.app.model.Estoque;
import com.br.pdv.app.model.Produtos;

public class Main {

	public static void main(String[] args) {
		Estoque listaProdutos1 = new Estoque();
		Produtos produto1 = new Produtos("Leite Ninho - 1L", "1036", 10, "Laticinios", 5.50 /*,listaProdutos1*/);
		Produtos produto2 = new Produtos("Queijo Tirol - 150g", "1045", 3, "Laticinios", 9.50 /*,listaProdutos1*/);
		
		listaProdutos1.addProduto(produto1);
		listaProdutos1.addProduto(produto2);
		
		listaProdutos1.removeProduto(produto1);
		
		System.out.println(listaProdutos1.toString());
	}

}
