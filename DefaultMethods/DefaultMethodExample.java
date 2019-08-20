interface MyGarage{

    default void myDefaultVoid(){
        System.out.println("How many cards do I have?");
    }

    public void myAmount();

}

class Car implements MyGarage{
    int i;
    public Car(int i){
        this.i = i;
    }
    public void myAmount(){
        System.out.println("You have: " + this.i + " cars!");
    }

}


class DefaultMethodExample{
    public static void main(String args[]){

        Car myCar = new Car(5);
        myCar.myDefaultVoid();
        myCar.myAmount();

    }
}