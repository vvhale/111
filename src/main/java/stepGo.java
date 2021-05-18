import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicInteger;
import edu.emory.mathcs.backport.java.util.concurrent.atomic.AtomicBoolean;

public class stepGo implements Runnable {
    private int numberOfStep;
    private step St;
    private boolean paramStep;

    stepGo(int numberOfStep, step Step, boolean paramStep) {
        this.numberOfStep = numberOfStep;
        this.St = Step;
        this.paramStep = paramStep;
    }

    @java.lang.Override
    public void run() {
        int i = 0;
        Boolean localAtomBool;
        while (true) {
            do {
                localAtomBool = St.getControllerStep().get();
                if (localAtomBool == paramStep) {
                    St.nextStep();
                    i++;
                }
            } while (!St.getControllerStep().compareAndSet(localAtomBool, !paramStep));
            if (i == numberOfStep) {
                return;
            }
        }

    }
}
