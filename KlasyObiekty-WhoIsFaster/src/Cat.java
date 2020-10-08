public class Cat {
    private String name;
    private double speed;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public Cat (String name, double speed){
        this.name = name;
        this.speed = speed;

    }
}
