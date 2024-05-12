public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 100;
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        if (volume == 100) {
            System.out.println("Volume maximo alcançado");
        } else{
            volume++;
        } 
    }
    public void diminuirVolume(){
        if (volume == 0) {
            System.out.println("Volume minimo alcançado");
        } else{
            volume--;
        } 
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void descerCanal(){
        canal--;
    }

}
