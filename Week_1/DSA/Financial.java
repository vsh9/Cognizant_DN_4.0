package Week_1.DSA;

public class Financial{

    // 1. Recursive method with constant growth rate
    public static double futureValue(double initialValue, double rate, int years){
        if(years==0){
            return initialValue;
        }
        return (1+rate)*futureValue(initialValue, rate, years - 1);
    }

    // 2. Recursive method with variable growth rates
    public static double fVRates(double initialValue, double[] rates, int year) {
        if(year==rates.length){
            return initialValue;
        }
        return (1+rates[year])*fVRates(initialValue, rates, year + 1);
    }

    // 3. Iterative version for optimization (variable growth rates)
    public static double fVIterative(double initialValue, double[] rates) {
        double value = initialValue;
        for (double rate:rates) {
            value*=(1+rate);
        }
        return value;
    }

    // Main method to demonstrate all three approaches
    public static void main(String[] args) {
        double initialInvestment=1000.0;

        // Constant Growth Rate
        double constantRate=0.05; // 5% annual growth
        int years = 3;
        double futureValConst=futureValue(initialInvestment, constantRate, years);
        System.out.println("Future value with constant growth over years:"+ years+ futureValConst);

        // Variable Growth Rates
        double[] variableRates={0.05, 0.03, 0.04}; // 5%, 3%, 4% growth rates
        double futureValVariable=fVRates(initialInvestment, variableRates, 0);
        System.out.println("Future value with variable growth rates:"+ futureValVariable);

        // Iterative Version
        double futureValIter=fVIterative(initialInvestment, variableRates);
        System.out.println("Future value:"+ futureValIter);
    }
}
