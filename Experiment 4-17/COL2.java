class LoanEMICalculator {
    double principal;
    double rate;
    int time;
    int downPayment;

    LoanEMICalculator(double principal, double rate) {
        this.principal = principal;
        this.rate = rate;
        this.time = 12;
        this.downPayment = 0;
        calculateEMI();
    }

    LoanEMICalculator(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.downPayment = 0;
        calculateEMI();
    }

    LoanEMICalculator(double principal, double rate, int time, int downPayment) {
        this.principal = principal - downPayment;
        this.rate = rate;
        this.time = time;
        this.downPayment = downPayment;
        calculateEMI();
    }

    void calculateEMI() {
        double monthlyRate = rate / (12 * 100);
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, time)) / (Math.pow(1 + monthlyRate, time) - 1);
        System.out.println("EMI: " + emi);
    }
}

public class COL2 {
    public static void main(String[] args) {
        new LoanEMICalculator(50000, 5.5);
        new LoanEMICalculator(50000, 5.5, 24);
        new LoanEMICalculator(50000, 5.5, 24, 5000);
    }
}
