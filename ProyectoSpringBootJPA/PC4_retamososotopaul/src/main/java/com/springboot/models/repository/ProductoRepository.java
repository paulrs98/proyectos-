package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entitys.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
