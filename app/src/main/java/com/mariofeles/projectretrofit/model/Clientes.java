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
public class Clientes implements Serializable {

    private Long codcli;
    private String cpfcli;
    private String cnpjcli;
    private String iecli;
    private String rgcli;
    private String emailcli;
    private String contratocli;
    private String razaocli;
    private String nomecli;
    private String fantaziacli;
    private Boolean statuscli;
    private Boolean tipocli;
    private Date datacadcli;

    public Clientes() {
    }

    public Clientes(Long codcli) {
        this.codcli = codcli;
    }

    public Clientes(Long codcli, String cpfcli, String cnpjcli, String iecli, String rgcli, String emailcli, String contratocli, String razaocli, String nomecli, String fantaziacli, Boolean statuscli, Boolean tipocli, Date datacadcli) {
        this.codcli = codcli;
        this.cpfcli = cpfcli;
        this.cnpjcli = cnpjcli;
        this.iecli = iecli;
        this.rgcli = rgcli;
        this.emailcli = emailcli;
        this.contratocli = contratocli;
        this.razaocli = razaocli;
        this.nomecli = nomecli;
        this.fantaziacli = fantaziacli;
        this.statuscli = statuscli;
        this.statuscli = tipocli;
        this.datacadcli = datacadcli;
    }

    public Long getCodcli() {
        return codcli;
    }

    public void setCodcli(Long codcli) {
        this.codcli = codcli;
    }

    public String getCpfcli() {
        return cpfcli;
    }

    public void setCpfcli(String cpfcli) {
        this.cpfcli = cpfcli;
    }

    public String getCnpjcli() {
        return cnpjcli;
    }

    public void setCnpjcli(String cnpjcli) {
        this.cnpjcli = cnpjcli;
    }

    public String getIecli() {
        return iecli;
    }

    public void setIecli(String iecli) {
        this.iecli = iecli;
    }

    public String getRgcli() {
        return rgcli;
    }

    public void setRgcli(String rgcli) {
        this.rgcli = rgcli;
    }

    public String getEmailcli() {
        return emailcli;
    }

    public void setEmailcli(String emailcli) {
        this.emailcli = emailcli;
    }

    public String getContratocli() {
        return contratocli;
    }

    public void setContratocli(String contratocli) {
        this.contratocli = contratocli;
    }

    public String getRazaocli() {
        return razaocli;
    }

    public void setRazaocli(String razaocli) {
        this.razaocli = razaocli;
    }

    public String getNomecli() {
        return nomecli;
    }

    public void setNomecli(String nomecli) {
        this.nomecli = nomecli;
    }

    public String getFantaziacli() {
        return fantaziacli;
    }

    public void setFantaziacli(String fantaziacli) {
        this.fantaziacli = fantaziacli;
    }

    public Boolean getStatuscli() {
        return statuscli;
    }

    public Boolean getTipocli() {
        return tipocli;
    }

    public void setTipocli(Boolean tipocli) {
        this.tipocli = tipocli;
    }

    public void setStatuscli(Boolean statuscli) {
        this.statuscli = statuscli;
    }

    public Date getDatacadcli() {
        return datacadcli;
    }

    public void setDatacadcli(Date datacadcli) {
        this.datacadcli = datacadcli;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.codcli);
        hash = 17 * hash + Objects.hashCode(this.cpfcli);
        hash = 17 * hash + Objects.hashCode(this.cnpjcli);
        hash = 17 * hash + Objects.hashCode(this.iecli);
        hash = 17 * hash + Objects.hashCode(this.rgcli);
        hash = 17 * hash + Objects.hashCode(this.emailcli);
        hash = 17 * hash + Objects.hashCode(this.contratocli);
        hash = 17 * hash + Objects.hashCode(this.razaocli);
        hash = 17 * hash + Objects.hashCode(this.nomecli);
        hash = 17 * hash + Objects.hashCode(this.fantaziacli);
        hash = 17 * hash + Objects.hashCode(this.statuscli);
        hash = 17 * hash + Objects.hashCode(this.tipocli);
        hash = 17 * hash + Objects.hashCode(this.datacadcli);
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
        final Clientes other = (Clientes) obj;
        if (!Objects.equals(this.codcli, other.codcli)) {
            return false;
        }
        if (!Objects.equals(this.cpfcli, other.cpfcli)) {
            return false;
        }
        if (!Objects.equals(this.cnpjcli, other.cnpjcli)) {
            return false;
        }
        if (!Objects.equals(this.iecli, other.iecli)) {
            return false;
        }
        if (!Objects.equals(this.rgcli, other.rgcli)) {
            return false;
        }
        if (!Objects.equals(this.emailcli, other.emailcli)) {
            return false;
        }
        if (!Objects.equals(this.contratocli, other.contratocli)) {
            return false;
        }
        if (!Objects.equals(this.razaocli, other.razaocli)) {
            return false;
        }
        if (!Objects.equals(this.nomecli, other.nomecli)) {
            return false;
        }
        if (!Objects.equals(this.fantaziacli, other.fantaziacli)) {
            return false;
        }
        if (!Objects.equals(this.statuscli, other.statuscli)) {
            return false;
        }
        if (!Objects.equals(this.tipocli, other.tipocli)) {
            return false;
        }
        if (!Objects.equals(this.datacadcli, other.datacadcli)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clientes{" + "codcli=" + codcli + ", cpfcli=" + cpfcli + ", cnpjcli=" + cnpjcli + ", iecli=" + iecli + ", rgcli=" + rgcli + ", emailcli=" + emailcli + ", contratocli=" + contratocli + ", razaocli=" + razaocli + ", nomecli=" + nomecli + ", fantaziacli=" + fantaziacli + ", statuscli=" + statuscli + ", tipocli=" + tipocli + ", datacadcli=" + datacadcli + '}';
    }

}
