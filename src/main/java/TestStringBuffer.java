
public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("1");
        System.out.println(System.currentTimeMillis());
        for(int i=0; i<100000; i++) {
            s.append("" + i);
        }
        System.out.println(System.currentTimeMillis());
    }
}
