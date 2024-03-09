package com.proyectos.crudfullstackangular.service;

import com.proyectos.crudfullstackangular.entity.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente save(Cliente cliente);
    List<Cliente> findAll();
    Cliente findById(Integer id);
    void deleteById(Integer id);
    Cliente update(Cliente cliente);


}
