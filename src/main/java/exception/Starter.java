package exception;

public class Starter
{
    public static void main(String[] args)
    {
        Generator generator = new Generator();

        try {
            String answer = generator.helloMessage("FIRST");
            //String answer = generator.helloMessage("SECOND");
            //String answer = generator.helloMessage("OTHER");
            System.out.println("Answer 1:" + answer);

        } catch (Exception ex) {
            System.out.println("Error message:" + ex.getMessage());
        }
    }
    }

