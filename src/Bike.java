abstract public class Bike {
    abstract void ride();
}
class YamahaFZ extends Bike{
    @Override
    void ride() {
        System.out.println("ride safely");
    }

    public static void main(String[] args) {
        Bike b = new YamahaFZ();
        b.ride();
    }
}
