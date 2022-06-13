package OOP.Kethua;

public class friend extends student{
    private String like;
    private String eat;

    public friend(String name, int age, String queQuan, String like, String eat) {
        super(name, age, queQuan);
        this.like = like;
        this.eat = eat;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String getName() {
        return super.getName()+" hello";
    }

    public String info() {
        return "name= " + this.getName() + " - " +
                " age= " + this.getAge() + " - "+
                " queQuan= " + this.getQueQuan() + " - "+
                "like= " + this.getLike() + " - " +
                "eat= " + this.getEat();
    }
}
