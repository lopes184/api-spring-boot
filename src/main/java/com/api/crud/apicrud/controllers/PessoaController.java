package com.api.crud.apicrud.controllers;

import com.api.crud.apicrud.model.PessoaModel;
import com.api.crud.apicrud.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.Delimiter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> buscarTodos(){
        return pessoaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Optional<PessoaModel> buscarPorId(@PathVariable Long id){
        return pessoaService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPessoa(@PathVariable Long id){
        pessoaService.excluir(id);
    }

    @PostMapping
    public PessoaModel cadastrarPessoa(@RequestBody PessoaModel pessoa){
        return pessoaService.salvarPessoa(pessoa);
    }

    @PutMapping("/{id}")
    public PessoaModel atualizarPessoa(@RequestBody PessoaModel pessoa,@PathVariable Long id){
        return pessoaService.atualizarPessoa(pessoa);

    }

}
