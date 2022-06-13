package OOP.Interface;

public class cat implements Animal{
    @Override
    public String type() {
        return "trong nha";
    }

    @Override
    public String eat() {
        return "ca";
    }

    @Override
    public int soChan() {
        return 4;
    }
}
