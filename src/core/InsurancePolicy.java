package core;
public abstract class InsurancePolicy {
    protected String policyId;
    protected Vehicle vehicle;
    protected double premium;
    public InsurancePolicy(String policyId, Vehicle vehicle) {
        this.policyId = policyId;
        this.vehicle = vehicle;
    }
    public abstract double calculatePremium();
    public String getPolicyId() { return policyId; }
    @Override
    public String toString() {
        return "Policy ID: " + policyId + " | Premium: " + premium + " | Vehicle: " + vehicle.model;
    }
}
