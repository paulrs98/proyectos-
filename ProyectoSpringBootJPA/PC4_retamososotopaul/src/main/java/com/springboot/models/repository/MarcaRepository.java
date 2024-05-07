package com.springboot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.models.entitys.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {

}
