public class Fox extends Animal{
    @Override
    public void makeSound() {
        System.out.println("RING DING DING DING DING de ding ding ding");
    }

    @Override
    public Boolean eat(String foodType) {
        return true;
    }
}
