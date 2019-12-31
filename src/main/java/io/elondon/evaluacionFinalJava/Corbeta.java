package io.elondon.evaluacionFinalJava;

public class Corbeta extends Vehiculo implements WatterAtackable{
    private String nombAmetralladora;
    private  int cantidadCartuchos;
    private String nomCohete;
    private int pesoCohete;

    //Implementacion de interface de ataqueFluvial
    public void ataqueFluvial() {

    }

    //Métodos Getter y Setter
    public String getNombAmetralladora() {
        return nombAmetralladora;
    }

    public void setNombAmetralladora(String nombAmetralladora) {
        this.nombAmetralladora = nombAmetralladora;
    }

    public int getCantidadCartuchos() {
        return cantidadCartuchos;
    }

    public void setCantidadCartuchos(int cantidadCartuchos) {
        this.cantidadCartuchos = cantidadCartuchos;
    }

    public String getNomCohete() {
        return nomCohete;
    }

    public void setNomCohete(String nomCohete) {
        this.nomCohete = nomCohete;
    }

    public int getPesoCohete() {
        return pesoCohete;
    }

    public void setPesoCohete(int pesoCohete) {
        this.pesoCohete = pesoCohete;
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
