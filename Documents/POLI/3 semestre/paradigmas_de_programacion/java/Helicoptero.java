public class Helicoptero extends VehiculoAereo {
    private int cantidadHélices;

    public Helicoptero(String unaPlaca, String unaMarca, int unAnio, double unaVelocidad, double altitud, int helices) {
        super(unaPlaca, unaMarca, unAnio, unaVelocidad, altitud);
        this.cantidadHélices = helices;
    }

    @Override
    public double autonomiaKm() { return 500; }
    @Override
    public void despegar() { System.out.println("El helicóptero despega verticalmente."); }
}