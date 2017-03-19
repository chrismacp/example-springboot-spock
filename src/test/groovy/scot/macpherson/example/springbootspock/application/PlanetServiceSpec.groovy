package scot.macpherson.example.springbootspock.application

import scot.macpherson.example.springbootspock.domain.repository.PlanetRepository
import spock.lang.Specification

/**
 * Unit test the Planet Service.
 */
class PlanetServiceSpec extends Specification {

    def planetRepoMock = Mock(PlanetRepository)

    def planetService = new PlanetService(planetRepoMock)

    def "should use the repository to fetch one Planet by name"() {
        when:
        planetService.findOneByPlanetName("earth")

        then:
        1 * planetRepoMock.findOnebyPlanetName("earth")
    }

}
