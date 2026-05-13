public class Avion extends VehiculoAereo {
    private int numeroMotores;

    public Avion(String unaPlaca, String unaMarca, int unAnio, double unaVelocidad, double altitud, int motores) {
        super(unaPlaca, unaMarca, unAnio, unaVelocidad, altitud);
        this.numeroMotores = motores;
    }

    @Override
    public double autonomiaKm() { return 3000; }
    @Override
    public void despegar() { System.out.println("El avión despega desde pista."); }
}