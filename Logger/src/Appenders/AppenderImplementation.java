package Appenders;

import Layouts.Layout;

import java.io.IOException;

public class AppenderImplementation implements Appender{

    private final Layout layout;
    private ReportLevel reportLevel;
    private int loggedMessages;

    protected AppenderImplementation(Layout layout) {
        this.layout = layout;
        this.setReportLevel(ReportLevel.INFO);
        this.loggedMessages = 0;
    }

    protected AppenderImplementation(Layout layout, ReportLevel reportLevel) {
        this(layout);
        this.setReportLevel(reportLevel);
        this.loggedMessages = 0;

    }

    protected String format(String data, ReportLevel reportLevel, String message) {
        this.loggedMessages++;
        return this.layout.format(data, reportLevel, message);
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) throws IOException {

    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    @Override
    public ReportLevel getReportLevel() {
        return this.reportLevel;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d"
                , this.getClass().getSimpleName()
                , this.layout.getClass().getSimpleName()
                , this.reportLevel.toString()
                , this.loggedMessages);
    }
}
