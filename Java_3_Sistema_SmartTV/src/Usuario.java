public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();
        System.out.println(smartTV.canal);
        System.out.println(smartTV.ligada);
        smartTV.aumentarVolume();
        smartTV.mudarCanal(25);
        System.out.println(smartTV.volume);
        System.out.println(smartTV.canal);
    }
}
