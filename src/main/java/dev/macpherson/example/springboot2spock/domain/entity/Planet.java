package dev.macpherson.example.springboot2spock.domain.entity;

/**
 * Planet representation.
 */
public class Planet {

    private String name;

    public Planet setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Planet name given was invalid");
        }
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }
}
