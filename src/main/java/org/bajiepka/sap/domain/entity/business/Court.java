package org.bajiepka.sap.domain.entity.business;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bajiepka.sap.domain.entity.geo.CourtLocation;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "courts", schema = "public")
@AllArgsConstructor
@Getter
@Where(clause = "is_active = true")
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "court")
    private String courtName;

//    private List<Sport> sport;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private CourtLocation location;


}
