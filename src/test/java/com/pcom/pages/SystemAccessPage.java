package com.pcom.pages;

import static com.mainframe.Emulator.getTerminal;

public class SystemAccessPage {
    public S6JAPage accessS6JA() {
        getTerminal().write("S6JA");
        getTerminal().enter();
        return new S6JAPage();
    }

    public H3AAPage accessH3AA() {
        getTerminal().write("H3AA");
        getTerminal().enter();
        return new H3AAPage();
    }



}
