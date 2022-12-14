
package com.dio.javabeginners.aula14.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Bootcamp {
    
    private String nome;
    private String decricao;
    private final LocalDate dateInicial = LocalDate.now();
    private final LocalDate dateFinal = dateInicial.plusDays(45);
    // data inicial + 45 dias
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.decricao);
        hash = 17 * hash + Objects.hashCode(this.dateInicial);
        hash = 17 * hash + Objects.hashCode(this.dateFinal);
        hash = 17 * hash + Objects.hashCode(this.devsInscritos);
        hash = 17 * hash + Objects.hashCode(this.conteudos);
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
        final Bootcamp other = (Bootcamp) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.decricao, other.decricao)) {
            return false;
        }
        if (!Objects.equals(this.dateInicial, other.dateInicial)) {
            return false;
        }
        if (!Objects.equals(this.dateFinal, other.dateFinal)) {
            return false;
        }
        if (!Objects.equals(this.devsInscritos, other.devsInscritos)) {
            return false;
        }
        if (!Objects.equals(this.conteudos, other.conteudos)) {
            return false;
        }
        return true;
    }
    
    
}
