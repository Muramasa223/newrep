package Shaigaliev.cryptoanalyzer.constants;

import java.io.File;

public class Constants {
    private static final String rus = "ЁЙЦУКЕНГШЩЗХЪФЭЫЖВДАЛПОРЮЯБЧЬСТМИ";
    private static final String eng = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private static final String cyber = "0123456789";
    private static final String z = "!@#$%^&*()[]{}";
    private static final String ALPHABET = rus + eng +rus.toLowerCase() + eng.toLowerCase() + cyber + z;

    public static final String TXT_FOLDER=System.getProperty("user.dir")= File.separator+"text"+File.separator;
}
