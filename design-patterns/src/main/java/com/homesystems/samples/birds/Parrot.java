package com.homesystems.samples.birds;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Class for a Parrot
 */
public class Parrot implements Bird {

    private final String speech = "Squawk";
    private final String name = "Polly";

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
