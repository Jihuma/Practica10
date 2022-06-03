import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args){

        Veterinarian vet = new Veterinarian("Jimmy", 50000);
        ArrayList<Animal> animals= new ArrayList<Animal>(3);

        Animal crocodile = new Crocodile("Jaws", 30, false);
        Animal lion = new Lion("Simba", 20, true);
        Animal panda = new Panda("Po", 25, false);

        addAnimal(crocodile, animals);
        addAnimal(lion, animals);
        addAnimal(panda, animals);
        showAnimals(animals);

        vet.vaccinate(crocodile);
        vet.vaccinate(lion);
        vet.vaccinate(panda);
        System.out.println("\n");

        removeAnimal(crocodile, animals);
        showAnimals(animals);
    }

    //Agregar animal
    public static void addAnimal(Animal animal, ArrayList<Animal> animals){
        animals.add(animal);
    }

    //Eliminar animal
    public static void removeAnimal(Animal animal, ArrayList<Animal> animals){
        animals.remove(animal);
    }


    //Mostrar animal
    public static void showAnimals(ArrayList<Animal> animals){
        for(int i=0; i<animals.size(); i++){
            System.out.printf("Animal: %s\n", animals.get(i).getType());
            System.out.printf("Nombre del animal: %s\n", animals.get(i).getName());
            System.out.printf("Edad del animal: %d\n\n", animals.get(i).getAge());
        }
    }
}