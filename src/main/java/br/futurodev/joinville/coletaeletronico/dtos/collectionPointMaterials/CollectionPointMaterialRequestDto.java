package br.futurodev.joinville.coletaeletronico.dtos.collectionPointMaterials;

import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;

public record CollectionPointMaterialRequestDto(
        Long electronicWasteId,
        Double maxCapacity
) {
}
