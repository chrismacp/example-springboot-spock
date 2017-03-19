package scot.macpherson.starter.springbootgroovy.infrastructure.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import scot.macpherson.starter.springbootgroovy.domain.entity.Planet;
import scot.macpherson.starter.springbootgroovy.domain.repository.PlanetRepository;

/**
 * Concrete Planet repository used for example.
 */
@Repository
public class InMemoryPlanetRepository implements PlanetRepository {

    @Override
    public Planet findOnebyPlanetName(String planetName) {
        return null;
    }
}
