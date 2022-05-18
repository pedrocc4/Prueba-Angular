package com.musica.cancion.infraestructure.controller.mapper;


import com.musica.cancion.infraestructure.controller.dto.CancionInputDTO;
import com.musica.cancion.domain.Cancion;
import com.musica.cancion.infraestructure.controller.dto.CancionOutputDTO;
import org.mapstruct.Mapper;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
@Validated
public interface ICancionMapper {
    @Valid Cancion toEntity(CancionInputDTO cancionInputDTO);

    CancionOutputDTO toDTO(@Valid Cancion cancion);

    default List<CancionOutputDTO> toDTOList(@Valid List<Cancion> canciones) {
        if (canciones == null) {
            return new ArrayList<>();
        }
        return canciones.stream().map(this::toDTO).toList();
    }
}
