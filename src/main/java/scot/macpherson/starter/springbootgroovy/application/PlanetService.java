package scot.macpherson.starter.springbootgroovy.application;

import scot.macpherson.starter.springbootgroovy.domain.entity.Planet;

import org.springframework.stereotype.Service;
import scot.macpherson.starter.springbootgroovy.domain.repository.PlanetRepository;


/**
 * A service to manage Planet objects.
 */
@Service
public class PlanetService {

    PlanetRepository planetRepository;

    public PlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet findOneByPlanetName(String planetName) {
        return this.planetRepository.findOnebyPlanetName(planetName);
    }
}
