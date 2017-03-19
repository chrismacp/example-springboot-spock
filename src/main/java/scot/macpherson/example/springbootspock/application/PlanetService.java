package scot.macpherson.example.springbootspock.application;

import scot.macpherson.example.springbootspock.domain.entity.Planet;
import scot.macpherson.example.springbootspock.domain.repository.PlanetRepository;

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
