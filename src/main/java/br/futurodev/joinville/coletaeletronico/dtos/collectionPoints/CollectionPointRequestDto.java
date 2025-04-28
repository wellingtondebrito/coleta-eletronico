package br.futurodev.joinville.coletaeletronico.dtos.collectionPoints;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPointMaterials.CollectionPointMaterialRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.collectionPointMaterials.CollectionPointMaterialResponseDto;

import java.util.List;

public record CollectionPointRequestDto(
        String name,
        String address,
        String collectionDay,
        List<CollectionPointMaterialRequestDto> materials
) {
}
