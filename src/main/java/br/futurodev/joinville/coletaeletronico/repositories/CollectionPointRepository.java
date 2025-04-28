package br.futurodev.joinville.coletaeletronico.repositories;

import br.futurodev.joinville.coletaeletronico.entities.CollectionPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollectionPointRepository extends JpaRepository<CollectionPoint, Long> {
}
