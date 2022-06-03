public class Veterinarian {
    String name;
    double salary;

    public Veterinarian (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void vaccinate (Animal animal){
        if(!animal.getVaccinated()){
            animal.setVaccinated (true);
            System.out.println(animal.getName() + " ha sido vacunado!");
        }else{
            System.out.println(animal.getName() + " ya estaba vacunado!");
        }
    }

    public void washAnimal (Animal animal){
        System.out.println(animal.getName() + " ha tomado un buen baño!");
    }

    public void bloodAnimal (Animal animal){
        System.out.println(animal.getName() + " ha perdido un poco de sangre!.");
    }

}