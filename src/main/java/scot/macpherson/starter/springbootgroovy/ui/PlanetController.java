package scot.macpherson.starter.springbootgroovy.ui;

import scot.macpherson.starter.springbootgroovy.application.PlanetService;
import scot.macpherson.starter.springbootgroovy.domain.entity.Planet;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * User Interface for managing planets.
 */
@RestController
@RequestMapping("planets")
public class PlanetController {

    PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    /**
     * Get a single Planet.
     * @param planetName Name of planet
     * @return Planet instance
     */
    @RequestMapping(value = "/{planetName}", method = RequestMethod.GET, produces = "application/xml")
    public Planet getPlanet(@PathVariable String planetName) {

        Planet planet = this.planetService.findOneByPlanetName(planetName);
        return planet;
    }
}
