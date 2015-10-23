/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariofeles.projectretrofit.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author vinicius
 */
public class PlanosCliente implements Serializable {

    private Long codplacli;
    private Boolean statusplacli;
    private Date datavencimentoplacli;
    private Date dataquisicaoplacli;
    private Integer carenciaplacli;
    private Integer qtdeusudesktopplacli;
    private Integer qtdeusumobileplacli;
    private Integer instalacaoplacli;
    private String chaveplancli;
    private Clientes codcli;
    private Planos codpla;

    public PlanosCliente() {
    }

    public PlanosCliente(Long codplacli) {
        this.codplacli = codplacli;
    }

    public PlanosCliente(Long codplacli, Boolean statusplacli, Date datavencimentoplacli, Date dataquisicaoplacli, Integer carenciaplacli, int qtdeusudesktopplacli, Integer qtdeusumobileplacli, Integer instalacaoplacli, String chaveplancli, Clientes codcli, Planos codpla) {
        this.codplacli = codplacli;
        this.statusplacli = statusplacli;
        this.datavencimentoplacli = datavencimentoplacli;
        this.dataquisicaoplacli = dataquisicaoplacli;
        this.carenciaplacli = carenciaplacli;
        this.qtdeusudesktopplacli = qtdeusudesktopplacli;
        this.qtdeusumobileplacli = qtdeusumobileplacli;
        this.instalacaoplacli = instalacaoplacli;
        this.chaveplancli = chaveplancli;
        this.codcli = codcli;
        this.codpla = codpla;
    }

    public Long getCodplacli() {
        return codplacli;
    }

    public void setCodplacli(Long codplacli) {
        this.codplacli = codplacli;
    }

    public Boolean getStatusplacli() {
        return statusplacli;
    }

    public void setStatusplacli(Boolean statusplacli) {
        this.statusplacli = statusplacli;
    }

    public Date getDatavencimentoplacli() {
        return datavencimentoplacli;
    }

    public void setDatavencimentoplacli(Date datavencimentoplacli) {
        this.datavencimentoplacli = datavencimentoplacli;
    }

    public Date getDataquisicaoplacli() {
        return dataquisicaoplacli;
    }

    public void setDataquisicaoplacli(Date dataquisicaoplacli) {
        this.dataquisicaoplacli = dataquisicaoplacli;
    }

    public Integer getCarenciaplacli() {
        return carenciaplacli;
    }

    public void setCarenciaplacli(Integer carenciaplacli) {
        this.carenciaplacli = carenciaplacli;
    }

    public Integer getQtdeusudesktopplacli() {
        return qtdeusudesktopplacli;
    }

    public void setQtdeusudesktopplacli(Integer qtdeusudesktopplacli) {
        this.qtdeusudesktopplacli = qtdeusudesktopplacli;
    }

    public Integer getQtdeusumobileplacli() {
        return qtdeusumobileplacli;
    }

    public void setQtdeusumobileplacli(Integer qtdeusumobileplacli) {
        this.qtdeusumobileplacli = qtdeusumobileplacli;
    }

    public Integer getInstalacaoplacli() {
        return instalacaoplacli;
    }

    public void setInstalacaoplacli(Integer instalacaoplacli) {
        this.instalacaoplacli = instalacaoplacli;
    }

    public String getChaveplancli() {
        return chaveplancli;
    }

    public void setChaveplancli(String chaveplancli) {
        this.chaveplancli = chaveplancli;
    }

    public Clientes getCodcli() {
        return codcli;
    }

    public void setCodcli(Clientes codcli) {
        this.codcli = codcli;
    }

    public Planos getCodpla() {
        return codpla;
    }

    public void setCodpla(Planos codpla) {
        this.codpla = codpla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.codplacli);
        hash = 29 * hash + Objects.hashCode(this.statusplacli);
        hash = 29 * hash + Objects.hashCode(this.datavencimentoplacli);
        hash = 29 * hash + Objects.hashCode(this.dataquisicaoplacli);
        hash = 29 * hash + Objects.hashCode(this.carenciaplacli);
        hash = 29 * hash + Objects.hashCode(this.qtdeusudesktopplacli);
        hash = 29 * hash + Objects.hashCode(this.qtdeusumobileplacli);
        hash = 29 * hash + Objects.hashCode(this.instalacaoplacli);
        hash = 29 * hash + Objects.hashCode(this.chaveplancli);
        hash = 29 * hash + Objects.hashCode(this.codcli);
        hash = 29 * hash + Objects.hashCode(this.codpla);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PlanosCliente other = (PlanosCliente) obj;
        if (!Objects.equals(this.codplacli, other.codplacli)) {
            return false;
        }
        if (!Objects.equals(this.statusplacli, other.statusplacli)) {
            return false;
        }
        if (!Objects.equals(this.datavencimentoplacli, other.datavencimentoplacli)) {
            return false;
        }
        if (!Objects.equals(this.dataquisicaoplacli, other.dataquisicaoplacli)) {
            return false;
        }
        if (!Objects.equals(this.carenciaplacli, other.carenciaplacli)) {
            return false;
        }
        if (!Objects.equals(this.qtdeusudesktopplacli, other.qtdeusudesktopplacli)) {
            return false;
        }
        if (!Objects.equals(this.qtdeusumobileplacli, other.qtdeusumobileplacli)) {
            return false;
        }
        if (!Objects.equals(this.instalacaoplacli, other.instalacaoplacli)) {
            return false;
        }
        if (!Objects.equals(this.chaveplancli, other.chaveplancli)) {
            return false;
        }
        if (!Objects.equals(this.codcli, other.codcli)) {
            return false;
        }
        if (!Objects.equals(this.codpla, other.codpla)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PlanosCliente{" + "codplacli=" + codplacli + ", statusplacli=" + statusplacli + ", datavencimentoplacli=" + datavencimentoplacli + ", dataquisicaoplacli=" + dataquisicaoplacli + ", carenciaplacli=" + carenciaplacli + ", qtdeusudesktopplacli=" + qtdeusudesktopplacli + ", qtdeusumobileplacli=" + qtdeusumobileplacli + ", instalacaoplacli=" + instalacaoplacli + ", chaveplancli=" + chaveplancli + ", codcli=" + codcli + ", codpla=" + codpla + '}';
    }

}
