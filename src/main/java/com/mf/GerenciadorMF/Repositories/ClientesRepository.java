package com.mf.GerenciadorMF.Repositories;

import com.mf.GerenciadorMF.Models.ClientesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<ClientesModel, Long>{
}
