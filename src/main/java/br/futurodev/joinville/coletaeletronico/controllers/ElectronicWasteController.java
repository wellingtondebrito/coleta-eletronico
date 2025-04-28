package br.futurodev.joinville.coletaeletronico.controllers;


import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.ElectronicWaste;
import br.futurodev.joinville.coletaeletronico.mappers.ElectronicWasteMapper;
import br.futurodev.joinville.coletaeletronico.repositories.ElectronicWasteRepository;
import br.futurodev.joinville.coletaeletronico.services.ElectronicWasteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/eletronic-waste")

public class ElectronicWasteController {

    private final ElectronicWasteRepository repository;
    private final ElectronicWasteService service;

    @GetMapping
    public List<ElectronicWasteResponseDto> getAll() {
        return service.getAll();
    }
    @GetMapping("/{id}")
    public ElectronicWasteResponseDto getById(@PathVariable Long id) {
        return service.getById(id);
    }
    @PostMapping
    public ElectronicWasteResponseDto create(@RequestBody ElectronicWasteRequestDto dto) {
        return service.create(dto);
    }
    @PutMapping("/{id}")
    public ElectronicWasteResponseDto update(@PathVariable Long id, @RequestBody ElectronicWasteRequestDto dto) {
        return service.update(id, dto);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }




}
