package com.pcom.pages;

import net.sf.f3270.FieldIdentifier;
import static com.mainframe.Emulator.getTerminal;

public class S694Page {
    private FieldIdentifier numeroPedido = new FieldIdentifier("Número Pedido CNova....:");

    public S6APM01Page queryCNovaOrderAndGetDetails(String orderId) {
        getTerminal().write(numeroPedido, orderId);
        getTerminal().enter();
        getTerminal().tab();
        getTerminal().write("X");
        getTerminal().pf(4);
        if (getTerminal().getLine(0).contains("S6APM01")) {
            return new S6APM01Page();
        } else {
            System.out.println("Não foi possivel acessar a tela de detalhe. Mensagem de erro: " + getTerminal().getLine(23).trim());
            return null;
        }
    }
}
