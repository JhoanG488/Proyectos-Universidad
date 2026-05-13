public class Moto extends VehiculoTerrestre {
    private String tipoManubrio;

    public Moto(String unaPlaca, String unaMarca, int unAnio, double unaVelocidad, int unasRuedas, String tipoManubrio) {
        super(unaPlaca, unaMarca, unAnio, unaVelocidad, unasRuedas);
        this.tipoManubrio = tipoManubrio;
    }

    @Override
    public double consumoPorKm() { return 5.5; }

    @Override
    public double autonomiaKm() { return 200; }

    public String getTipoManubrio() { return tipoManubrio; }
}