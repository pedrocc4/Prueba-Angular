package com.musica.cancion.infraestructure.controller;

import com.musica.cancion.infraestructure.controller.dto.CancionInputDTO;
import com.musica.cancion.infraestructure.controller.dto.CancionOutputDTO;
import com.musica.cancion.service.ICancionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api")
public class Controller {

  @Autowired
  private ICancionService service;

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("cancion/{id}")
  @CrossOrigin(origins = "http://localhost:4200")
  public ResponseEntity<CancionOutputDTO> getCancion(@PathVariable Integer id) {
    log.info("Obteniendo datos de cancion con id: " + id);
    return ResponseEntity.status(HttpStatus.OK).body(service.getCancion(id));
  }

  @ResponseStatus(HttpStatus.CREATED)
  @PostMapping("cancion")
  @CrossOrigin(origins = "http://localhost:4200")
  public ResponseEntity<CancionOutputDTO> addCancion(
    @RequestBody CancionInputDTO cancionInputDTO) {
    log.info("Intentando crear: " + cancionInputDTO);
    return ResponseEntity.status(HttpStatus.CREATED).body(service.crearCancion(cancionInputDTO));
  }

  @ResponseStatus(HttpStatus.OK)
  @GetMapping("canciones")
  @CrossOrigin(origins = "http://localhost:4200")
  public ResponseEntity<List<CancionOutputDTO>> getCanciones() {
    log.info("Obteniendo todas las canciones...");
    return ResponseEntity.status(HttpStatus.OK).body(service.getCanciones());
  }
}
