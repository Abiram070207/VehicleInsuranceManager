package core;
import java.util.Random;
public class ComprehensivePolicy extends InsurancePolicy {
    public ComprehensivePolicy(String id, Vehicle v) {
        super(id, v);
    }
    @Override
    public double calculatePremium() {
        premium = 5000 + new Random().nextInt(3000);
        return premium;
    }
}
