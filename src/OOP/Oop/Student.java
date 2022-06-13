package OOP;

public class Student {
    private String name;
    private int age;
    private int math;
    private int physical;
    private int chemistry;
    public Student(String name, int age, int math, int physical, int chemistry) {
        this.name = name;
        this.age = age;
        this.math = math;
        this.physical = physical;
        this.chemistry = chemistry;
    }
    public float AVG(){
        return (float) (this.math+this.physical+this.chemistry)/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", physical=" + physical +
                ", chemistry=" + chemistry +
                '}';
    }
}
