package dev.macpherson.example.springboot2spock.domain.entity

import spock.lang.Specification

/**
 * Unit test Planet entity.
 */
class PlanetSpec extends Specification {

    Planet planet = new Planet()

    def "should return planet's name"() {
        when:
        planet.setName(name)

        then:
        planet.getName().equals(expected)

        where:
        name       | expected
        "Mercury"  | "Mercury"
        "LV-426"   | "LV-426"
        "WASP-12b" | "WASP-12b"
    }

    def "should throw an IllegalArgument exception if invalid name given"() {
        when:
        planet.setName(null)

        then:
        def e = thrown(IllegalArgumentException)
        e.message == "Planet name given was invalid"
    }
}
