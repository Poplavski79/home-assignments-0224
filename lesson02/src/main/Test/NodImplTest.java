import org.junit.Assert;
import org.junit.Test;
import ru.sberbank.jd.lesson02.NodImpl;

public class NodImplTest {

    @Test
    public void calculateTest(){

        Assert.assertEquals(24, new NodImpl().calculate(24, 24));
        Assert.assertEquals(12, new NodImpl().calculate(12, 24));
        Assert.assertEquals(3, new NodImpl().calculate(9, 24));
        Assert.assertEquals(1, new NodImpl().calculate(7, 24));

    }
}
