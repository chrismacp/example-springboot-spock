package scot.macpherson.starter.springbootgroovy.domain.repository;

import scot.macpherson.starter.springbootgroovy.domain.entity.Planet;

/**
 * Repository to manage Planets.
 */
public interface PlanetRepository {

    /**
     * Get one Planet by the planet's name.
     * @param planetName
     * @return A single Planet instance
     */
    Planet findOnebyPlanetName(String planetName);

    /**
     * Store a planet.
     * @param planet Planet instance to be stored
     */
    void add(Planet planet);
}
