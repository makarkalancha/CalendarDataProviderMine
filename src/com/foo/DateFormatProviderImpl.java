package com.foo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.spi.DateFormatProvider;
import java.util.Locale;

/**
 * User: Makar Kalancha
 * Date: 27/02/2016
 * Time: 22:01
 */
public class DateFormatProviderImpl extends DateFormatProvider {
    private Locale newAtlantis = new Locale("en", "NA");

    @Override
    public DateFormat getTimeInstance(int style, Locale locale) {
        if (locale.equals(newAtlantis))
        {
            return new SimpleDateFormat("-HH.mm.ss-");
        }
        return null;
    }

    @Override
    public DateFormat getDateInstance(int style, Locale locale) {
        if (locale.equals(newAtlantis))
        {
            return new SimpleDateFormat("yyyy~MM~dd");
        }
        return null;
    }

    @Override
    public DateFormat getDateTimeInstance(int dateStyle, int timeStyle, Locale locale) {
        if (locale.equals(newAtlantis))
        {
            return new SimpleDateFormat("yyyy~MM~dd -HH.mm.ss-");
        }
        return null;
    }

    @Override
    public Locale[] getAvailableLocales() {
        return new Locale [] {newAtlantis};
    }
}

