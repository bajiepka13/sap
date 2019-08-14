package org.bajiepka.sap.repository;

import org.bajiepka.sap.domain.entity.business.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, Long> {

}
