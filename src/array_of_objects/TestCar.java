package array_of_objects;

public class TestCar {
    public static void main(String[] args) {
        Car[] carArray=new Car[5];

        carArray[0]=new Car(2000,"car1","black");
        carArray[1]=new Car(2001,"car2","white");
        carArray[2]=new Car(2002,"car3","green");
        carArray[3]=new Car(2003,"car4","red");
        carArray[4]=new Car(2004,"car5","yellow");
        for (Car car : carArray) {
            System.out.println(car.toString());
        }

        System.out.println("averageAge(carArray) = " + averageAge(carArray));
    }
    
    private static int averageAge(Car[] inData){
        int result=0;
        for (int i = 0; i < inData.length; i++) {
            result+=inData[i].getAge();
        }
        
        return result/inData.length;
    }
}
