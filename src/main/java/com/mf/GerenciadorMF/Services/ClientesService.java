package com.mf.GerenciadorMF.Services;

import com.mf.GerenciadorMF.Models.ClientesModel;
import com.mf.GerenciadorMF.Repositories.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public ClientesModel salvarCliente(@Valid ClientesModel clientesModel){
        return clientesRepository.save(clientesModel);
    }
}
