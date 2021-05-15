public class stepRight implements Runnable {
    private step st;
    stepRight(step o){st=o;}
    public void run() {
       // step s=new step();
      int i =0;
        while(i<10) {
          st.Right();i++;
      }
    }
}
