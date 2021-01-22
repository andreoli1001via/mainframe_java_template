package com.mainframe;

import net.sf.f3270.HostCharset;
import net.sf.f3270.Terminal;
import net.sf.f3270.TerminalModel;
import net.sf.f3270.TerminalType;

public class Emulator {
    private static final String HOSTNAME = "10.204.13.1";
    private static final Integer PORT = 23;

    private static ThreadLocal<Terminal> threadTerminal = new ThreadLocal<Terminal>() {
        @Override
        protected synchronized Terminal initialValue() {
            return connect();
        }
    };

    public static Terminal getTerminal() {
        return threadTerminal.get();
    }

    public static Terminal connect() {
        String os = System.getProperty("os.name");
        String s3270Path = "s3270";
        if (os.toLowerCase().contains("windows")) {
            s3270Path = "s3270/cygwin/s3270";
        }
        Terminal terminal = new Terminal(s3270Path, HOSTNAME, PORT, TerminalType.TYPE_3279, TerminalModel.MODE_80_24, HostCharset.US_INTL, true);
        terminal.connect();
        return terminal;
    }

    public static void disconnect() {
        Terminal terminal = getTerminal();
        if (terminal != null) {
            terminal.disconnect();
            terminal = null;
        }
        if (threadTerminal != null) {
            threadTerminal.remove();
        }
    }
}
