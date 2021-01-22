package com.pcom.pages;

import net.sf.f3270.FieldIdentifier;
import static com.mainframe.Emulator.getTerminal;

import java.util.HashMap;
import java.util.Map;

public class S6AQPage {
    private FieldIdentifier statusPedido = new FieldIdentifier("Pedido:", 4, 2);
    private FieldIdentifier rotaEstado = new FieldIdentifier("Rota:");
    private FieldIdentifier rotaId = new FieldIdentifier("Rota:", 2);
    private FieldIdentifier filialEntrega = new FieldIdentifier("Fl Etg:", 2);
    private FieldIdentifier depositoEntrega = new FieldIdentifier("Dp Etg:", 2);

    public Map<String, String> getOrderDetails() {
        Map<String, String> orderFields = new HashMap<>();
        orderFields.put("status", getTerminal().getField(statusPedido).getText().trim());
        orderFields.put("rotaEstado", getTerminal().getField(rotaEstado).getText().trim());
        orderFields.put("rotaId", getTerminal().getField(rotaId).getText().trim());
        if (getTerminal().screenHasLabel(filialEntrega)) {
            orderFields.put("filialEntrega", getTerminal().getField(filialEntrega).getText().trim());
        }
        if (getTerminal().screenHasLabel(depositoEntrega)) {
            orderFields.put("depositoEntrega", getTerminal().getField(depositoEntrega).getText().trim());
        }
        return orderFields;
    }
}
