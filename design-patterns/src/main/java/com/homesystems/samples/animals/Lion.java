package com.homesystems.samples.animals;

/**
 * Class to represent Lion.
 */
public class Lion implements Animal {

    private final String speech = "Roar";
    private final String name = "Alex";

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
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("speech", speech)
                .append("name", name)
                .toString();
    }
}
