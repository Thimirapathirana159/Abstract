abstract class CentralBank {
    abstract int InterestRate();
}
class BOC extends CentralBank{
    @Override
    int InterestRate() {
        return 5;
    }
}
class NDB extends CentralBank{
    @Override
    int InterestRate() {
        return 10;
    }
}
class Run{
    public static void main(String[] args) {
        CentralBank cb;
        cb = new BOC();
        System.out.println("Rate of Interest Rate is "+ cb.InterestRate());
        cb = new NDB();
        System.out.println("Rate of Interest Rate is "+ cb.InterestRate());
    }
}