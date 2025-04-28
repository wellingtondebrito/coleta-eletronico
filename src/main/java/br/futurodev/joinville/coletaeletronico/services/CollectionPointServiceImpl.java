package br.futurodev.joinville.coletaeletronico.services;

import br.futurodev.joinville.coletaeletronico.dtos.collectionPoints.CollectionPointResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.CollectionPoint;
import br.futurodev.joinville.coletaeletronico.mappers.CollectionPointMapper;
import br.futurodev.joinville.coletaeletronico.repositories.CollectionPointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollectionPointServiceImpl implements CollectionPointService {

    private final CollectionPointRepository repository;

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
    public CollectionPointResponseDto create(CollectionPointResponseDto collectionPoint) {
        return null;
    }

    @Override
    public CollectionPointResponseDto update(Long id, CollectionPointResponseDto collectionPoint) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
