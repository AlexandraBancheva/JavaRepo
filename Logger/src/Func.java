import Appenders.Appender;
import Appenders.SocketAppender;
import Layouts.Layout;
import Layouts.XmlLayout;
import Loggers.Logger;
import Loggers.MessageLogger;

import java.io.IOException;

public abstract class Func {
    public static void connectToServer(String dade,String message) throws IOException {
        Layout layout = new XmlLayout();
        Appender appender = new SocketAppender(layout);
        Logger logger = new MessageLogger(appender);
        logger.logInfo("16.03.20021","Hello Gogo");
    }
}
