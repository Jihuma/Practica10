public class Panda extends Animal {

    public Panda (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("Panda");
    }

    public void roll(){
        System.out.println(name + " ha comenzado a rodar!");
    }

    @Override
    public void eat(){
        System.out.println(name + " ha empezado a comer bambú!");
    }
}