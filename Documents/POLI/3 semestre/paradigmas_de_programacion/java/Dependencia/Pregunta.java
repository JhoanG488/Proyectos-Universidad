package Dependencia;
public class Pregunta {
    private int numero;
    private String enunciado;
    private String tipo; // Ejemplo: Opción múltiple, Verdadero/Falso
    private double puntaje;
    private String respuestaCorrecta;
    private boolean obligatoria;

    public Pregunta(int numero, String enunciado, String tipo, double puntaje, String respuestaCorrecta, boolean obligatoria) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.tipo = tipo;
        this.puntaje = puntaje;
        this.respuestaCorrecta = respuestaCorrecta;
        this.obligatoria = obligatoria;
    }

    public void editarEnunciado(String nuevoEnunciado) {
        this.enunciado = nuevoEnunciado;
    }

    public void cambiarPuntaje(double nuevoPuntaje) {
        this.puntaje = nuevoPuntaje;
    }

    public void definirRespuestaCorrecta(String respuesta) {
        this.respuestaCorrecta = respuesta;
    }

    public void setObligatoria(boolean obligatoria) {
        this.obligatoria = obligatoria;
    }

    public int getNumero() { return numero; }
    public double getPuntaje() { return puntaje; }

    public void mostrarInformacion() {
        System.out.println("  [" + numero + "] (" + tipo + ") " + enunciado);
        System.out.println("      Puntaje: " + puntaje + " | Obligatoria: " + (obligatoria ? "Sí" : "No"));
    }
}