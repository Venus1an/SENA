import java.util.Random;

public class juegodedados {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("JUEGO DE DADOS");

        Random random = new Random();
        //iniciarJuego = scanner.toString();
        /* 
        int dado1 = 1;
        int dado2= 6;
        int valor = aleatoriedad.nextInt(dado2 + dado1)+dado1;
        System.out.println(valor);*/
        
        /*
        for(int i =1; i<=6;i++){
            int valor = aleatoriedad.nextInt(((6-1)+1)+1);
            System.out.println(valor);
        }*/
        /*
        int min = 1;
        int max = 7;
        for(int i = min; i<=max; i++){
            int getRandom = (int) (Math.random() * (max-min)) + min;
            System.out.println(getRandom);
    }*/
        /*El conocido juego de dados llamado Craps tiene las
        siguientes reglas:
        1.- Si en el primer lanzamiento de los dados sale 7 u 11 el
        lanzador gana, pero si sale 2 ó 12 pierde.
        2. Si no salen ninguno de los anteriores números el
        jugador tiene derecho a hacer tantos lanzamientos
        hasta que salga el numero se obtuvo por primera vez y
        con ello gana, pero si sale el número 7 pierde. */
        //Variable para verificar si es la primera ves que se tira
       
        int puntopartida=0;

        for (int i = 1; i<10; i++){
            System.out.println("PARTIDA: " + i);
            int dado1 = (int) (Math.random()*13)*1;
            int dado2 = (int) (Math.random()*13)* 1;
            int J,Q,K=10
    
            System.out.println("Dado #1: "+dado1+" |----| Dado #2: "+dado2);
            System.out.println("Realiza tirada");
          


            int sumadados = dado1 + dado2;
            System.out.println("Suma de dados: "+sumadados);

            
            if (sumadados ==2) {    
                    System.out.println("¡Has ganado!");
                    break;
                }else if (sumadados == 12) {
                    System.out.println("¡vuelve a intentarlo!");
                    break;
                }else{
                    System.out.println("Se establece un punto en: "+sumadados);
                    puntopartida = sumadados;
                }
            }else{
                if (sumadados == puntopartida) {
                    System.out.println("!Has Ganado!");
                    break;
                }else if (sumadados == 7){
                    System.out.println("Esta linea de codigo SI se ejecutara");
                    System.out.println("!Has Perdido!");
                    break;
                }
            }
        }
}
