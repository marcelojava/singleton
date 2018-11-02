import br.com.padroes.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void deveRetornarTruePoisInstanciasSaoIguals() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        Assert.assertEquals(singleton, singleton2);
    }
}
