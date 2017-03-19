package scot.macpherson.starter.springbootgroovy.infrastructure.repository;

import scot.macpherson.starter.springbootgroovy.domain.entity.Planet;
import scot.macpherson.starter.springbootgroovy.domain.repository.PlanetRepository;

import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete Planet repository used for example.
 */
@Repository
public class InMemoryPlanetRepository implements PlanetRepository {

    private Map<String, Planet> planets;

    public InMemoryPlanetRepository() {
        this.planets = new HashMap<>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Planet findOnebyPlanetName(String planetName) {
        return this.planets.get(planetName);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Planet planet) {
        this.planets.put(planet.getName(), planet);
    }
}
