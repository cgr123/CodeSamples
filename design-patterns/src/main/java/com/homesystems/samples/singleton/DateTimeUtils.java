package com.homesystems.samples.singleton;

import com.homesystems.samples.HomeSystemsConstants;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * Singleton class to provide the methods to handle DateTime manipulation.
 */
public enum DateTimeUtils {

    INSTANCE;

    /**
     * Method to return the current time in system locale
     *
     * @return DateTime representing the current time as per the system (O/S) setup.
     */
    public DateTime getCurrentTime() {
        return new DateTime();
    }

    /**
     * Method to return a DateTime object for the supplied String in the system default format (see HomeSystemsConstants.DATE_TIME_FORMAT)
     *
     * @param date The date to convert as a String.
     * @return DateTime object representing the date provided.
     */
    public DateTime getDateTimeForString(String date) {
        return DateTime.parse(date, DateTimeFormat.forPattern(HomeSystemsConstants.DATE_TIME_FORMAT));
    }
}
