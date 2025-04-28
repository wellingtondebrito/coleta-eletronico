package br.futurodev.joinville.coletaeletronico.dtos.electronicwastes;

public record ElectronicWasteResponseDto(
        Long id,
        String typeTrash,
        String description
) {
}
