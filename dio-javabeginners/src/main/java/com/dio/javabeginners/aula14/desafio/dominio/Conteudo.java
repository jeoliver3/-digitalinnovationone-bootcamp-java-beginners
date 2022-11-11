
package com.dio.javabeginners.aula14.desafio.dominio;


//Uma classe abstrata, eu não consigo instanciar Conteudo no Main
public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10;
    // com static, vou poder acessar variavel XP PADRAO fora da classe Conteudo
 
    private String  titulo;
    private String  descricao;
    
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
