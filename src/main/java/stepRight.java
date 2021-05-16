import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicInteger;

public class stepRight implements Runnable {
    private step st;
    stepRight(step o){st=o;}
    public void run() {
        int i =0;
        while(true) {

            if (st.getC()==0){
                i++;st.Left();st.setC(1);}
            if (i==10){return;}
      }
    }
}
