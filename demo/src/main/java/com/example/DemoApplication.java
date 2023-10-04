package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.contracts.services.ActorService;
import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDTO;
import com.example.domains.entities.dtos.ActorShort;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Autowired
//	ActorRepository dao;
	
//	@Autowired
//	ActorService srv;
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		System.out.println("Aplicacion Arrancada ....");
		
//		var actor = new Actor(0, "Pepito", "Grillo");
//		dao.save(actor);
//		var item = dao.findById(201);
//		if(item.isPresent()) {
//			var actor = item.get();
//			actor.setFirstName(actor.getFirstName().toUpperCase());
//			dao.save(actor);
//			
//		}
//		dao.deleteById(201);
//		dao.findAll().forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWithOrderByLastNameDesc("P").forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWith("P", Sort.by("FirstName")).forEach(System.out::println);
//		dao.findByActorIdGreaterThan(200).forEach(System.out::println);
//		dao.findNovedadesJPQL(200).forEach(System.out::println);
//		dao.findNovedadesSQL(200).forEach(System.out::println);
//		dao.findAll((root, query, builder) -> builder.greaterThan(root.get("actorId"), 200)).forEach(System.out::println);
//		dao.findAll((root, query, builder) -> builder.lessThanOrEqualTo(root.get("actorId"), 10), Sort.by("FirstName")).forEach(System.out::println);
//		dao.algo();
		
//		var item = dao.findById(1);
//		if(item.isPresent()) {
//			var actor = item.get();
//			System.out.println(actor);
//			actor.getFilmActors().forEach(e -> System.out.println(e.getFilm().getTitle()));
//		} else {
//			System.err.println("No encontrado");
//		}
//		var actor = new Actor(0, "PP", null);
////		if(actor.isInvalid()) {
////			System.err.println(actor.getErrorsMessage());
////		} else {
//			dao.save(actor);
//			dao.findNovedadesSQL(200).forEach(System.out::println);
////		}
//		dao.findAll().forEach(e -> System.out.println(ActorDTO.from(e)));
//		dao.getByActorIdGreaterThan(200).forEach(e -> System.out.println(e));
//		dao.readByActorIdGreaterThan(200).forEach(e -> System.out.println(e.getActorId() + " " + e.getNombre()));
//		dao.queryByActorIdGreaterThan(200, ActorDTO.class).forEach(e -> System.out.println(e));
//		dao.queryByActorIdGreaterThan(200, ActorShort.class).forEach(e -> System.out.println(e.getActorId() + " " + e.getNombre()));
//		dao.queryByActorIdGreaterThan(200, Actor.class).forEach(e -> System.out.println(e));
//		srv.add(new Actor(1, "PP", "PP"));
//		srv.getByProjection(ActorShort.class).forEach(e -> System.out.println(e.getActorId() + " " + e.getNombre()));
	}
	
	@Transactional
	void transaccion() {
		// actores
		// peliculas
	}

}
