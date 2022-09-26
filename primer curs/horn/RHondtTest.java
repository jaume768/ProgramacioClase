
public class RHondtTest {

    public static void main(String[] args) {
        RHondt test = new RHondt();
        
        int [] Votos = {120000, 100000, 40000, 5000, 2500};

        test.printTaulaVots(Votos);
        System.out.println();

        System.out.println("Nombre de diputados:");
        test.printEsconsAsignats(Votos);
    } 
}
