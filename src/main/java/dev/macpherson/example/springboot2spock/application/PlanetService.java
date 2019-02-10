package dev.macpherson.example.springboot2spock.application;

import dev.macpherson.example.springboot2spock.domain.entity.Planet;
import dev.macpherson.example.springboot2spock.domain.repository.PlanetRepository;

import org.springframework.stereotype.Service;

/**
 * A service to manage Planet objects.
 */
@Service
public class PlanetService {

    private final PlanetRepository planetRepository;

    public PlanetService(PlanetRepository pRepository) {
        this.planetRepository = pRepository;
    }

    /**
     * {@inheritDoc}
     */
    public Planet findOneByPlanetName(String planetName) {
        return this.planetRepository.findOnebyPlanetName(planetName);
    }
}
