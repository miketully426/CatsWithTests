package launchcode;

public class Cat {

    private String name;
    private String breed;
    private String color;
    private int age;
    private boolean chonk;
    private boolean isHungry = true;
    private boolean isHappy = false;

    public Cat(String name, String color, String breed){
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = 0;
    }

    public Cat(String name, String color, String breed, int age){
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isChonk() {
        return chonk;
    }

    public void setChonk(boolean chonk) {
        this.chonk = chonk;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public void hairball(){
        System.out.println("ARRRGGHHH");
    }

    //prints Meow!
    public String meow(){
        return "Meow!";
    }

    //Makes the cat happy and prints a purr
    public void petCat(){
        this.isHungry = true;
        System.out.println("Purrrrr");
    }

    //Makes the cat happy and no longer hungry
    public void feedCat(){
        this.isHungry = false;
        this.isHappy = false;
    }

}
