package io.elondon.evaluacionFinalJava;

public class CarroAtaque extends Vehiculo implements CarAttackable{

        private  String nombAmetralladora;
        private  int cantidadCartuchos;
        private  String radar;
        private  String nomCanon;
        private int pesoGranada;
        //Implementación de interface de ataqueTerrestre
        public void ataqueTerrestre() {

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

        public String getRadar() {
                return radar;
        }

        public void setRadar(String radar) {
                this.radar = radar;
        }

        public String getNomCanon() {
                return nomCanon;
        }

        public void setNomCanon(String nomCanon) {
                this.nomCanon = nomCanon;
        }

        public int getPesoGranada() {
                return pesoGranada;
        }

        public void setPesoGranada(int pesoGranada) {
                this.pesoGranada = pesoGranada;
        }
        //Validación de municion en ametralaldora
        public void  ametralladora(){
                for (int i=0; i<cantidadCartuchos; i--){

                        if (cantidadCartuchos == 0){
                                System.out.println("la ametralladora se  ha quedado sin munición");
                        }
                }
        }

}
