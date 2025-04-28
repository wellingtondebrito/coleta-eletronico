package br.futurodev.joinville.coletaeletronico.services;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointResponseDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;

import java.util.List;

public interface CollectionPointService {
    List<CollectionPointResponseDto> getAll();
    CollectionPointResponseDto getById(Long id);
    CollectionPointResponseDto create(CollectionPointRequestDto collectionPoint);
    CollectionPointResponseDto update(Long id, CollectionPointRequestDto collectionPoint);
    void delete(Long id);
}
