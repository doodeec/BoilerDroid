package com.doodeec.boilerdroid;

/**
 * @author Dusan Bartos
 */
public class BDroidConfig {

    // disable logs for release version
    public static final boolean ENABLE_LOGS = true;

    // SQLite database config
    public static final String DATABASE_NAME = "boilerdroid.db";
    public static final int DATABASE_VERSION = 1;

    // rest api base path
    public static final String API_BASE = "http://doodeec.com";
}
