package com.proyectos.crudfullstackangular.repository;

import com.proyectos.crudfullstackangular.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

}
