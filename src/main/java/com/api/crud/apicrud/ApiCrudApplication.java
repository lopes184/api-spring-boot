package com.api.crud.apicrud;

import com.api.crud.apicrud.model.PessoaModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCrudApplication.class, args);
		PessoaModel pessoa = new PessoaModel();
		pessoa.setNome("Smith");
		System.out.println(pessoa.getNome());
		PessoaModel pessoa2 = new PessoaModel(Long.valueOf("1"),"Luan","Luanzin@mail.com");
		System.out.println(pessoa2.getEmail());
	}

}
