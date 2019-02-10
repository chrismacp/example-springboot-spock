package dev.macpherson.example.springboot2spock.ui

import dev.macpherson.example.springboot2spock.application.PlanetService

import spock.lang.Specification

/**
 * Unit test for the PlanetController.
 */
class PlanetControllerSpec extends Specification {

    def planetServiceMock = Mock(PlanetService)
    def planetController = new PlanetController(planetServiceMock)

    def "should ask the PlanetService for earth information"() {
        when:
        planetController.getPlanet("earth")

        then:
        1 * planetServiceMock.findOneByPlanetName('earth')
    }
}
