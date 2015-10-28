package com.homesystems.samples.birds;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Class to represent a flamingo.
 */
public class Flamingo implements Bird {

    private final String speech = "Swish, swish";
    private final String name = "Pinky";

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
