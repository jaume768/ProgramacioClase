import java.util.ArrayList;

public class RHondt {
    
    private ArrayList votsFiltrats;
    private char partit;
    private final int EsconsMaxims = 8;
    private int index;
    private int barreraElectoral = 0;
    private int valorMaximo;

    
    public ArrayList votsDespresDeLaBarreraElectoral(int [] Votos){

        votsFiltrats = new ArrayList();
        int barreraElectoral = barreraElectoral(Votos);
                
        for (int i = 0; i < Votos.length; i++){

            if (Votos[i] >= barreraElectoral){

                votsFiltrats.add(Votos[i]);

            } 
        }
        return votsFiltrats;
    }
    
    public int [][] TaulaDeVotsFiltrada(int[] Votos){

        ArrayList votosLimpios = votsDespresDeLaBarreraElectoral(Votos);
        int[][] tablaVotos = new int [votosLimpios.size()][8];
        
        for (int row = 0; row < votosLimpios.size(); row++){
            
            for (int col = 0; col < tablaVotos[row].length; col++){

                tablaVotos[row][col] = (int) votosLimpios.get(row) / (col + 1);

            }

        }
        return tablaVotos;
    }

    public int barreraElectoral(int [] Votos){

        for (int i = 0; i < Votos.length; i++){
            barreraElectoral += Votos[i];
        }
        barreraElectoral = (barreraElectoral * 3) / 100;

        return barreraElectoral;
    }

    public void printTaulaVots(int[] Votos){
        
        int[][] tablaVotos = TaulaDeVotsFiltrada(Votos);
        partit = 'A';
        
        for (int row = 0; row < tablaVotos.length; row++){
            System.out.print("partit " + partit);
            for (int col = 0; col < tablaVotos[row].length; col++){
                System.out.print(" | ");
                System.out.print(tablaVotos[row][col]);
            }
            System.out.println(" | ");
            partit++;
        }
    }
    
    public void printEsconsAsignats(int[] Votos){
        
        int[] Diputados = asignarEscons(Votos);
        partit = 'A';
        
        for (int i = 0; i < Diputados.length; i++){
            System.out.print(partit + "\"" + ": ");
            partit++;
            System.out.print(Diputados[i] + " | ");
        }
        System.out.println();
    }

    public int[] asignarEscons(int[] Votos){

        int[][] tablaVotos = TaulaDeVotsFiltrada(Votos);
        int[] Diputados = new int[votsFiltrats.size()];

        for (int i = 0; i < EsconsMaxims; i++){
            valorMaximo = tablaVotos[0][Diputados[0]];
            index = 0;
            for (int j = 0; j < tablaVotos.length; j++){
                if (tablaVotos[j][Diputados[j]] > valorMaximo){
                    valorMaximo = tablaVotos[j][Diputados[j]];
                    index = j;

                }
            }
            Diputados[index]++;
        }

        return Diputados;
    }
}
