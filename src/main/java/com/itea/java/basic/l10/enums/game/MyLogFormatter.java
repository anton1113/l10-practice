package com.itea.java.basic.l10.enums.game;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class MyLogFormatter extends SimpleFormatter {

    @Override
    public synchronized String format(LogRecord record) {
        return record.getMessage() + "\n";
    }
}
