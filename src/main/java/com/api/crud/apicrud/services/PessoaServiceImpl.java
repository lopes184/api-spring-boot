package com.api.crud.apicrud.services;


import com.api.crud.apicrud.model.PessoaModel;
import com.api.crud.apicrud.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public List<PessoaModel> buscarTodos() {
        return pessoaRepository.findAll();
    }

    @Override
    public Optional<PessoaModel> buscarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    @Override
    public PessoaModel salvarPessoa(PessoaModel pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public PessoaModel atualizarPessoa(PessoaModel pessoa) {
        Optional<PessoaModel> pessoaEncontrada = pessoaRepository.findById(pessoa.getId());
        if(pessoaEncontrada.isPresent()){
            pessoaEncontrada.get().setId(pessoa.getId());
            pessoaEncontrada.get().setNome(pessoa.getNome());
            pessoaEncontrada.get().setEmail(pessoa.getEmail());
            pessoaRepository.save(pessoaEncontrada.get());
        }
        return pessoaEncontrada.orElse(null);
    }

    @Override
    public void excluir(Long id) {
       pessoaRepository.deleteById(id);
    }
}
