
public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("1");
        System.out.println(System.currentTimeMillis());
        for(int i=0; i<100000; i++) {
            s.append("" + i);
        }
        System.out.println(System.currentTimeMillis());
    }
}
