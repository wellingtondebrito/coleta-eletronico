package br.futurodev.joinville.coletaeletronico.mappers;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPointMaterials.CollectionPointMaterialResponseDto;
import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.CollectionPoint;
import br.futurodev.joinville.coletaeletronico.entities.CollectionPointMaterial;

import java.util.List;

public class CollectionPointMaterialMapper {

    private CollectionPointMaterialMapper() {}


    public static CollectionPointMaterialResponseDto toDto(CollectionPointMaterial entity) {
        return new CollectionPointMaterialResponseDto(
                entity.getId(),
                ElectronicWasteMapper.toDto(entity.getEletronicWaste()),
                entity.getMaxCapacity()

        );
    }

    public static List<CollectionPointMaterialResponseDto> toResponseDtos(List<CollectionPointMaterial> entities){
        return entities.stream().map(CollectionPointMaterialMapper::toDto).toList();
    }

}
