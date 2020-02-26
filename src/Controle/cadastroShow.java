/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import java.util.Date;

/**
 *
 * @author laien_000
 */
public class cadastroShow {

    private int idAgenda;
    private String nome;
    private double valor;
    private Date data;
    private String horarioInicio;
    private String horarioFim;
    private String generoShow;
    private Boolean showPrincipal;
    private String informacaoGeral;
    private Date dataPesquisa;

    public cadastroShow() {
    }

    public cadastroShow(int idAgenda, String nome, double valor, Date data,
            String horarioInicio, String horarioFim, String generoShow,
            Boolean showPrincipal, String informacaoGeral) {
        this.idAgenda = idAgenda;
        this.nome = nome;
        this.valor = valor;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.generoShow = generoShow;
        this.showPrincipal = showPrincipal;
        this.informacaoGeral = informacaoGeral;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    public void setGeneroShow(String generoShow) {
        this.generoShow = generoShow;
    }

    public void setShowPrincipal(Boolean showPrincipal) {
        this.showPrincipal = showPrincipal;
    }

    public void setInformacaoGeral(String informacaoGeral) {
        this.informacaoGeral = informacaoGeral;
    }

    public Date getDataPesquisa() {
        return dataPesquisa;
    }

    public void setDataPesquisa(Date dataPesquisa) {
        this.dataPesquisa = dataPesquisa;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public String getGeneroShow() {
        return generoShow;
    }

    public Boolean getShowPrincipal() {
        return showPrincipal;
    }

    public String getInformacaoGeral() {
        return informacaoGeral;
    }

    @Override
    public String toString() {
        return "cadastroShow{" + "idAgenda= " + idAgenda + ", nome= " + nome
                + ", valor= " + valor + ", data= " + data + ", horarioInicio= "
                + horarioInicio + ", horarioFim= " + horarioFim + ", generoShow= "
                + generoShow + ", showPrincipal= " + showPrincipal
                + ", informacaoGeral= " + informacaoGeral + '}';
    }

}
