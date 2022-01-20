package com.api.crud.apicrud.repositories;

import com.api.crud.apicrud.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository <PessoaModel,Long>{

}
