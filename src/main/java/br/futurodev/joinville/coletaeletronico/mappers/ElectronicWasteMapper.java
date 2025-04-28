package br.futurodev.joinville.coletaeletronico.mappers;

import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.ElectronicWaste;

import java.util.List;

public class ElectronicWasteMapper {

    private ElectronicWasteMapper() {}

    public static ElectronicWaste toEntity(ElectronicWaste entity, ElectronicWasteRequestDto dto) {
        entity.setTypeTrash(dto.typeTrash());
        entity.setDescription(dto.description());
        return entity;
    }

    public static ElectronicWasteResponseDto toDto(ElectronicWaste electronicWaste) {
        return new ElectronicWasteResponseDto(
                electronicWaste.getId(),
                electronicWaste.getTypeTrash(),
                electronicWaste.getDescription()
        );
    }

    public static List<ElectronicWasteResponseDto> toResponseDtos(List<ElectronicWaste> entities){
        return entities.stream().map(ElectronicWasteMapper::toDto).toList();
    }


}
