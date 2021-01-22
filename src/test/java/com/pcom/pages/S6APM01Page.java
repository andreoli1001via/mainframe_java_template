package com.pcom.pages;

import static com.mainframe.Emulator.getTerminal;

public class S6APM01Page {
    public S6AQPage getPosition() {
        getTerminal().pf(6);
        return new S6AQPage();
    }
}
