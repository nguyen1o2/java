package OOP.Kethua;

public class student {
    private String name;
    private int age;
    private String queQuan;

    public student(String name, int age, String queQuan) {
        this.name = name;
        this.age = age;
        this.queQuan = queQuan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "name= " + name + " - " +
                "age= " + age + " - "+
                "queQuan= " + queQuan;
    }
}
