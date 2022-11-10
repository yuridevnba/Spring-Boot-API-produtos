package br.com.api.produtos.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.modelo.ProdutosModelo;
import br.com.api.produtos.servico.ProdutoServico;

@RestController
public class ProdutoControle {
      
	 
	@Autowired
	private ProdutoServico ps;
	
	
	@GetMapping("/listar")
	 public Iterable<ProdutosModelo> listar() {
		return ps.listar();
	}
	@GetMapping("/")
	public String rota() {
		return "API de produtos funcionando!";
	}
	@PostMapping("/cadastrar")
	public ResponseEntity<?>cadastrar(@RequestBody ProdutosModelo pm){
		return ps.cadastrarAlterar(pm,"cadastrar");
	}
	
}
