package com.daniel.Restfull.repositorios;

import com.daniel.Restfull.entidades.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LibrosRepository extends JpaRepository <Libros, Long> {
}
