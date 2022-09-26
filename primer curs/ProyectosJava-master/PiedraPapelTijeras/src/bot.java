import java.util.Random;
public class bot {

    Random rand = new Random();
    int sacar;
    public int GenerarDecisionBot(){

        sacar = rand.nextInt(3);

        return sacar;

    }
}
