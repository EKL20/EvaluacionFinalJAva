package io.elondon.evaluacionFinalJava;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Principal {

    public static void main(String[] args) {
        AvionBomb b52 = new AvionBomb();
        b52.ataqueAereo();
        b52.setNombAmetralladora("Sprinfield");
        b52.setCantidadCartuchos(10000);
        b52.setPesoVacio(83250);
        b52.setPesoUtil(31500);
        b52.setNomBombaguiada("JDAM");
        b52.setNomBombaNuclear("B61");
        b52.setPesoBombasRacimo(50);
        b52.setPesoBombaguiada(200);
        b52.setNomBombasRacimo("CBU-87 CEM");
        b52.setTriupulacion(5);
        b52.setPesoBombaNuclear(907);

        System.out.println("Hoja de Especificaciones del avión bombardero B-52: ");
        System.out.println("Tripulación: " +b52.getTriupulacion());
        System.out.println("Capacidad de Carga: "+b52.getPesoUtil()+"kg ");
        System.out.println("Está equipado con -Bombas guiadas tipo: "+b52.getNomBombaguiada()
                + " -Bombas Racimo tipo: "+b52.getNomBombasRacimo()+" -Bombas Núcleares tipo: "+b52.getNomBombaNuclear()+" -Ametralladora tipo: "+b52.getNombAmetralladora()
        );
        System.out.println(" ");

        AvionCaza f15E = new AvionCaza();
        f15E.ataqueAereo();
        f15E.setNombAmetralladora("Springfield");
        f15E.setNomMisil("AIM-7 Sparrow");
        f15E.setCantidadCartuchos(1000);
        f15E.setPesoMisil(152);
        f15E.setTriupulacion(1);
        f15E.setPesoUtil(7500);
        f15E.setRadar("AESA Raytheon");

        System.out.println("Hoja de Especificaciones del avión Caza F15-E: ");
        System.out.println("Tripulación: " +f15E.getTriupulacion());
        System.out.println("Capacidad de Carga: "+f15E.getPesoUtil()+"kg ");
        System.out.println("Está equipado con -Ametralladora tipo: "+f15E.getNombAmetralladora()+" -Un radar tipo: "+f15E.getRadar()
                +" -Misiles tipo: "+f15E.getNomMisil()
        );
        System.out.println(" ");


        CarroAtaque M4 = new CarroAtaque();
        M4.ataqueTerrestre();
        M4.setNombAmetralladora("Springfield");
        M4.setNomCanon("30mm");
        M4.setPesoGranada(20);
        M4.setRadar("AESA Raytheon");
        M4.setPesoUtil(10000);
        M4.setTriupulacion(5);
        M4.setCantidadCartuchos(5000);

        System.out.println("Hoja de Especificaciones del Tanque Sherman M4: ");
        System.out.println("Tripulación: " +M4.getTriupulacion());
        System.out.println("Capacidad de Carga: "+M4.getPesoUtil()+"kg ");
        System.out.println("Está equipado con -Ametralladora tipo: "+M4.getNombAmetralladora()+" -Un radar tipo: "+M4.getRadar()
                +" -Cañon tipo: "+M4.getNomCanon()
        );
        System.out.println(" ");

        Corbeta Alabama= new Corbeta();
        Alabama.setNombAmetralladora("Springfield");
        Alabama.setNomCohete("Katuisha");
        Alabama.setPesoCohete(170);
        Alabama.setPesoUtil(1100000);
        Alabama.setCantidadCartuchos(1000000);
        Alabama.setTriupulacion(20);
        Alabama.setPesoCohete(9000000);

        System.out.println("Hoja de Especificaciones de Crucero Tipo Alabama: ");
        System.out.println("Tripulación: " +Alabama.getTriupulacion());
        System.out.println("Capacidad de Carga: "+Alabama.getPesoUtil()+"kg ");
        System.out.println("Está equipado con -Ametralladora tipo: "+Alabama.getNombAmetralladora()+" -Cohetes tipo: "+Alabama.getNomCohete()
        );
        System.out.println(" ");

        PortaAvion Bismarck = new PortaAvion();
        Bismarck.ataqueFluvial();
        Bismarck.setNombAmetralladora("Springfield");
        Bismarck.setNomMisil("AIM-7 Sparrow");
        Bismarck.setRadar("AESA Raytheon");
        Bismarck.setPesoUtil(10000000);
        Bismarck.setTriupulacion(120);

        System.out.println("Hoja de Especificaciones del Porta Aviones Bismarck: ");
        System.out.println("Tripulación: " +Bismarck.getTriupulacion());
        System.out.println("Capacidad de Carga: "+Bismarck.getPesoUtil()+"kg ");
        System.out.println("Está equipado con -Ametralladora tipo: "+Bismarck.getNombAmetralladora()+" -Misiles tipo: "+Bismarck.getNomMisil()
        +" -Radar tipo: "+Bismarck.getRadar());
        System.out.println(" ");


        VehiculoTransporte Harley = new VehiculoTransporte();
        Harley.setTipoVehiculo("Motocicleta");
        Harley.setReferencia("Harley Davinson 490 cc");
        Harley.setPesoUtil(0);
        Harley.setTriupulacion(2);
        Harley.setPesoVacio(390);

        System.out.println("Hoja de Especificaciones de la motocicleta harley Davinson: ");
        System.out.println("Tripulación: " +Harley.getTriupulacion());
        System.out.println("Capacidad de Carga: "+Harley.getPesoUtil()+"kg ");
        System.out.println("El uso de este vehículo solo está limitado a transporte");
        System.out.println(" ");

        VehiculoTransporte Jeep = new VehiculoTransporte();
        Jeep.setTriupulacion(4);
        Jeep.setPesoUtil(1200);
        Jeep.setTipoVehiculo("Camioneta");
        Jeep.setReferencia("Camioneta Jeep 3.0 -Reconocimiento");
        Jeep.setPesoVacio(1500);

        System.out.println("Hoja de Especificaciones de la camioneta Jepp: ");
        System.out.println("Tripulación: " +Jeep.getTriupulacion());
        System.out.println("Capacidad de Carga: "+Jeep.getPesoUtil()+"kg ");
        System.out.println("El uso de este vehículo solo está limitado a transporte");
        System.out.println(" ");

        VehiculoTransporte HI = new VehiculoTransporte();
        HI.setPesoVacio(5000);
        HI.setTipoVehiculo("Camion");
        HI.setReferencia("Camion de seuministro tipo: HI");
        HI.setPesoUtil(32000);
        HI.setTriupulacion(15);

        System.out.println("Hoja de Especificaciones del camion HI: ");
        System.out.println("Tripulación: " +HI.getTriupulacion());
        System.out.println("Capacidad de Carga: "+HI.getPesoUtil()+"kg ");
        System.out.println("El uso de este vehículo solo está limitado a transporte");
        System.out.println(" ");

    }
}
