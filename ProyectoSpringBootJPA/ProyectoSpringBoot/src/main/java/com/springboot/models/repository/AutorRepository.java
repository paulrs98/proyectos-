package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entitys.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
