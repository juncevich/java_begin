package exception;

public class Generator
{
    // Данный метод описан с указанием того, что он способен кинуть
    // исключение типа SimpleException
    public String helloMessage(String name) throws SimpleException, FirstException, SecondException {
        if ("FIRST".equals(name)) {
            throw new FirstException("FirstException occured");
        }
        if("SECOND".equals(name)) {
            throw new SecondException("SecondException occured");
        }
        return "Hello, " + name;
    }

}
