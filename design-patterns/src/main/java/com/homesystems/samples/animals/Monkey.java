package com.homesystems.samples.animals;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Class to represent the animal Monkey.
 */
public class Monkey implements Animal {

    private final String speech = "Screech";
    private final String name = "Mikey";

    @Override
    public String makeSpeech() {
        return speech;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("speech", speech)
                .append("name", name)
                .toString();
    }
}
