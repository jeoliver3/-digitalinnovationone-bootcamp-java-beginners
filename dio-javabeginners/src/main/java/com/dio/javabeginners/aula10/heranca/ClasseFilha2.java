package com.dio.javabeginners.aula10.heranca;


 class ClasseFilha2 extends ClasseMae {
    
    @Override // sobrescreve
    void metodo1()
    {
        System.out.println("Método 1 da Classe Filha 2");
    }
    
    @Override
    void metodo2()
    {
        System.out.println("Método 2 da Classe Filha 2");
    }
}
