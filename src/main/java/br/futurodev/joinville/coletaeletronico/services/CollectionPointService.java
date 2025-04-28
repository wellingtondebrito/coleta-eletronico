package br.futurodev.joinville.coletaeletronico.services;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointResponseDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;

import java.util.List;

public interface CollectionPointService {
    List<CollectionPointResponseDto> getAll();
    CollectionPointResponseDto getById(Long id);
    CollectionPointResponseDto create(CollectionPointResponseDto collectionPoint);
    CollectionPointResponseDto update(Long id, CollectionPointResponseDto collectionPoint);
    void delete(Long id);
}
