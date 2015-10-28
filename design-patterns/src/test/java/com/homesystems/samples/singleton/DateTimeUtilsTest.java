package com.homesystems.samples.singleton;

import org.joda.time.DateTime;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Class to test the singleton DateTimeUtils
 */
public class DateTimeUtilsTest {

    @Test
    public void testGetDateTimeForString() {
        DateTime dateTime = DateTimeUtils.INSTANCE.getDateTimeForString("21/03/2012 23:10:10");
        assertEquals("2012-03-21T23:10:10.000Z", dateTime.toString());
    }
}
