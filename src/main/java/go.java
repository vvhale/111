import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicInteger;

//import java.util.concurrent.atomic.AtomicInteger;

public class go {
    public static void main(String[] args) {
        System.out.println("начало");

        step s = new step();
        Thread legL = new Thread(new stepGo(s,1));
        Thread legR =new Thread(new stepGo(s,0));
        legL.start();
        legR.start();

        System.out.println("конец");
    }

}
class step {

    private AtomicInteger stepController = new AtomicInteger(0);//0-left 1-right
    private int count=0;
    public int getC(){
        return stepController.get();
    }

    public void setC(int val) {
        this.stepController.set(val);
    }
    public void Go(int goStep) {
        if (goStep == 0) {
            count++;System.out.println("left"+count);
        } else {
            count--;System.out.println("right"+count);
        }
    }

}


