package com.pcom.pages;

import net.sf.f3270.FieldIdentifier;
import static com.mainframe.Emulator.getTerminal;

public class EnvironmentsPage {
    private FieldIdentifier command = new FieldIdentifier("COMMAND", 2);

    public SystemAccessPage accessJtrach() {
        getTerminal().write(command, "1");
        getTerminal().enter();
        return new SystemAccessPage();
    }
}
