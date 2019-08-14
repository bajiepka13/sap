package org.bajiepka.sap.domain.entity.business;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.bajiepka.sap.domain.entity.AbstractEntity;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "heroes", schema = "public")
@AllArgsConstructor
@Getter
@Where(clause = "is_active = true")
public class Hero extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nickname")
    private String nickname;

//    private List<Sport> sport;

}
