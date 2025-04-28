package br.futurodev.joinville.coletaeletronico.repositories;

import br.futurodev.joinville.coletaeletronico.dtos.electronicwastes.ElectronicWasteResponseDto;
import br.futurodev.joinville.coletaeletronico.entities.ElectronicWaste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectronicWasteRepository extends JpaRepository<ElectronicWaste, Long> {

}
