public class day1 {
    
    int maxVelocity = 100;
    int minVelocity = 0;
    double weight = 4079;
    boolean isTheCarOn= false;
    char condition = 'A';
    String brandOfCar = "Toyota";

    public void printVariables(){
        System.out.println("Max Velocity: " + maxVelocity);
        System.out.println("Min speed: " + minVelocity);
        System.out.println("Weight: " + weight);
        System.out.println("The Car is On: " + isTheCarOn);
        System.out.println("Condition: " + condition);
        System.out.println("Brand: " + brandOfCar);
    }

    public void wreckCar(){
        condition = 'C';
    }

    public void upgradeVelocity(){
        minVelocity = minVelocity - 10;
        maxVelocity = maxVelocity + 10;
    }

    public static void main(String[] args){
        day1 familyCar = new day1();
        System.out.println("Family Car: ");
        familyCar.printVariables();
        familyCar.upgradeVelocity();
        System.out.println("Family Car Upgraded: ");
        familyCar.printVariables();
        day1 aliceCar = familyCar;
        familyCar.wreckCar();
        System.out.println("Alice's Car: ");
        aliceCar.printVariables();
    }
}