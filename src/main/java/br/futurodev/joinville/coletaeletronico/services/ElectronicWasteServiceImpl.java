package br.futurodev.joinville.coletaeletronico.services;

import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.ElectronicWaste;
import br.futurodev.joinville.coletaeletronico.mappers.ElectronicWasteMapper;
import br.futurodev.joinville.coletaeletronico.repositories.ElectronicWasteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ElectronicWasteServiceImpl implements ElectronicWasteService {

    private final ElectronicWasteRepository repository;

    @Override
    public List<ElectronicWasteResponseDto> getAll(){
        List<ElectronicWaste> electronic = repository.findAll();
        return ElectronicWasteMapper.toResponseDtos(electronic);
    }

    @Override
    public ElectronicWasteResponseDto getById(Long id) {
        ElectronicWaste electronic = repository.findById(id).orElseThrow(() -> new RuntimeException("Eletronic waste not found"));
        return ElectronicWasteMapper.toDto(electronic);
    }

    @Override
    public ElectronicWasteResponseDto create(ElectronicWasteRequestDto dto) {
        ElectronicWaste entity = new ElectronicWaste();
        ElectronicWasteMapper.toEntity(entity, dto);
        ElectronicWaste savedEntity = repository.save(entity);
        return ElectronicWasteMapper.toDto(savedEntity);
    }

    @Override
    public ElectronicWasteResponseDto update(Long id, ElectronicWasteRequestDto dto) {
        ElectronicWaste entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Eletronic waste not found"));
        ElectronicWasteMapper.toEntity(entity, dto);
        ElectronicWaste updatedEntity = repository.save(entity);
        return ElectronicWasteMapper.toDto(updatedEntity);
    }

    @Override
    public void delete(Long id) {
        ElectronicWaste entity = repository.findById(id).orElseThrow(() -> new RuntimeException("Eletronic waste not found"));
        repository.delete(entity);
    }

}
