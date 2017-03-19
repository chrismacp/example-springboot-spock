package scot.macpherson.example.springbootspock.ui

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import scot.macpherson.example.springbootspock.domain.entity.Planet
import scot.macpherson.example.springbootspock.domain.repository.PlanetRepository
import spock.lang.Specification

import static org.springframework.http.MediaType.APPLICATION_JSON
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8
import static org.hamcrest.Matchers.*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

/**
 * Integration Test for Planet Controller.
 */
@SpringBootTest
@AutoConfigureMockMvc
class PlanetControllerSpecIT extends Specification {

    @Autowired
    private MockMvc mockMvc

    @Autowired
    private PlanetRepository planetRepo

    def "should return planet earth details as JSON"() {
        given:
        Planet earth = new Planet()
        earth.setName("Earth")
        planetRepo.add(earth)

        when:
        def response = mockMvc.perform(
            get("/planets/Earth")
                .contentType(APPLICATION_JSON)
        )

        then:
        response
            .andExpect(status().isOk())
            .andExpect(content().contentType(APPLICATION_JSON_UTF8))
            .andExpect(jsonPath('$.name', is('Earth')))
    }
}
