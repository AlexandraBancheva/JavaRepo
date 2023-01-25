package Layouts;

import Enumerations.ReportLevel;

public interface Layout {
    String format(String date, ReportLevel reporterLevel, String message);
}
