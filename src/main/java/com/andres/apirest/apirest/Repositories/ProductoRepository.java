package com.andres.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andres.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    

}
