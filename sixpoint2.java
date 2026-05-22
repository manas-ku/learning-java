public class sixpoint2 {
    public static void main(String[] args){
        Car car = new Car(2010, "make");
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
    }
}
