public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("Cats", "Simba", 8, true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        myZoo.setAnimals(new Animal[25]);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));

        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));

        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
    }
}
