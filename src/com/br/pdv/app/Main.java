package com.br.pdv.app;


import java.util.ArrayList;
import java.util.List;

import com.br.pdv.app.model.CadastroProduto;
import com.br.pdv.app.model.Funcionario;
import com.br.pdv.app.model.Produtos;

public class Main {

	public static void main(String[] args) {
		List<CadastroProduto> listaProdutos1 = new ArrayList<CadastroProduto>();
		Produtos produto1 = new Produtos("Leite Ninho - 1L", "1036", 10, "Laticinios", 5.50, listaProdutos1);
		Produtos produto2 = new Produtos("Queijo Tirol - 150g", "1045", 3, "Laticinios", 9.50, listaProdutos1);
		
		listaProdutos1.add(produto1);
		listaProdutos1.add(produto2);
		
		System.out.println(listaProdutos1.toString());
		
		
		Funcionario funcionario1 = new Funcionario("Kalebe Tavares Quaresma", "123.456.789-00", "22/07/1999", 'M', "Rua das Neves, 777");
		System.out.println(funcionario1.toString());
	}

}
