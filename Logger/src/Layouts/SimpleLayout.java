package Layouts;

public class SimpleLayout implements Layout{
    @Override
    public String format(String date, ReportLevel reporterLevel, String message) {
        return String.format("%s - %s - %s",date,reportLevel.toString(),message);
    }
}