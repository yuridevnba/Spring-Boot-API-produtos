package br.com.api.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.produtos.modelo.ProdutosModelo;
import br.com.api.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
	
	@Autowired
	private ProdutoRepositorio pr;
	
	// Método para listar todos os produtos
	// findALL()== select*from produtos
	public  Iterable<ProdutosModelo> listar(){
		return pr.findAll();
		
		
	}

}
