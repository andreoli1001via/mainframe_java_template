package com.pcom.pages;

import net.sf.f3270.FieldIdentifier;
import static com.mainframe.Emulator.getTerminal;

public class StartPage {
    private FieldIdentifier nomeTerminal = new FieldIdentifier("Terminal:");

    public EnvironmentsPage accessMainframeSystem() {
        System.out.println(getTerminal().getField(nomeTerminal).getText().trim());
        getTerminal().enter();
        return new EnvironmentsPage();
    }
}
