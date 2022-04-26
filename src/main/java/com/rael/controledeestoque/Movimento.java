
package com.rael.controledeestoque;

import java.util.Date;


public class Movimento {
    private Date data;
    private String qtd;
    private int idmov;
    private String descricao;

    public Movimento() {
        
    }

    public Movimento(Date data, String qtd, int idmov, String descricao) {
        this.data = data;
        this.qtd = qtd;
        this.idmov = idmov;
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getQtd() {
        return qtd;
    }

    public void setQtd(String qtd) {
        this.qtd = qtd;
    }

    public int getIdmov() {
        return idmov;
    }

    public void setIdmov(int idmov) {
        this.idmov = idmov;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

    
    
}
