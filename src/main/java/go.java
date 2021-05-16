import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicInteger;

//import java.util.concurrent.atomic.AtomicInteger;

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

    private AtomicInteger c = new AtomicInteger(0);//0-left 1-right

    public int getC(){
        return c.get();
    }

    public void setC(int val) {
        this.c.set(val);
    }

    public  void Left(){
        System.out.println("left");
    }
    public  void Right() {
        System.out.println("right");
    }

}


