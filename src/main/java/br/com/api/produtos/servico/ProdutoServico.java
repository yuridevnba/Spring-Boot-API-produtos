package br.com.api.produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produtos.modelo.ProdutosModelo;
import br.com.api.produtos.modelo.RespostaModelo;
import br.com.api.produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
	
	@Autowired
	private ProdutoRepositorio pr;
	@Autowired
	private RespostaModelo rm;
	
	// Método para listar todos os produtos
	// findALL()== select*from produtos
	public  Iterable<ProdutosModelo> listar(){
		return pr.findAll();
		
		// Método para cadastrar produtos
		public ResponseEntity<?>cadastrar(ProdutosModelo pm){
			if(pm.g)
		}
	}

}
