package Layouts;

import Enumerations.ReportLevel;

public class SimpleLayout implements Layout{
    @Override
    public String format(String date, ReportLevel reporterLevel, String message) {
        return String.format("%s - %s - %s",date,reporterLevel.toString(),message);
    }
}