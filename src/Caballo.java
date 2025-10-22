public class Caballo {
    private int velocidadMaxima;
    private int velocidadNormal;
    private int velocidadMinima;
    private int potencia;
    private int distanciaRecorrida;

    public Caballo(){
        potencia = 100;
        velocidadMaxima = 10;
        velocidadNormal = 7;
        velocidadMinima = 3;
    }

    public void correr(int opcion){
        //Se puede hacer un for donde el "else" me defina la opcion a 3?
        switch (opcion){
            case 1:
                if(potencia > 14){
                    distanciaRecorrida += velocidadMaxima;
                    potencia -= 15;
                    System.out.println("¡Tu caballo está corriendo a máxima velocidad!");
                } else {
                    distanciaRecorrida += velocidadMinima;
                    potencia -= 5;
                    System.out.println("Tu caballo no puede correr a máxima velocidad, así que está trotando despacio");
                    if(potencia < 0){
                        potencia = 0;
                    }
                }
                break;
            case 2:
                if (potencia > 10){
                    distanciaRecorrida += velocidadNormal;
                    potencia -= 10;
                    System.out.println("Tu caballo está trotando controlando el ritmo");
                } else {
                    distanciaRecorrida += velocidadMinima;
                    potencia -= 5;
                    System.out.println("Tu caballo no puede seguir el ritmo de trote normal, así que está trotando despacio");
                    if(potencia < 0) {
                        potencia = 0;
                    }
                }
                break;
            case 3:
                distanciaRecorrida += velocidadMinima;
                potencia -= 5;
                System.out.println("Tu caballo está trotando tranquilamente");
                if(potencia < 0) {
                    potencia = 0;
                }
                break;
            case 4:
                descansar();
                System.out.println("Tu caballo está descansado para coger fuerzas");
                break;
        }
    }

    public void descansar(){
        potencia += 10;
    }

    public int getDistanciaRecorrida(){
        return distanciaRecorrida;
    }

}
