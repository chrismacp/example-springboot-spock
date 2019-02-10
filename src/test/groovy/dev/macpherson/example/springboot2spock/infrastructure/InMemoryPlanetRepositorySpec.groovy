package dev.macpherson.example.springboot2spock.infrastructure

import dev.macpherson.example.springboot2spock.domain.entity.Planet
import dev.macpherson.example.springboot2spock.domain.repository.PlanetRepository
import dev.macpherson.example.springboot2spock.infrastructure.repository.InMemoryPlanetRepository
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
