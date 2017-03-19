package scot.macpherson.example.springbootspock.ui;

import scot.macpherson.example.springbootspock.application.PlanetService;
import scot.macpherson.example.springbootspock.domain.entity.Planet;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * User Interface for managing planets.
 */
@RestController
public class PlanetController {

    private final PlanetService planetService;

    public PlanetController(PlanetService pService) {
        this.planetService = pService;
    }

    /**
     * Get a single Planet.
     * @param planetName Name of planet
     * @return Planet instance
     */
    @RequestMapping(
        value = "/planets/{planetName}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    public Planet getPlanet(@PathVariable String planetName) {
        return this.planetService.findOneByPlanetName(planetName);
    }
}
