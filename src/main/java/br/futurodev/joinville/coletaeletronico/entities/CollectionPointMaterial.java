package br.futurodev.joinville.coletaeletronico.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "collection_point_materials")
public class CollectionPointMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "collection_point_id", nullable = false)
    private CollectionPoint collectionPoint;
    @ManyToOne
    @JoinColumn(name = "eletronic_waste_id", nullable = false)
    private ElectronicWaste eletronicWaste;
    @Column(nullable = false)
    private Double maxCapacity;

}
