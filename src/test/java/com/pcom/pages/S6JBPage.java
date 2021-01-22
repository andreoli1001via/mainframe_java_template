package com.pcom.pages;

import net.sf.f3270.FieldIdentifier;
import static com.mainframe.Emulator.getTerminal;

public class S6JBPage {
    private FieldIdentifier opcao = new FieldIdentifier("1 - Dados", -2);

    public S694Page queryChangeReturnRequest() {
        getTerminal().write(opcao, "9");
        getTerminal().enter();
        return new S694Page();
    }
}
