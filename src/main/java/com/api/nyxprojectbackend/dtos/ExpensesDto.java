package com.api.nyxprojectbackend.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ExpensesDto {
    @NotBlank
    @Size(max = 4)
    private int anoMovimentacao;
    @NotBlank
    private int mesMovimentacao;
    @NotBlank
    private int orgaoCodigo;
    @NotBlank
    @Size(max = 90)
    private String orgaoNome;
    @NotBlank
    private float unidadeCodigo;
    @NotBlank
    @Size(max = 98)
    private String unidadeNome;
    @NotBlank
    private int categoriaEconomicaCodigo;
    @NotBlank
    @Size(max = 19)
    private String categoriaEconomicaNome;
    @NotBlank
    private int grupoDespesaCodigo;
    @NotBlank
    @Size(max = 26)
    private String grupoDespesaNome;
    @NotBlank
    private int modalidadeAplicacaoCodigo;
    @NotBlank
    @Size(max = 26)
    private String modalidadeAplicacaoNome;
    @NotBlank
    private int elementoCodigo;
    @NotBlank
    @Size(max = 67)
    private String elementoNome;
    @NotBlank
    private int subelementoCodigo;
    @NotBlank
    @Size(max = 90)
    private String subelementoNome;
    @NotBlank
    private int funcaoCodigo;
    @NotBlank
    @Size(max = 21)
    private String funcaoNome;
    @NotBlank
    private int subfuncaoCodigo;
    @NotBlank
    @Size(max = 48)
    private String subfuncaoNome;
    @NotBlank
    private int programaCodigo;
    @NotBlank
    @Size(max = 104)
    private String programaNome;
    @NotBlank
    private int acaoCodigo;
    @NotBlank
    @Size(max = 129)
    private String acaoNome;
    @NotBlank
    private int fonteRecursoCodigo;
    @NotBlank
    @Size(max = 55)
    private String fonteRecursoNome;
    @NotBlank
    private int empenhoAno;
    @NotBlank
    @Size(max = 21)
    private String empenhoModalidadeNome;
    @NotBlank
    private int empenhoModalidadeCodigo;
    @NotBlank
    private int empenhoNumero;
    @NotBlank
    private int subempenho;
    @NotBlank
    @Size(max = 1)
    private String indicadorSubempenho;
    @NotBlank
    private int credorCodigo;
    @NotBlank
    @Size(max = 118)
    private String credorNome;
    @NotBlank
    private int modalidadeLicitacaoCodigo;
    @NotBlank
    @Size(max = 31)
    private String modalidadeLicitacaoNome;
    @NotBlank
    private float valorEmpenhado;
    @NotBlank
    private float valorLiquidado;
    @NotBlank
    private float valorPago;

    public int getanoMovimentacao() {
        return anoMovimentacao;
    }

    public void setanoMovimentacao(int anoMovimentacao) {
        this.anoMovimentacao = anoMovimentacao;
    }

    public int getmesMovimentacao() {
        return mesMovimentacao;
    }

    public void setmesMovimentacao(int mesMovimentacao) {
        this.mesMovimentacao = mesMovimentacao;
    }

    public int getorgaoCodigo() {
        return orgaoCodigo;
    }

    public void setorgaoCodigo(int orgaoCodigo) {
        this.orgaoCodigo = orgaoCodigo;
    }

    public String getorgaoNome() {
        return orgaoNome;
    }

    public void setorgaoNome(String orgaoNome) {
        this.orgaoNome = orgaoNome;
    }

    public float getunidadeCodigo() {
        return unidadeCodigo;
    }

    public void setunidadeCodigo(float unidadeCodigo) {
        this.unidadeCodigo = unidadeCodigo;
    }

    public String getunidadeNome() {
        return unidadeNome;
    }

    public void setunidadeNome(String unidadeNome) {
        this.unidadeNome = unidadeNome;
    }

    public int getcategoriaEconomicaCodigo() {
        return categoriaEconomicaCodigo;
    }

    public void setcategoriaEconomicaCodigo(int categoriaEconomicaCodigo) {
        this.categoriaEconomicaCodigo = categoriaEconomicaCodigo;
    }

    public String getcategoriaEconomicaNome() {
        return categoriaEconomicaNome;
    }

    public void setcategoriaEconomicaNome(String categoriaEconomicaNome) {
        this.categoriaEconomicaNome = categoriaEconomicaNome;
    }

    public int getgrupoDespesaCodigo() {
        return grupoDespesaCodigo;
    }

    public void setgrupoDespesaCodigo(int grupoDespesaCodigo) {
        this.grupoDespesaCodigo = grupoDespesaCodigo;
    }

    public String getgrupoDespesaNome() {
        return grupoDespesaNome;
    }

    public void setgrupoDespesaNome(String grupoDespesaNome) {
        this.grupoDespesaNome = grupoDespesaNome;
    }

    public int getmodalidadeAplicacaoCodigo() {
        return modalidadeAplicacaoCodigo;
    }

    public void setmodalidadeAplicacaoCodigo(int modalidadeAplicacaoCodigo) {
        this.modalidadeAplicacaoCodigo = modalidadeAplicacaoCodigo;
    }

    public String getmodalidadeAplicacaoNome() {
        return modalidadeAplicacaoNome;
    }

    public void setmodalidadeAplicacaoNome(String modalidadeAplicacaoNome) {
        this.modalidadeAplicacaoNome = modalidadeAplicacaoNome;
    }

    public int getelementoCodigo() {
        return elementoCodigo;
    }

    public void setelementoCodigo(int elementoCodigo) {
        this.elementoCodigo = elementoCodigo;
    }

    public String getelementoNome() {
        return elementoNome;
    }

    public void setelementoNome(String elementoNome) {
        this.elementoNome = elementoNome;
    }

    public int getSubelementoCodigo() {
        return subelementoCodigo;
    }

    public void setSubelementoCodigo(int subelementoCodigo) {
        this.subelementoCodigo = subelementoCodigo;
    }

    public String getSubelementoNome() {
        return subelementoNome;
    }

    public void setSubelementoNome(String subelementoNome) {
        this.subelementoNome = subelementoNome;
    }

    public int getfuncaoCodigo() {
        return funcaoCodigo;
    }

    public void setfuncaoCodigo(int funcaoCodigo) {
        this.funcaoCodigo = funcaoCodigo;
    }

    public String getfuncaoNome() {
        return funcaoNome;
    }

    public void setfuncaoNome(String funcaoNome) {
        this.funcaoNome = funcaoNome;
    }

    public int getSubfuncaoCodigo() {
        return subfuncaoCodigo;
    }

    public void setSubfuncaoCodigo(int subfuncaoCodigo) {
        this.subfuncaoCodigo = subfuncaoCodigo;
    }

    public String getSubfuncaoNome() {
        return subfuncaoNome;
    }

    public void setSubfuncaoNome(String subfuncaoNome) {
        this.subfuncaoNome = subfuncaoNome;
    }

    public int getprogramaCodigo() {
        return programaCodigo;
    }

    public void setprogramaCodigo(int programaCodigo) {
        this.programaCodigo = programaCodigo;
    }

    public String getprogramaNome() {
        return programaNome;
    }

    public void setprogramaNome(String programaNome) {
        this.programaNome = programaNome;
    }

    public int getacaoCodigo() {
        return acaoCodigo;
    }

    public void setacaoCodigo(int acaoCodigo) {
        this.acaoCodigo = acaoCodigo;
    }

    public String getacaoNome() {
        return acaoNome;
    }

    public void setacaoNome(String acaoNome) {
        this.acaoNome = acaoNome;
    }

    public int getfonteRecursoCodigo() {
        return fonteRecursoCodigo;
    }

    public void setfonteRecursoCodigo(int fonteRecursoCodigo) {
        this.fonteRecursoCodigo = fonteRecursoCodigo;
    }

    public String getfonteRecursoNome() {
        return fonteRecursoNome;
    }

    public void setfonteRecursoNome(String fonteRecursoNome) {
        this.fonteRecursoNome = fonteRecursoNome;
    }

    public int getempenhoAno() {
        return empenhoAno;
    }

    public void setempenhoAno(int empenhoAno) {
        this.empenhoAno = empenhoAno;
    }

    public String getempenhoModalidadeNome() {
        return empenhoModalidadeNome;
    }

    public void setempenhoModalidadeNome(String empenhoModalidadeNome) {
        this.empenhoModalidadeNome = empenhoModalidadeNome;
    }

    public int getempenhoModalidadeCodigo() {
        return empenhoModalidadeCodigo;
    }

    public void setempenhoModalidadeCodigo(int empenhoModalidadeCodigo) {
        this.empenhoModalidadeCodigo = empenhoModalidadeCodigo;
    }

    public int getempenhoNumero() {
        return empenhoNumero;
    }

    public void setempenhoNumero(int empenhoNumero) {
        this.empenhoNumero = empenhoNumero;
    }

    public int getSubempenho() {
        return subempenho;
    }

    public void setSubempenho(int subempenho) {
        this.subempenho = subempenho;
    }

    public String getindicadorSubempenho() {
        return indicadorSubempenho;
    }

    public void setindicadorSubempenho(String indicadorSubempenho) {
        this.indicadorSubempenho = indicadorSubempenho;
    }

    public int getcredorCodigo() {
        return credorCodigo;
    }

    public void setcredorCodigo(int credorCodigo) {
        this.credorCodigo = credorCodigo;
    }

    public String getcredorNome() {
        return credorNome;
    }

    public void setcredorNome(String credorNome) {
        this.credorNome = credorNome;
    }

    public int getmodalidadeLicitacaoCodigo() {
        return modalidadeLicitacaoCodigo;
    }

    public void setmodalidadeLicitacaoCodigo(int modalidadeLicitacaoCodigo) {
        this.modalidadeLicitacaoCodigo = modalidadeLicitacaoCodigo;
    }

    public String getmodalidadeLicitacaoNome() {
        return modalidadeLicitacaoNome;
    }

    public void setmodalidadeLicitacaoNome(String modalidadeLicitacaoNome) {
        this.modalidadeLicitacaoNome = modalidadeLicitacaoNome;
    }

    public float getvalorEmpenhado() {
        return valorEmpenhado;
    }

    public void setvalorEmpenhado(float valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }

    public float getvalorLiquidado() {
        return valorLiquidado;
    }

    public void setvalorLiquidado(float valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }

    public float getvalorPago() {
        return valorPago;
    }

    public void setvalorPago(float valorPago) {
        this.valorPago = valorPago;
    }
}
