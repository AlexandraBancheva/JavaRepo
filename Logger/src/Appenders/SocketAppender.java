package Appenders;

import Layouts.Layout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SocketAppender extends AppenderImplementation{
    private Socket client;
    private PrintWriter out;
    private BufferedReader in;

    protected SocketAppender(Layout layout) {
        super(layout);
        InetAddress address = InetAddress.getLocalHost();
        this.startConnection("127.0.0.1",21);
    }

    protected SocketAppender(Layout layout, ReportLevel reportLevel) {
        super(layout, reportLevel);
    }

    public void startConnection(String ip, int port) throws IOException {
        client = new Socket(ip, port);
        out = new PrintWriter(client.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
    }

    public void sendMessage(String msg) throws IOException {
        out.println(msg);
        in.readLine();
    }

    @Override
    public void append(String date, ReportLevel reportLevel, String message) throws IOException {
        this.sendMessage(this.format(date,reportLevel,message));
    }
}
