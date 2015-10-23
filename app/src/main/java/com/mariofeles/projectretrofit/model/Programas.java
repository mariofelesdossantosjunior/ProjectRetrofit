/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mariofeles.projectretrofit.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mario Feles
 */
public class Programas {

    private Long codpro;
    private String nomepro;

    public Programas() {
    }

    public Programas(Long codpro) {
        this.codpro = codpro;
    }

    public Programas(Long codpro, String nomepro) {
        this.codpro = codpro;
        this.nomepro = nomepro;
    }

    public Long getCodpro() {
        return codpro;
    }

    public void setCodpro(Long codpro) {
        this.codpro = codpro;
    }

    public String getNomepro() {
        return nomepro;
    }

    public void setNomepro(String nomepro) {
        this.nomepro = nomepro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.codpro);
        hash = 29 * hash + Objects.hashCode(this.nomepro);
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
        final Programas other = (Programas) obj;
        if (!Objects.equals(this.codpro, other.codpro)) {
            return false;
        }
        if (!Objects.equals(this.nomepro, other.nomepro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Programas{" + "codpro=" + codpro + ", nomepro=" + nomepro + '}';
    }

}
