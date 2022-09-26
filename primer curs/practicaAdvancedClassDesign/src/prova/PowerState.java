package prova;

public enum PowerState {
    ON("Esta actiu"),
    OFF("Esta inactiu"),
    SUSPEND("Esta en mode suspensio");

    private final String descripcio;
    private PowerState(String d){ descripcio = d; }

    public String getDescripcio(){ return descripcio;}
}
