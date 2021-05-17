import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicBoolean;

public class step {
    private int numberOfSteps=0;
    private AtomicBoolean controllerStep = new AtomicBoolean(true);// true - Right, false - Left
    step(int numberOfSteps){
        this.numberOfSteps=numberOfSteps;
        for (int i=0; i<2;i++){
            new Thread(new stepGo(numberOfSteps, this)).start();
        }
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public boolean getControllerStep(){
        return controllerStep.get();
    }
    public void setControllerStep(boolean a){
        controllerStep.set(a);
    }
    public void Right(){
        System.out.println("right");
    }

    public void Left(){
        System.out.println("left");
    }
}

    /*private AtomicInteger stepController = new AtomicInteger(0);//0-left 1-right
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
    }*/
