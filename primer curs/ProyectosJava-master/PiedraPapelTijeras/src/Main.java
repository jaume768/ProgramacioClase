import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        bot maquina = new bot();
        int decision = 0;
        int decisionVolverJugar = 0;
        int tijerasBot = 2;
        int papelBot = 1;
        int piedraBot = 0;
        int vida = 1;
        System.out.println("Empieza el juego!!");
        
        while(vida == 1){

            System.out.println("Que quieres sascar? piedra = 1, papel = 2, tijeras = 3");
            decision = leer.nextInt();
            maquina.GenerarDecisionBot();
            if (maquina.sacar == 0){

                System.out.println("La maquina ha sacado piedra");

            } else if (maquina.sacar == 1){

                System.out.println("La maquina ha sacado papel");

            } else if (maquina.sacar == 2){

                System.out.println("La maquina ha sacado tijeras");

            }
            if (decision == 3 && maquina.sacar == 1){

                System.out.println("Has ganado!!");
                vida = 0;

            } else if (decision == 2 && maquina.sacar == 1){

                System.out.println("Empate!");

            } else if (decision == 1 && maquina.sacar == 1){

                System.out.println("Gana el bot, has perdido");
                vida = 0;

            } else if (decision == 3 && maquina.sacar == 2){

                System.out.println("Empate!");

            } else if (decision == 2 && maquina.sacar == 2){

                System.out.println("Gana el bot, has perdido");
                vida = 0;

            } else if (decision == 1 && maquina.sacar == 2){

                System.out.println("Has ganado!!");
                vida = 0;

            } else if (decision == 3 && maquina.sacar == 0){

                System.out.println("Gana el bot, has perdido");
                vida = 0;

            } else if (decision == 2 && maquina.sacar == 0){

                System.out.println("Has ganado!!");
                vida = 0;

            } else if (decision == 1 && maquina.sacar == 0){

                System.out.println("Empate");

            }

            if(vida == 0){

                System.out.println("------------------------------");
                System.out.println("Volver a jugar? si = 1, no = 0");
                decisionVolverJugar = leer.nextInt();
                if (decisionVolverJugar == 1){

                    vida = 1;

                } else {

                    System.out.println("Vuelva a jugar pronto!!");

                }

            }

            }
        }
    }

