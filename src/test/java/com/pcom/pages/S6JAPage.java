package com.pcom.pages;

import net.sf.f3270.FieldIdentifier;
import static com.mainframe.Emulator.getTerminal;

public class S6JAPage {
    private FieldIdentifier empresa = new FieldIdentifier("Empresa:");
    private FieldIdentifier filial = new FieldIdentifier("Filial:");
    private FieldIdentifier tipoAtividade = new FieldIdentifier("Tipo Ativ:");
    private FieldIdentifier matriculaEmpresa = new FieldIdentifier("Matrícula:");
    private FieldIdentifier matricula = new FieldIdentifier("Matrícula:", 2);
    private FieldIdentifier senha = new FieldIdentifier("Senha:");
    private FieldIdentifier opcao = new FieldIdentifier("1 - Solicitação de Troca / Devolução", -2);
    private FieldIdentifier operacao = new FieldIdentifier("1-Consulta", -1);

    public S6JBPage queryChangeReturnRequest() {
        getTerminal().write(empresa, "21");
        getTerminal().write(filial, "1200");
        getTerminal().write(tipoAtividade, "D");
        getTerminal().write(matriculaEmpresa, "21");
        getTerminal().write(matricula, "307556");
        getTerminal().write(senha, "homolog02");
        getTerminal().write(opcao, "1");
        getTerminal().write(operacao, "1");
        getTerminal().enter();
        return new S6JBPage();
    }
}
