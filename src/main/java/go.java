

public class go {
    public static void main(String[] args) {
        System.out.println("начало");
        step s = new step();
        stepLeft tl= new stepLeft(s);
        stepRight tr = new stepRight(s);

        Thread legL = new Thread(tl);
        Thread legR =new Thread(tr);
        legL.start();
        legR.start();
        System.out.println("конец");
    }

}
class step {
    //private Object ob;

    public synchronized void Left(){
        //synchronized (ob) {
            try {
                notifyAll();
                wait();
                System.out.println("left");
            } catch (Exception e) {
            }
        //}
    }
    public synchronized void Right() {
        //synchronized (ob) {
            try {
                notifyAll();
                wait();
                System.out.println("right");
            } catch (Exception e) {
            }
        //}
    }

}


