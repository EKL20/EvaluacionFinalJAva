import io.elondon.evaluacionFinalJava.AvionBomb;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AvionBomTest {

    public AvionBomb testFly;

    @Before
    public void setup(){
        testFly = new AvionBomb("Springfield",10000,"JDAM",200,"B61",907,"CBU-87 CEM",50);
    }
    @Test
    public void getNombAmetralladora(){
        Assert.assertEquals("El nombre de ametralladora no coincide :","Springfiedl");
    }
    @Test
    public void getCantidadCartuchos(){
        Assert.assertEquals("La cantidad de cartuchos no coinciden :",10000);
    }
    @Test
    public void getNomBombaguiada(){
        Assert.assertEquals("El nombre de la bomba no coincide:","JDAM");
    }
    @Test
    public void getPesoBombaguiada(){
        Assert.assertEquals("El peso de la bomba guiada no coincide :",200);
    }
    @Test
    public void getNomBombaNuclear(){
        Assert.assertEquals("El nombre de la bomba nuclear  no coincide :","B61");
    }
    @Test
    public void getPesoBombaNuclear(){
        Assert.assertEquals("El peso de la bomba nuclear  no coincide :",907);
    }
    @Test
    public void getNomBombasRacimo(){
        Assert.assertEquals("El nombre de las bombas racimo no coincide :","CBU-87 CEM");
    }

    @Test
    public void getPesoBombasRacimo(){
        Assert.assertEquals("El peso de las bombas racimo no coincide :",50);
    }


}
