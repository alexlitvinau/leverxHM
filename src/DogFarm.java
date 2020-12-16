public class DogFarm {
    Dog[] dogs = null;

    public DogFarm(int Count) {

        dogs = new Dog[Count];

        for (int i = 0; i < Count; i++) {
            dogs[i] = new Dog(Helper.getRandomAge());
            System.out.println(dogs[i].getAgeDescription());
        }

    }

    public void StartDay() {

        for (Dog dog : dogs) {
            Feeding(dog);
            Veterinarian(dog);
            dog.isDirty_room = true;
            Cleaning(dog);

            if (dog.Age <= 3)
                DogHandler(dog);
            else if (dog.Age > 3 && dog.Age <= 8)
                DogWork(dog);
            else if (dog.Age > 8)
                continue;
        }
    }

    private void Feeding(Dog dog) {
        if (dog.isHungry) {
            if (dog.Age <= 3)
                dog.Eating("Milk");
            else if (dog.Age > 3 && dog.Age <= 8)
                dog.Eating("Meat");
            else if (dog.Age > 8)
                dog.Eating("Cruel");
        }

    }

    private void Veterinarian(Dog dog) {
        if (dog.isSick)
            dog.isSick = false;

    }

    private void DogHandler(Dog dog) {
        if (!dog.isTrained)
            dog.isTrained = true;
    }

    private void Cleaning(Dog dog) {
        dog.isDirty_room = false;
    }

    private void DogWork(Dog dog) {

    }

}
