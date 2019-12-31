package io.elondon.evaluacionFinalJava;

public class PortaAvion extends Vehiculo implements WatterAtackable{
    private String nombAmetralladora;
    private int pesoCartucho;
    private String nomMisil;
    private int pesoMisil;
    private String radar;

    // Implementacion de interface de atqeuFluvial
    public void ataqueFluvial() {

    }
    //Metodos Getter y Setter
    public String getNombAmetralladora() {
        return nombAmetralladora;
    }

    public void setNombAmetralladora(String nombAmetralladora) {
        this.nombAmetralladora = nombAmetralladora;
    }

    public int getPesoCartucho() {
        return pesoCartucho;
    }

    public void setPesoCartucho(int pesoCartucho) {
        this.pesoCartucho = pesoCartucho;
    }

    public String getNomMisil() {
        return nomMisil;
    }

    public void setNomMisil(String nomMisil) {
        this.nomMisil = nomMisil;
    }

    public int getPesoMisil() {
        return pesoMisil;
    }

    public void setPesoMisil(int pesoMisil) {
        this.pesoMisil = pesoMisil;
    }

    public String getRadar() {
        return radar;
    }

    public void setRadar(String radar) {
        this.radar = radar;
    }

}
