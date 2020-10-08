public class Tournament {
    public static void main(String[] args) {

        Cat cat = new Cat("Filemon", 24.5);
        Dog dog = new Dog("Reksio", 64.2);

        if(cat.getSpeed() < dog.getSpeed()){
            System.out.println(dog.getName() + " is faster");
        }
        else{
            System.out.println(cat.getName() + " is faster");
        }


    }
}
