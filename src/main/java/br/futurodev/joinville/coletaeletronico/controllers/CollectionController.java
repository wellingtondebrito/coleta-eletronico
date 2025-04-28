package br.futurodev.joinville.coletaeletronico.controllers;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.CollectionPoint;
import br.futurodev.joinville.coletaeletronico.repositories.CollectionPointRepository;
import br.futurodev.joinville.coletaeletronico.services.CollectionPointService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/collection_points")
public class CollectionController {

    private final CollectionPointService service;
    private final CollectionPointRepository repository;

    @GetMapping
    public List<CollectionPointResponseDto> getAll(){
        return service.getAll();
    }

    @PostMapping
    public CollectionPointResponseDto create(@RequestBody CollectionPointRequestDto dto){
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public CollectionPointResponseDto update(@PathVariable Long id, @RequestBody CollectionPointRequestDto dto){
        return service.update(id, dto);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
