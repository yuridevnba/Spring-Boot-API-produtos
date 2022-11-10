package br.com.api.produtos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.produtos.modelo.ProdutosModelo;

public interface ProdutoRepositorio extends JpaRepository<ProdutosModelo, Long> {

}
