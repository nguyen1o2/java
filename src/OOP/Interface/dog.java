package OOP.Interface;

public class dog implements Animal{

    @Override
    public String type() {
        return "trong nha";
    }

    @Override
    public String eat() {
        return "thit";
    }

    @Override
    public int soChan() {
        return 6;
    }
    public  String tiengNoi(){
        return "meo meo";
    }
}
