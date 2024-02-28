package org.example.logging;

public abstract class BaseLogger implements Logger{
    public void logMesssage(String message) {
        System.out.println("Logging to console: " + message);
        log(message);
    }
}
