public class InsuranceTester {
    public static void main(String[] args) {
        InsuranceTester x=new InsuranceTester(1000,5);

        x.addInterest();
        System.out.println(x.getBalance());
        x.withdraw();
        System.out.println(x.getBalance());
    }
}
