class EmpWage {
    public static final int isPresent = 1;
    public static final int empPerRate = 20;
    public static final int isPartTime = 2;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static void main(String[] args) {

        // System.out.println();
        EmpComputation empComputation = new EmpComputation();
        empComputation.CalculateWageWorkingHour(empPerRate, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH);
    }
}

class EmpComputation {
    public static final int isPresent = 1;
    // public static final int empPerRate = 20;
    public static final int isPartTime = 2;
    // public static final int NUM_OF_WORKING_DAYS = 20;
    // public static final int MAX_HRS_IN_MONTH = 10;

    void CalculateWageWorkingHour(int empPerRate, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        int empHrs = 0, totalEmphrs = 0, totalWorkingDays = 0;
        while (totalEmphrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
            case isPresent:
                empHrs = 8;
                break;
            case isPartTime:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
            }
            totalEmphrs += empHrs;
            System.out.println("Days:- " + totalWorkingDays + " EmpHrs:- " + empHrs);
        }
        int totalEmpWage = totalEmphrs + empPerRate;
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}