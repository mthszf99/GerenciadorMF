package com.mf.GerenciadorMF.Controllers;


import com.mf.GerenciadorMF.Models.ClientesModel;
import com.mf.GerenciadorMF.Services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientesModel")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @PostMapping
    public ResponseEntity<ClientesModel> cadastrarCliente(@RequestBody ClientesModel clientesModel) {
        ClientesModel clienteSalvo = clientesService.salvarCliente(clientesModel);
        return new ResponseEntity<>(clienteSalvo, HttpStatus.CREATED);
    }
}
