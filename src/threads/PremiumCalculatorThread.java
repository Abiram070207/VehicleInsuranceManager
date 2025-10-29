package threads;
import core.InsurancePolicy;
public class PremiumCalculatorThread extends Thread {
    private InsurancePolicy policy;
    public PremiumCalculatorThread(InsurancePolicy policy) { this.policy = policy; }
    @Override
    public void run() {
        System.out.println("[Thread] Calculating premium in background...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("[Thread] Premium calculated: " + policy.calculatePremium());
    }
}
