public class Lion extends Animal {

    public Lion (String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
        setType("León");
    }

    public void roar(){
        System.out.println(name + " dio un gran rugido!");
    }

    @Override
    public void eat(){
        System.out.println(name + " comenzo a devorar la comida!");
    }

}