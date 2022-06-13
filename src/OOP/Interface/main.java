package OOP.Interface;

public class main {
    public static void main(String[] args) {
        Animal dog=new dog();
        System.out.println(dog.eat());
        System.out.println(dog.soChan());
        System.out.println(dog.tiengNoi());
        System.out.println();
        Animal cat=new cat();
        System.out.println(cat.eat());
        System.out.println(cat.soChan());
        System.out.println(cat.tiengNoi());
    }
}
