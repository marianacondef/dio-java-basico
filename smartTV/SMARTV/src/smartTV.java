public class smartTV {
    boolean tvOn = false; 
    int canal = 1;
    int volume = 20;

    public void ligarTV(){
        tvOn = true;
        System.out.println("TV ON");
    }

    public void desligarTV(){
        tvOn = false;
        System.out.println("TV OFF");
    }

    public void aumentarVol(){
        volume ++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVol(){
        volume --;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void subirCanal(){
        canal ++;
        System.out.println("Aumentando canal para: " + canal);
    }

    public void diminuirCanal(){
        canal --;
        System.out.println("Diminuindo canal para: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando canal para: " + canal);
    }
    



}
