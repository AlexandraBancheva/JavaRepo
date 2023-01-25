package Appenders;

import Layouts.Layout;

import java.io.File;
import java.io.IOException;

public class FileAppender extends AppenderImplementation{
    private File file;

    protected FileAppender(Layout layout) {
        super(layout);
    }

    protected FileAppender(Layout layout, ReportLevel reportLevel) {
        super(layout, reportLevel);
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) throws IOException {
        if (this.file == null){
            try {
                this.setFile(new LogFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String str = this.format(date,reportLevel,message);

        file.appendBuffer(str);
        this.file.write();
    }

    @Override
    public String toString() {
        return super.toString() + ", File size: "+ this.file.getSize();
    }
}
