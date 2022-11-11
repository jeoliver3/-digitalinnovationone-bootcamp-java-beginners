
package com.dio.javabeginners.aula14.desafio.dominio;

import java.time.LocalDate;

//para inserir getter and setter, ir em Source e insert code

 public  class Mentoria extends Conteudo{
    
    
    private LocalDate   data; // trabalhandio com  datas

    
      @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    
    public Mentoria(){};
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria: data" + data + "titulo=" + getTitulo()+ 
                "descricao="+getDescricao();
    }

     
}
