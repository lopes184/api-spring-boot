package com.api.crud.apicrud.services;

import com.api.crud.apicrud.model.PessoaModel;

import java.util.List;
import java.util.Optional;

public interface PessoaService {
    List<PessoaModel> buscarTodos();
    Optional<PessoaModel> buscarPorId(Long id);
    PessoaModel salvarPessoa(PessoaModel pessoa);
    PessoaModel atualizarPessoa(PessoaModel pessoa);
    void excluir(Long id);

}
