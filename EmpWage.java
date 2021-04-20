class EmpWage {
    public static final int isPresent = 1;
    public static final int empPerRate = 20;
    public static final int isPartTime = 2;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 10;

    public static void main(String[] args) {
        // System.out.println();
        EmpComputation empComputation = new EmpComputation();
        empComputation.calculateWageWorkingHour(empPerRate, NUM_OF_WORKING_DAYS, MAX_HRS_IN_MONTH);
    }
}
