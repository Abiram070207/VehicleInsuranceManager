package threads;
import java.util.*;
import core.InsurancePolicy;
public class ReportGenerator implements Runnable {
    private Collection<InsurancePolicy> policies;
    public ReportGenerator(Collection<InsurancePolicy> policies) { this.policies = policies; }
    @Override
    public void run() {
        System.out.println("[Report] Generating summary report...");
        System.out.println("Total policies: " + policies.size());
    }
}
