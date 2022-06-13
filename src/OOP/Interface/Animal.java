package OOP.Interface;

public interface Animal {
    String type();
    String eat();
    int soChan();
    default String tiengNoi(){
        return "gau gau";
    }
}
