public class Crocodile extends Animal {

    public Crocodile (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Cocodrilo");
    }

    public void swim(){
        System.out.println(name + " ha comenzado a nadar!");
    }

    @Override
    public void eat(){
        System.out.println(name + " ha dado un gran mordizco al trozo de carne!");
    }

}
