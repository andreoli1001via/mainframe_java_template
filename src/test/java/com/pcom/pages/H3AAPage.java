package com.pcom.pages;


import net.sf.f3270.FieldIdentifier;

//import java.util.HashMap;

import static com.mainframe.Emulator.getTerminal;

public class H3AAPage {
    public boolean listFields() {
        FieldIdentifier empresa = new FieldIdentifier("Emp:");
        FieldIdentifier filial = new FieldIdentifier("Filial:");
        FieldIdentifier tipoAtividade = new FieldIdentifier("T. Ativ:");
        FieldIdentifier matriculaEmpresa = new FieldIdentifier("Matr:");
        FieldIdentifier matricula = new FieldIdentifier("Matr:", 2);
        FieldIdentifier senha = new FieldIdentifier("Senha:");
        FieldIdentifier opcao = new FieldIdentifier("CPF:");
        getTerminal().write(empresa, "21");
        getTerminal().write(filial, "1000");
        getTerminal().write(tipoAtividade, "L");
        getTerminal().write(matriculaEmpresa, "21");
        getTerminal().write(matricula, "1192582");
        getTerminal().write(senha, "homolog06");
        getTerminal().write(opcao, "34871759830");
        getTerminal().enter();
        getTerminal().pf(12);

        //S6BLM01
        FieldIdentifier tipovenda = new FieldIdentifier("T.Ve:");
        getTerminal().write(tipovenda, "VV");
        FieldIdentifier tipoentrega = new FieldIdentifier("T.Entrega:");
        getTerminal().write(tipoentrega, "SD");
        //FieldIdentifier turno = new FieldIdentifier("Turno  :(");
        //getTerminal().write(turno, "x");
        FieldIdentifier agordem = new FieldIdentifier("Ag.Ord.:");
        getTerminal().write(agordem, "N");
        FieldIdentifier agcheq = new FieldIdentifier("Ag.Cheq:");
        getTerminal().write(agcheq, "N");
        FieldIdentifier maladireta = new FieldIdentifier("Mala Direta (S/N):");
        getTerminal().write(maladireta, "N");
        FieldIdentifier telres = new FieldIdentifier("Telefones: Res.:(", 3);
        getTerminal().write(telres, "NAO TEM");
        FieldIdentifier celular = new FieldIdentifier("Cel.:(", 3);
        getTerminal().write(celular, "NAO TEM");
        getTerminal().enter();


        //S6BLM03
        FieldIdentifier impressao = new FieldIdentifier("impressão :");
        getTerminal().write(impressao, "5");
        FieldIdentifier boa = new FieldIdentifier("Boa:(");
        getTerminal().write(boa, "x");
        //FieldIdentifier quantidade = new FieldIdentifier("Mostruário:(", 4);
        //getTerminal().write(quantidade, "2");
        getTerminal().moveCursor(10, 2);
        getTerminal().write("2");
        //FieldIdentifier sku = new FieldIdentifier("Mostruário:(", 4);
        //getTerminal().write(sku, "19");
        getTerminal().moveCursor(10, 6);
        getTerminal().write("19");
        getTerminal().enter();
        getTerminal().enter();
        getTerminal().enter();
        getTerminal().enter();


        //S6BLM06
        FieldIdentifier dinheiro = new FieldIdentifier("Dinheiro ........:(");
        getTerminal().write(dinheiro, "x");
        FieldIdentifier valorcompra = new FieldIdentifier("Dinheiro ........:(", 3);
        getTerminal().write(valorcompra, "698,00");
        getTerminal().enter();
        getTerminal().enter();
        getTerminal().pf(3);
        getTerminal().pf(3);
        getTerminal().pf(3);
        getTerminal().pf(3);
        getTerminal().pf(3);





        //FieldIdentifier valorDaCompra = new FieldIdentifier("Total da Compra :R$");

        //public Map<String, String> getValueDetails() {
        //  Map<String, String> valueFields = new HashMap<>();
        // valueFields.put("valorDaCompra", getTerminal().getField(valorDaCompra).getText().trim());
        //return valueFields;
        //}

        //getTerminal().printFields(getValueDetails);


        //FieldIdentifier valorcompra = new FieldIdentifier("Total da Compra :R$");

return true;
    }
}
