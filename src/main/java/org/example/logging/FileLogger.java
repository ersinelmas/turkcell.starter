package org.example.logging;

public class FileLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logging to file: " + message);
    }
}