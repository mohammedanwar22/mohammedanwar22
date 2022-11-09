  public class Spymysteryexperiment {
    public static void main(String[] args) {
        Spymysteryexperiment ahmed=new Spymysteryexperiment(500);
        Spymysteryexperiment AYAD=new Spymysteryexperiment(1000);
       //calling mystery method
        AYAD.mystery(ahmed,500);
        System.out.println("AYAD balance="+AYAD.getBalance());
        System.out.println("Ahmed balance="+ahmed.getBalance());
    }
}