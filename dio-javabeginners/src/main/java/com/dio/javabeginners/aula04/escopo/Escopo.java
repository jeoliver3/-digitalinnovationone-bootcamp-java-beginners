package com.dio.javabeginners.aula04.escopo;

public class Escopo {
   
    /*
    - Escopo de classe
    - Escopo de método
    - Escopo de fluxo
    
    Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi decla
    rada. A variável é criada no primeiro acesso a ela, ficando inacessível 
    após o interpretador sair do bloco de execução ao qual ela pertence.Portanto
    não pode ser lida ou manipulada por rotinas e códigos que estão fora de seu
    bloco de declaração, ou seja,  fora do escopo da variável.
    Os atributos (variáveis) são declarados no corpo principal da Classe, sendo
    portanto, acessíveis por todoos os métodos. Caso declare uma variável dentro
    de um método,  o escopo dessa variável estará limitado apenas ao corpo do
    método.
  
    */
    
    public class Conta
    {
    //Variável da classe conta
        double saldo = 10.0;
        
        
        public void sacar(Double valor)
    {
        //Variável local do método
        double novoSaldo = saldo - valor;
    
    } 
         public void imprimir()
         
         {  //Disponível em toda classe
             System.out.println(saldo);
           
       //System.out.println(novoSaldo); Somente o método sacar conhece essa var
             
         }
         
         /*Escopo de fluxo
         
            public double calcularDividaExponencial(){};
         
             Variável local de método
             double valorParcela = 50.0;
             double valorMontante = 0.0;
             for(int i =1; i <= 5; i++)
             {
                 double valorCalculado = valorParcela * i;
                 valorMontante = valorMontante + valorCalculado;
                 //i e valorCalculado vari;avel de bloco
             }
             */
            
         
        
  
    
}
}
