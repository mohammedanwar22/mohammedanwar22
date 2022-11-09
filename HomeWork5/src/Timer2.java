public class Timer2 {
    public static void main(String[] args) {
        TallyTimer2 x=new TallyTimer2();
        x.setLimit(5);
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        System.out.println(x.getClick());


    }
}
