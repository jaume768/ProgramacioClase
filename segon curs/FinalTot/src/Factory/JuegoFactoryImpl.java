package Factory;
import Juegos.*;
import Tableros.Tablero;

public class JuegoFactoryImpl implements JuegoFactory{
    @Override
    public Juego crearJuego(String tipoJuego) {

        Tablero t = new Tablero();

        if (tipoJuego.equals("ajedrez")) {
            return new Ajedrez(t);
        } else if (tipoJuego.equals("damas")) {
            return new Damas(t);
        } else if (tipoJuego.equals("damas chinas")) {
            return new DamasChinas(t);
        } else if (tipoJuego.equals("gato y raton")) {
            return new GatoYRaton(t);
        }
        return null;
    }
}
