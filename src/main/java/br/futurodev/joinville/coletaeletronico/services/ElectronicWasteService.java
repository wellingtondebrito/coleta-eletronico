package br.futurodev.joinville.coletaeletronico.services;

import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;

import java.util.List;

public interface ElectronicWasteService {
    List<ElectronicWasteResponseDto> getAll();
    ElectronicWasteResponseDto getById(Long id);
    ElectronicWasteResponseDto create(ElectronicWasteRequestDto electronicWaste);
    ElectronicWasteResponseDto update(Long id, ElectronicWasteRequestDto electronicWaste);
    void delete(Long id);
}
