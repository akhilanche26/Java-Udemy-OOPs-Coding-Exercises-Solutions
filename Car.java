public class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    ;
    public Car(int cylinders,String name){
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        String type = this.getClass().getSimpleName();
        return (type+" -> starting");
    }
    public String accelerate(){
        String type = this.getClass().getSimpleName();
        return (type+" -> accelerating");
    }
    public String brake(){
        String type = this.getClass().getSimpleName();
        return (type+" -> braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

}
