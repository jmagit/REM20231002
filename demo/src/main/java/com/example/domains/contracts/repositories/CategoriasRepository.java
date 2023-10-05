package com.example.domains.contracts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.domains.entities.Category;

@RepositoryRestResource(path="categorias", itemResourceRel="categoria", collectionResourceRel="categorias")
public interface CategoriasRepository extends JpaRepository<Category, Integer> {

}
