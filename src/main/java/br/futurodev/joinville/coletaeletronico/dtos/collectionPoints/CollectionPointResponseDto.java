package br.futurodev.joinville.coletaeletronico.dtos.collectionPoints;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPointMaterials.CollectionPointMaterialResponseDto;

import java.util.List;

public record CollectionPointResponseDto(
        Long id,
        String name,
        String address,
        String collectionDay,
        List<CollectionPointMaterialResponseDto> materials
) {
}
