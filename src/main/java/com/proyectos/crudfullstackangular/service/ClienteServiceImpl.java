package com.proyectos.crudfullstackangular.service;

import com.proyectos.crudfullstackangular.entity.Cliente;
import com.proyectos.crudfullstackangular.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServiceImpl implements ClienteService{


    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Integer id) {
        return clienteRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Cliente update(Cliente cliente) {
        return null;
    }
}
