public class Car{
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yearModel, String make){
        speed = 0;
        this.yearModel = yearModel;
        this.make = make;
    }

    public int getYearModel(){
        return yearModel;
    }

    public String getMake(){
        return make;
    }

    public int getSpeed(){
        return speed;
    }

    public void accelerate(){
        speed = speed + 5;
    }
    
    public void brake(){
        if(speed >=5){
            speed = speed - 5;
        }
        else{
            speed = 0;
        }
    }
}