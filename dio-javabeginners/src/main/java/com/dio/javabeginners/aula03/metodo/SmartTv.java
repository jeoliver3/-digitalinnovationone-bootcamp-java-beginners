package com.dio.javabeginners.aula03.metodo;

public class SmartTv {
    
    
    
    /*
        Exercício. SmartTv = classse.
        - Características: ligada(boolean) canal(int) volume(int).
        - Poderá ligar e desligar / muda seu estado.
        - Aumentará e diminuirá de volume +1 -1
        - Poderá mudar de canal definindo o número correspondente.
        - Essa classe será linkada com outra classe principal chamada usuário.
        */
    
        //Setando valores iniciais
        boolean ligada = false;
        int canal = 1;
        int volume = 25;
        
        //Métodos que manipulam o estado da TV
        
        public void ligar()
        {
            ligada= true;
        }
        public void desligar()
        {
            ligada= false;
        }
        
       //Volume, começa com  25
        public void aumentarVolume()
        {
            volume++;
        }
        
        public void diminuirVolume()
        {
            volume--;
        }
        
        // Canal
        public void mudarCanal(int novoCanal) // setando canal
        {
            canal = novoCanal;
        }
        public void aumentarCanal(){};
        public  void diminuirCanal(){};
        
        
        
        
        
        
    
    


    
}
