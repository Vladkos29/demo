import org.junit.Test;
import static junit.framework.TestCase.*;
public class Testprog{
    @Test
    public void sumTest() {
        Main tt = new Main();
        double t = tt.sum(10.0, 5.0);
        assertEquals(16.0, t);
    }
    @Test
    public void subTest() {
        Main tt = new Main();
        double t = tt.sub(10.0, 5.0);
        assertEquals(15.0, t);
    }
    @Test
    public void mulTest() {
        Main tt = new Main();
        double t = tt.mul(10.0, 5.0);
        assertEquals(50.0, t);
    }
    @Test
    public void divTest() {
        Main tt = new Main();
        double t = tt.div(10.0, 5.0);
        assertEquals(2.0, t);
    }
}
