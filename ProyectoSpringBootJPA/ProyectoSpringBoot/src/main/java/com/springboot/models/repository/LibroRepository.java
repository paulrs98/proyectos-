package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entitys.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
