package dev.macpherson.example.springboot2spock.infrastructure.repository;

import dev.macpherson.example.springboot2spock.domain.repository.PlanetRepository;
import dev.macpherson.example.springboot2spock.domain.entity.Planet;

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
