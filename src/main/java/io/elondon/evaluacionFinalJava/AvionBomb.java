package io.elondon.evaluacionFinalJava;

public class AvionBomb extends Vehiculo implements Flyable{
    private String nombAmetralladora;
    private int cantidadCartuchos;
    private String nomBombaguiada;
    private int pesoBombaguiada;
    private  String nomBombaNuclear;
    private  int  pesoBombaNuclear;
    private String nomBombasRacimo;
    private int  pesoBombasRacimo;

 

    //Implementación de interface ataqueAereo
    public void ataqueAereo(){

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

    public String getNomBombaguiada() {
        return nomBombaguiada;
    }

    public void setNomBombaguiada(String nomBombaguiada) {
        this.nomBombaguiada = nomBombaguiada;
    }

    public int getPesoBombaguiada() {
        return pesoBombaguiada;
    }

    public void setPesoBombaguiada(int pesoBombaguiada) {
        this.pesoBombaguiada = pesoBombaguiada;
    }

    public String getNomBombaNuclear() {
        return nomBombaNuclear;
    }

    public void setNomBombaNuclear(String nomBombaNuclear) {
        this.nomBombaNuclear = nomBombaNuclear;
    }

    public int getPesoBombaNuclear() {
        return pesoBombaNuclear;
    }

    public void setPesoBombaNuclear(int pesoBombaNuclear) {
        this.pesoBombaNuclear = pesoBombaNuclear;
    }

    public String getNomBombasRacimo() {
        return nomBombasRacimo;
    }

    public void setNomBombasRacimo(String nomBombasRacimo) {
        this.nomBombasRacimo = nomBombasRacimo;
    }

    public int getPesoBombasRacimo() {
        return pesoBombasRacimo;
    }

    public void setPesoBombasRacimo(int pesoBombasRacimo) {
        this.pesoBombasRacimo = pesoBombasRacimo;
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
