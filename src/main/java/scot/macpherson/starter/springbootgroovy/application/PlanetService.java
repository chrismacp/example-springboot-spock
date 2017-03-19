package scot.macpherson.starter.springbootgroovy.application;

import scot.macpherson.starter.springbootgroovy.domain.entity.Planet;

import org.springframework.stereotype.Service;
import scot.macpherson.starter.springbootgroovy.domain.repository.PlanetRepository;


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
     * @param planetName
     * @return
     */
    public Planet findOneByPlanetName(String planetName) {
        return this.planetRepository.findOnebyPlanetName(planetName);
    }
}
