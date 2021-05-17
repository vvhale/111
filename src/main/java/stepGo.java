import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicInteger;

public class stepGo implements Runnable {
    private step st;
    private int gS, anGS;
    stepGo(step Step,int goStep){st=Step;gS=goStep;}//gS какой ногой ходить 0-левая, 1-правая
    public void run() {
        int i =0;
        if (gS==0){anGS=1;} else{anGS=0;}
        while(true) {

            if (st.getC()==gS){
                i++;st.Go(gS);st.setC(anGS);}
            if (i==100){return;}
      }
    }
}
