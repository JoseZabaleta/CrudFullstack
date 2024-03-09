package com.proyectos.crudfullstackangular.controller;

import com.proyectos.crudfullstackangular.entity.Cliente;
import com.proyectos.crudfullstackangular.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @PostMapping("/api/create-cliente")
    public Cliente save(@RequestBody Cliente cliente){
        return clienteService.save(cliente);
    }

@GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }

}
