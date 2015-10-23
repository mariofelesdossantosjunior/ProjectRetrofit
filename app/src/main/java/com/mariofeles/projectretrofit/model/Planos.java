/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariofeles.projectretrofit.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author vinicius
 */
public class Planos implements Serializable {

    private Long codpla;
    private String nomepla;
    private Boolean statuspla;
    private BigDecimal valorpla;
    private Integer periodopla;
    private Programas codpro;

    public Planos() {
    }

    public Planos(Long codpla) {
        this.codpla = codpla;
    }

    public Planos(Long codpla, String nomepla, Boolean statuspla, BigDecimal valorpla, Integer periodopla, Programas codpro) {
        this.codpla = codpla;
        this.nomepla = nomepla;
        this.statuspla = statuspla;
        this.valorpla = valorpla;
        this.periodopla = periodopla;
        this.codpro = codpro;
    }

    public Long getCodpla() {
        return codpla;
    }

    public void setCodpla(Long codpla) {
        this.codpla = codpla;
    }

    public String getNomepla() {
        return nomepla;
    }

    public void setNomepla(String nomepla) {
        this.nomepla = nomepla;
    }

    public Boolean getStatuspla() {
        return statuspla;
    }

    public void setStatuspla(Boolean statuspla) {
        this.statuspla = statuspla;
    }

    public BigDecimal getValorpla() {
        return valorpla;
    }

    public void setValorpla(BigDecimal valorpla) {
        this.valorpla = valorpla;
    }

    public Integer getPeriodopla() {
        return periodopla;
    }

    public void setPeriodopla(Integer periodopla) {
        this.periodopla = periodopla;
    }

    public Programas getCodpro() {
        return codpro;
    }

    public void setCodpro(Programas codpro) {
        this.codpro = codpro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.codpla);
        hash = 89 * hash + Objects.hashCode(this.nomepla);
        hash = 89 * hash + Objects.hashCode(this.statuspla);
        hash = 89 * hash + Objects.hashCode(this.valorpla);
        hash = 89 * hash + Objects.hashCode(this.periodopla);
        hash = 89 * hash + Objects.hashCode(this.codpro);
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
        final Planos other = (Planos) obj;
        if (!Objects.equals(this.codpla, other.codpla)) {
            return false;
        }
        if (!Objects.equals(this.nomepla, other.nomepla)) {
            return false;
        }
        if (!Objects.equals(this.statuspla, other.statuspla)) {
            return false;
        }
        if (!Objects.equals(this.valorpla, other.valorpla)) {
            return false;
        }
        if (!Objects.equals(this.periodopla, other.periodopla)) {
            return false;
        }
        if (!Objects.equals(this.codpro, other.codpro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Planos{" + "codpla=" + codpla + ", nomepla=" + nomepla + ", statuspla=" + statuspla + ", valorpla=" + valorpla + ", periodopla=" + periodopla + ", codpro=" + codpro + '}';
    }

}
