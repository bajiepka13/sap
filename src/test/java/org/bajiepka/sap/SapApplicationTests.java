package org.bajiepka.sap;

import org.bajiepka.sap.domain.entity.business.Hero;
import org.bajiepka.sap.repository.HeroRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(value = "dev")
public class SapApplicationTests {

    @Autowired
    HeroRepository heroRepository;

    @Before
    public void setUp() {

    }

    @Test
    public void contextLoads() {

        /*  Тестовые координаты в Севастополе
        44°36'04.4"N 33°31'29.8"E
        44.601219, 33.524934
        */

        List<Hero> heroes = heroRepository.findAll();
        assertEquals("База пустая. Героев нет, но скоро предвидятся", 0, heroes.size());

    }
}
