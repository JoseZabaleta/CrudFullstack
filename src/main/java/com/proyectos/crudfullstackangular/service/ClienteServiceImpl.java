package com.proyectos.crudfullstackangular.service;

import com.proyectos.crudfullstackangular.entity.Cliente;
import com.proyectos.crudfullstackangular.exception.ResourceNotFoundException;
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
        Cliente cliente = clienteRepository.findById(id).orElseThrow(
                ()->{
                    throw new ResourceNotFoundException("Cliente con id "+id+ "No se Encuentra");
                }
        );
        //return clienteRepository.findById(id).get();
        return cliente;
    }

    @Override
    public void deleteById(Integer id) {

        clienteRepository.deleteById(id);

    }

    @Override
    public Cliente update(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
