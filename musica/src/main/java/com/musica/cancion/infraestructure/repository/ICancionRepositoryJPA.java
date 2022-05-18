package com.musica.cancion.infraestructure.repository;

import com.musica.cancion.domain.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICancionRepositoryJPA extends JpaRepository<Cancion, Integer> {
}
