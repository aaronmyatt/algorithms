package book.ch1;
import book.ch1.Ex1;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestEx1 {
    @Test
    public void TestMaxIt(){
        Ex1 e = new Ex1();
        assert(5.0 == e.MaxIt());
    }
}
