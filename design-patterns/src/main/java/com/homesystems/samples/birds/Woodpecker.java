package com.homesystems.samples.birds;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Class to represent a woodpecker
 */
public class Woodpecker implements Bird {

    private final String speech = "Knock, knock";
    private final String name = "Woody";

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
