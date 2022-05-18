package com.musica.cancion.service;

import com.musica.cancion.infraestructure.controller.dto.CancionInputDTO;
import com.musica.cancion.infraestructure.controller.dto.CancionOutputDTO;

public interface ICancionService {
    CancionOutputDTO getCancion(Integer id);

    CancionOutputDTO crearCancion(CancionInputDTO cancionInputDTO);
}
