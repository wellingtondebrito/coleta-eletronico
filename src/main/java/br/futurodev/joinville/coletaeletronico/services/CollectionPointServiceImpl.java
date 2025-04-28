package br.futurodev.joinville.coletaeletronico.services;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPointMaterials.CollectionPointMaterialRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointRequestDto;
import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.CollectionPoint;
import br.futurodev.joinville.coletaeletronico.entities.CollectionPointMaterial;
import br.futurodev.joinville.coletaeletronico.entities.ElectronicWaste;
import br.futurodev.joinville.coletaeletronico.mappers.CollectionPointMapper;
import br.futurodev.joinville.coletaeletronico.repositories.CollectionPointRepository;
import br.futurodev.joinville.coletaeletronico.repositories.ElectronicWasteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectionPointServiceImpl implements CollectionPointService {

    private final CollectionPointRepository repository;
    private final ElectronicWasteRepository electronicWasteRepository;

    @Override
    public List<CollectionPointResponseDto> getAll() {
        List<CollectionPoint> collection = repository.findAll();

        return CollectionPointMapper.toResponseDtos(collection);
    }

    @Override
    public CollectionPointResponseDto getById(Long id) {
        CollectionPoint collection = repository.findById(id).orElseThrow(() -> new RuntimeException("Collection point not found"));
        return CollectionPointMapper.toDto(collection);
    }

    @Override
    public CollectionPointResponseDto create(CollectionPointRequestDto collectionPoint) {
        return save(new CollectionPoint(), collectionPoint);
    }

    @Override
    public CollectionPointResponseDto update(Long id, CollectionPointRequestDto collectionPoint) {
        CollectionPoint collection = repository.findById(id).orElseThrow(() -> new RuntimeException("Collection point not found"));
        return save(collection, (CollectionPointRequestDto) collectionPoint);
    }

    @Override
    public void delete(Long id) {
      CollectionPoint collectionPoint = repository.findById(id).orElseThrow(() -> new RuntimeException("Collection point not found"));
        repository.delete(collectionPoint);
    }

    private CollectionPointResponseDto save (CollectionPoint collection, CollectionPointRequestDto dto){
        CollectionPointMapper.toEntity(collection, dto);

        for(CollectionPointMaterialRequestDto materialDto : dto.materials()){
            CollectionPointMaterial material = new CollectionPointMaterial();
            material.setCollectionPoint(collection);
            material.setMaxCapacity(materialDto.maxCapacity());

            ElectronicWaste electronicWaste = electronicWasteRepository.findById(materialDto.electronicWasteId())
                    .orElseThrow(() -> new RuntimeException("Electronic waste not found"));

            material.setEletronicWaste(electronicWaste);
            collection.getMaterials().add(material);
        }
        CollectionPoint savedEntity = repository.save(collection);
        return CollectionPointMapper.toDto(savedEntity);
    }

}
