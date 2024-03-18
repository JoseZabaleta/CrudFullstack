package com.proyectos.crudfullstackangular.controller;

import com.proyectos.crudfullstackangular.entity.Cliente;
import com.proyectos.crudfullstackangular.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/api/clientes
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    //localhost:8080/api/clientes
    @PostMapping
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }
    //localhost:8080/api/clientes
    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }
    //localhost:8080/api/clientes/id
    @GetMapping("/{id}")
    public Cliente findById(@PathVariable Integer id) {//refactorizacion
        return clienteService.findById(id);
    }

    //localhost:8080/api/clientes/id
    @DeleteMapping (value = "/{id}")
    public void deleteById(@PathVariable Integer id){
        clienteService.deleteById(id);
    }

    //localhost:8080/api/clientes
    @PutMapping
    public Cliente updateCliente(@RequestBody Cliente cliente){
        Cliente clienteDb = clienteService.findById(cliente.getId());
        clienteDb.setNombre(cliente.getNombre());
        clienteDb.setApellido(cliente.getApellido());
        clienteDb.setEmail(cliente.getEmail());
        return clienteService.update(clienteDb);
    }
}
