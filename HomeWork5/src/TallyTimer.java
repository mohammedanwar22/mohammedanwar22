public class TallyTimer {
    private int num;
    private int udo;
    private int limit;
    public TallyTimer(){num=0;}

    public void click(){num=num+1;
    udo=num;}

    public int getClick(){return num;}

    public void reset(){num=0;}
    public void undo(){
        if(num==udo)
        {num=num-1;

        }

    }

}
