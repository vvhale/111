import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicInteger;

public class stepLeft implements Runnable {
    private step st;
    stepLeft(step o){st=o;}
    public void run() {
       int i=0;
        while (true){
            if (st.getC()==1){
                i++;st.Right();st.setC(0);}

            if (i==10){return;}
        }
    }

}
