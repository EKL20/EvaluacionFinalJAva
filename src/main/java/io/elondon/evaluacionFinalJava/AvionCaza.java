package io.elondon.evaluacionFinalJava;

public class AvionCaza extends Vehiculo implements Flyable {
    private String nombAmetralladora;
    private int cantidadCartuchos;
    private String nomMisil;
    private  int pesoMisil;
    private String radar;



    //Implementación de interface de ataqueAereo
    public void ataqueAereo() {

    }
    //Métodos Getter y Setter
    public String getRadar() {
        return radar;
    }

    public void setRadar(String radar) {
        this.radar = radar;
    }

    public String getNombAmetralladora() {
        return nombAmetralladora;
    }

    public void setNombAmetralladora(String nombAmetralladora) {
        this.nombAmetralladora = nombAmetralladora;
    }

    public int getcantidadCartuchos() {
        return cantidadCartuchos;
    }

    public void setCantidadCartuchos(int cantidadCartuchos) {
        this.cantidadCartuchos = cantidadCartuchos;
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
    //Validación de municion en ametralaldora
    public void  ametralladora(){
        for (int i=0; i<cantidadCartuchos; i--){

        if (cantidadCartuchos == 0){
            System.out.println("La ametralladora se  ha quedado sin munición");
        }
        }
    }

}
