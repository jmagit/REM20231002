package com.example.domains.contracts.repositories;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.domains.core.contracts.repositories.ProjectionsAndSpecificationJpaRepository;
import com.example.domains.entities.Actor;


public interface ActorRepository extends ProjectionsAndSpecificationJpaRepository<Actor, Integer> { // JpaRepository<Actor, Integer>, JpaSpecificationExecutor<Actor> {
	List<Actor> findTop5ByFirstNameStartingWithOrderByLastNameDesc(String prefijo);
	List<Actor> findTop5ByFirstNameStartingWith(String prefijo, Sort orderBy);
	List<Actor> findByActorIdGreaterThan(int id);
	@Query(value = "from Actor a where a.actorId > ?1")
	List<Actor> findNovedadesJPQL(int id);
	@Query(value = "select * from actor where actor_id > :id", nativeQuery = true)
	List<Actor> findNovedadesSQL(@Param("id") int id);
	
	default void algo() {
		
	}
}
