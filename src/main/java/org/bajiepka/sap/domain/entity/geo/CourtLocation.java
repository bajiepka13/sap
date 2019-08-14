package org.bajiepka.sap.domain.entity.geo;

import lombok.AllArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "locations", schema = "public")
@AllArgsConstructor
public class CourtLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "x")
    private Double x;

    @Column(name = "y")
    private Double y;

}
