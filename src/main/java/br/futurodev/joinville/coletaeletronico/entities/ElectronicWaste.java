package br.futurodev.joinville.coletaeletronico.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "eletronic_waste")
public class ElectronicWaste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "type")
    private String typeTrash;

    private String description;

}
