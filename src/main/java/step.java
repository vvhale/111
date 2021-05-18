import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicBoolean;

public class step {
    private int numberOfSteps = 0;
    private AtomicBoolean controllerStep = new AtomicBoolean(true);// true - Right, false - Left

    step(int numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
        boolean paramStep = true;
        for (int i = 0; i < 2; i++) {
            new Thread(new stepGo(numberOfSteps, this, paramStep)).start();// paramStep true - делает правые шаги
            paramStep = !paramStep;                                                          //false - левые
        }
    }

    public int getNumberOfSteps() {
        return numberOfSteps;
    }

    public AtomicBoolean getControllerStep() {
        return controllerStep;
    }

    public void setControllerStep(boolean a) {
        controllerStep.set(a);
    }

    public void Right() {
        System.out.println("right");
    }

    public void Left() {
        System.out.println("left");
    }

    public void nextStep() {
        if (this.getControllerStep().get()) {
            System.out.println("right");
        } else {
            System.out.println("left");
        }
    }
}


