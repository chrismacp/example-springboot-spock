package scot.macpherson.example.springbootspock.infrastructure

import scot.macpherson.example.springbootspock.domain.entity.Planet
import scot.macpherson.example.springbootspock.domain.repository.PlanetRepository
import scot.macpherson.example.springbootspock.infrastructure.repository.InMemoryPlanetRepository
import spock.lang.Specification

/**
 * Unit Test Planet Repository.
 */
class InMemoryPlanetRepositorySpec extends Specification {

    PlanetRepository planetRepository = new InMemoryPlanetRepository();

    def "should return an instance of Planet with earth details"() {

        given:
        def earth = Stub(Planet)
        earth.getName() >> "Earth"
        planetRepository.add(earth)

        when:
        def planet = planetRepository.findOnebyPlanetName("Earth")

        then:
        planet.getName() == "Earth"
    }
}
