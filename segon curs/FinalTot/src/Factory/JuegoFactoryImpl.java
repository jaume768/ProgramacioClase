package Factory;
import Juegos.Ajedrez;
import Juegos.Damas;
import Juegos.DamasChinas;
import Juegos.Juego;

public class JuegoFactoryImpl implements JuegoFactory{
    @Override
    public Juego crearJuego(String tipoJuego) {
        if (tipoJuego.equals("ajedrez")) {
            return new Ajedrez();
        } else if (tipoJuego.equals("damas")) {
            return new Damas();
        } else if (tipoJuego.equals("damas chinas")) {
            return new DamasChinas();
        }
        return null;
    }
}
