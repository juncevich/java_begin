
import java.util.Date;

public class TestString
{
    public static void main(String[] args) {
        String s = "1";
        System.out.println(new Date());
        for(int i=0; i<100000; i++) {
            s += "" + i;
        }
        System.out.println(new Date());
    }
}
