package com.rael.controledeestoque;


public class Produtos {
    private int id;
    private String descricao;
    private double qtdatual;
    private double valorunit;
    
    public Produtos (){
        
    }
    
    public Produtos(int ID, String Descricao, String qtdatual, String valorunit){
        this.id = id;
        this.descricao = descricao;
        this.setqtdatual(qtdatual);
        this.setvalorunit(valorunit);
    }
    
    public int getid(){
        return id;
    }
    
    public String getdescricao(){
        return descricao;
    }
    
    public double getqtdatual(){
        return qtdatual;
    }
    
    public double getvalorunit(){
        return valorunit;
    }
    
    public double getValorTotal() {
        return this.qtdatual * this.valorunit;
    }
    
    public void setid(int id){
        this.id = id;
    }
    
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setqtdatual(String qtdatual){
        this.qtdatual = Double.parseDouble(qtdatual);
    }
    
    public void setqtdatual(double qtdatual){
        this.qtdatual = qtdatual;
    }

    public void setvalorunit (String valorunit){
        this.valorunit = Double.parseDouble(valorunit);
    }
    public void setvalorunit (double valorunit){
        this.valorunit = valorunit;
    }
    
}
