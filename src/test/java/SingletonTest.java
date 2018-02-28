import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Assert.assertEquals(singleton, singleton1);
        Assert.assertEquals(singleton.getName(), singleton1.getName());
    }

}
