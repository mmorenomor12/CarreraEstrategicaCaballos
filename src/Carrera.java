public class Carrera {

    private Caballo caballoJugador1 = new Caballo();
    private Caballo caballoJugador2 = new Caballo();

    private int tiempoMaximo;


    public void iniciarCarrera(){
        for (int i = 0; i <= 20; i++) {
            int opcion1 = (int)(Math.random()*4)+1;
            int opcion2 = (int)(Math.random()*4)+1;
            System.out.println("Turno del caballo 1:");
            caballoJugador1.correr(opcion1);
            System.out.println("Turno del caballo 2:");
            caballoJugador2.correr(opcion2);
            if(i == 20){
                if(caballoJugador1.getDistanciaRecorrida() > caballoJugador2.getDistanciaRecorrida()){
                    System.out.println("El caballo 1 ha ganado la carrera");
                    System.out.println("con " +  caballoJugador1.getDistanciaRecorrida() + " de distancia recorrida");
                } else if(caballoJugador1.getDistanciaRecorrida() < caballoJugador2.getDistanciaRecorrida()){
                    System.out.println("El caballo 2 ha ganado la carrera");
                    System.out.println("con " +  caballoJugador2.getDistanciaRecorrida() + " de distancia recorrida");
                }else{
                    System.out.println("Han empatado los caballos");
                    System.out.println("con " +  caballoJugador1.getDistanciaRecorrida() + " de distancia recorrida el caballo 1");
                    System.out.println("con " +  caballoJugador2.getDistanciaRecorrida() + " de distancia recorrida el caballo 2");
                }
            }
        }
    }



}
