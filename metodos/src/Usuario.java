public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarTv = new SmartTv();

        System.out.println("Tv Ligada? " + smarTv.ligada);
        System.out.println("Canal Atual? " + smarTv.canal);
        System.out.println("Volume Atual? " + smarTv.volume);

        smarTv.desligar();
        
        System.out.println("Tv Ligada? " + smarTv.ligada);

        smarTv.AumentarVolume();

        System.out.println("Volume Atual " + smarTv.volume);

        smarTv.aumentarCanal();

        System.out.println("Canal Atual? " + smarTv.canal);



    }
}
