public class Timer {
    public static void main(String[] args) {

        TallyTimer x=new TallyTimer();
        x.click();
        x.click();
        x.click();
        x.click();
        x.click();
        x.undo();
        x.undo();
        x.undo();

        System.out.println(x.getClick());




    }
}
