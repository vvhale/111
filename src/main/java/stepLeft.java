public class stepLeft implements Runnable {
    private step st;
    stepLeft(step o){st=o;}
    public void run() {
       int i=0;
        while (i<10){
        st.Left();i++;}
    }

}
