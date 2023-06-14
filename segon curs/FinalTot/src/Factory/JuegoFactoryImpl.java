package Factory;
import Juegos.*;

public class JuegoFactoryImpl implements JuegoFactory{
    @Override
    public Juego crearJuego(String tipoJuego) {
        if (tipoJuego.equals("ajedrez")) {
            return new Ajedrez();
        } else if (tipoJuego.equals("damas")) {
            return new Damas();
        } else if (tipoJuego.equals("damas chinas")) {
            return new DamasChinas();
        } else if (tipoJuego.equals("gato y raton")) {
            return new GatoYRaton();
        }
        return null;
    }
}
