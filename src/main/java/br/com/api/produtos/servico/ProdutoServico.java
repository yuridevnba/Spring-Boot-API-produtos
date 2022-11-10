package br.com.api.produtos.servico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
	public  List<ProdutosModelo> listar(){
		return pr.findAll();
	}
		// Método para cadastrar produtos
		public ResponseEntity<?>cadastrar(ProdutosModelo pm){
			if(pm.getNome().equals(" ")) {
				rm.setMensagem("O nome do produto é obrigatório!");
				return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
			}else if(pm.getMarca().equals("")) {
				rm.setMensagem("O nome da marca é obrigatório!");
				return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
			}else {
				return new ResponseEntity<ProdutosModelo>(pr.save(pm),HttpStatus.CREATED);
				
			
		
			}
	}

}
