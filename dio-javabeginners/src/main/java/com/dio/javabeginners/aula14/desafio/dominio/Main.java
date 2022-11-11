
package com.dio.javabeginners.aula14.desafio.dominio;

//Instanciando Curso e Mentoria


import java.time.LocalDate;




public class Main {
    public static void main(String[]args)
    {
        Curso curso1 = new Curso();
        
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descriçao mentoria Java");
        mentoria.setData(LocalDate.now()); // now, vai atribuir ao horário da
        //criação do objeto
        
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();
        
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDecricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devJessy = new Dev();
        devJessy.setNome("Jessy");
        devJessy.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jessy" + devJessy.getConteudoInscritos());
        devJessy.progredir();
        System.out.println("Conteúdos Inscritos Jessy" + devJessy.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Jessy" + devJessy.getConteudosConcluidos());
        System.out.println("XP" +devJessy.calcularTotalXp());
        
        
        Dev devCami = new Dev();
        devCami.setNome("Cami");
        devCami.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cami" + devCami.getConteudoInscritos());
        devCami.progredir();
        System.out.println("Conteúdos Inscritos Cami" + devCami.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Cami" + devCami.getConteudosConcluidos());
        System.out.println("XP" +devCami.calcularTotalXp());
        
        
    }
}
