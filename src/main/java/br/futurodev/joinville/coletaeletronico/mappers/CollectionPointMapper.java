package br.futurodev.joinville.coletaeletronico.mappers;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointResponseDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.CollectionPoint;
import br.futurodev.joinville.coletaeletronico.entities.ElectronicWaste;

import java.util.List;

public class CollectionPointMapper {

    private CollectionPointMapper() {}

    public static CollectionPoint toEntity(CollectionPoint entity, CollectionPointRequestDto dto) {
        entity.setName(dto.name());
        entity.setAddress(dto.address());
        entity.setCollectionDay(dto.collectionDay());
        return entity;
    }

    public static CollectionPointResponseDto toDto(CollectionPoint entity) {
        return new CollectionPointResponseDto(
                entity.getId(),
                entity.getName(),
                entity.getAddress(),
                entity.getCollectionDay(),
                CollectionPointMaterialMapper.toResponseDtos(entity.getMaterials())

        );
    }

    public static List<CollectionPointResponseDto> toResponseDtos(List<CollectionPoint> entities){
        return entities.stream().map(CollectionPointMapper::toDto).toList();
    }


}
