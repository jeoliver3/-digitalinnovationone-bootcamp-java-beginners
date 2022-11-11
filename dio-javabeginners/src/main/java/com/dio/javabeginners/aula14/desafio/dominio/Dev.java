
package com.dio.javabeginners.aula14.desafio.dominio;

import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class Dev {
    
    private String  nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    
    public void inscreverBootcamp(Bootcamp bootcamp){
    this.conteudoInscritos.addAll(bootcamp.getConteudos());
    bootcamp.getDevsInscritos().add(this);
    }
    
    public void progredir(){
    Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
    if(conteudo.isPresent())
    {
        this.conteudosConcluidos.add(conteudo.get());
        this.conteudoInscritos.remove(conteudo.get());
    }
        else
        {
            System.out.println("Você não está matriculado");
        }
    
    
    }
    
    public double calcularTotalXp(){
    return this.conteudosConcluidos
            .stream()
            .mapToDouble(Conteudo::calcularXp)
                    .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.nome);
        hash = 43 * hash + Objects.hashCode(this.conteudoInscritos);
        hash = 43 * hash + Objects.hashCode(this.conteudosConcluidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dev other = (Dev) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.conteudoInscritos, other.conteudoInscritos)) {
            return false;
        }
        if (!Objects.equals(this.conteudosConcluidos, other.conteudosConcluidos)) {
            return false;
        }
        return true;
    }
    
    
}
