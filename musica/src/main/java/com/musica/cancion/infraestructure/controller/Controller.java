package com.musica.cancion.infraestructure.controller;

import com.musica.cancion.infraestructure.controller.dto.CancionInputDTO;
import com.musica.cancion.infraestructure.controller.dto.CancionOutputDTO;
import com.musica.cancion.service.ICancionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ICancionService service;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("cancion/{id}")
    public ResponseEntity<CancionOutputDTO> getCancion(@PathVariable Integer id) {
        log.info("Obteniendo datos de cancion con id: " + id);
        return ResponseEntity.status(HttpStatus.OK).body(service.getCancion(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("cancion")
    public ResponseEntity<CancionOutputDTO> getCancion(
            @RequestBody CancionInputDTO cancionInputDTO) {
        log.info("Intentando crear: " +cancionInputDTO);
        return ResponseEntity.status(HttpStatus.OK).body(service.crearCancion(cancionInputDTO));
    }
}
