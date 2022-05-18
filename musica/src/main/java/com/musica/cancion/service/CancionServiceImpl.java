package com.musica.cancion.service;

import com.musica.cancion.infraestructure.controller.dto.CancionInputDTO;
import com.musica.cancion.infraestructure.controller.dto.CancionOutputDTO;
import com.musica.cancion.infraestructure.controller.mapper.ICancionMapper;
import com.musica.cancion.infraestructure.repository.ICancionRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancionServiceImpl implements ICancionService {

    @Autowired
    private ICancionMapper mapper;

    @Autowired
    private ICancionRepositoryJPA repositoryJPA;

    @Override
    public CancionOutputDTO getCancion(Integer id) {
        return mapper.toDTO(repositoryJPA.getById(id));
    }

    @Override
    public CancionOutputDTO crearCancion(CancionInputDTO cancionInputDTO) {
        return mapper.toDTO(repositoryJPA.save(mapper.toEntity(cancionInputDTO)));
    }
}
