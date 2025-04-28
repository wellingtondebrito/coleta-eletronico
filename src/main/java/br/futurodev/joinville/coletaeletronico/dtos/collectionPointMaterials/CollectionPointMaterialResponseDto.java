package br.futurodev.joinville.coletaeletronico.dtos.collectionPointMaterials;

import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;

import java.util.List;

public record CollectionPointMaterialResponseDto(
        Long id,
        ElectronicWasteResponseDto electronicWaste,
        Double maxCapacity
) {
}
