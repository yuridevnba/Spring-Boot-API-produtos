package br.com.api.produtos.modelo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

// responsavel por retornar um feedback caso aconteça alguma falha na API, no cadastro, delete etc.
@Component
@Getter
@Setter
public class RespostaModelo {

	private String mensagem;
}
