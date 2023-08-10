package com.daniel.Restfull;

import com.daniel.Restfull.entidades.Libros;
import com.daniel.Restfull.repositorios.LibrosRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(RestApplication.class, args);

        LibrosRepository repository = context.getBean(LibrosRepository.class);
        System.out.printf("Libros en la base de datos " + repository.findAll().size());

        Libros libro = new Libros(null, "la culpa es de la vaca",1998, "Daniel", 900, "la Culpa" );
        Libros libro2 = new Libros(null, "La pasion",1999, "Daniel", 909, "EL AMOR" );

        repository.save(libro);
        repository.save(libro2);

        System.out.printf("Libros en base de datos " + repository.findAll().size());

        repository.deleteById(1l);

        System.out.printf("Libros en base de Datos " + repository.findAll().size());
        System.out.printf("terminamos la practica ");


	}

}
