package Appenders;

import Enumerations.ReportLevel;
import Layouts.Layout;

public class ConsoleAppender extends AppenderImplementation{
    protected ConsoleAppender(Layout layout) {

        super(layout);
    }

    protected ConsoleAppender(Layout layout, ReportLevel reportLevel) {

        super(layout, reportLevel);
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) {
        System.out.println(this.format(date, reportLevel, message));
    }
}
