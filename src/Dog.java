public class Dog {

    int Age;
    boolean isSick;
    boolean isHungry;
    boolean isTrained;
    boolean isDirty_room;

    public Dog(int age) {

        this.Age = age;
        this.isSick = Helper.getRandomBoolean();
        this.isHungry = Helper.getRandomBoolean();
        this.isTrained = (this.Age <= 3 ? false:true);
    }
    public boolean Eating(String food) {
        switch (food) {
            case "Milk":
                if(Age <= 3)
                    return true;
                else
                    return false;
            case "Meat":
                if(Age > 3 && Age <= 8)
                    return true;
                else
                    return false;
            case "Cruel":
                if(Age > 8)
                    return true;
                else
                    return false;
            default:
                return false;
        }
    }

    public String getAgeDescription() {
        if (this.Age <= 3) {
            return "Young";
        }
        else if (this.Age > 3 && this.Age <= 8) {
            return "Adult";
        }
        else if (this.Age > 8) {
            return "Old";
        }
        return "No data";
    }
}