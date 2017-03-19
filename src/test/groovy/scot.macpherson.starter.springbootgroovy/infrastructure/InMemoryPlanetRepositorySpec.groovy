package scot.macpherson.starter.springbootgroovy.infrastructure

import scot.macpherson.starter.springbootgroovy.domain.entity.Planet
import scot.macpherson.starter.springbootgroovy.domain.repository.PlanetRepository
import scot.macpherson.starter.springbootgroovy.infrastructure.repository.InMemoryPlanetRepository
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
