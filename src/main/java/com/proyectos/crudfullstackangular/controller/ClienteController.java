package com.proyectos.crudfullstackangular.controller;

import com.proyectos.crudfullstackangular.entity.Cliente;
import com.proyectos.crudfullstackangular.service.ClienteService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @PostMapping("")
    public Cliente save(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }
}
