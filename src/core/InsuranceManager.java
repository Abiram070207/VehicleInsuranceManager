package core;
import java.util.*;
public class InsuranceManager {
    private Map<String, InsurancePolicy> policies = new HashMap<>();
    public void addPolicy(InsurancePolicy p) { policies.put(p.getPolicyId(), p); }
    public InsurancePolicy getPolicy(String id) { return policies.get(id); }
    public Collection<InsurancePolicy> getAllPolicies() { return policies.values(); }
}
