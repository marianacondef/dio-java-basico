public class remoteControl {
    public static void main(String[] args) throws Exception {
        smartTV TV = new smartTV();

        TV.ligarTV();

        TV.diminuirVol();
        TV.diminuirVol();
        TV.aumentarVol();
        
        TV.subirCanal();
        TV.mudarCanal(12);

        TV.desligarTV();
        String isTVon = (TV.tvOn) ? "Sim" : "Não";
        System.out.println("TV Ligada? " + isTVon);
        System.out.println("Volume atual: " + TV.volume);
        System.out.println("Canal atual:  " + TV.canal);





}
}


