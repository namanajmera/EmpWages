class EmpWage {
    public static final int isPresent = 1;
    public static final int empPerRate = 20;
    public static final int isPartTime = 2;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {

        // System.out.println();
        int empPerHour = 0;
        int empWage = 0;
        int totalWage = 0;

        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
            case isPresent:
                empPerHour = 8;
                break;
            case isPartTime:
                empPerHour = 4;
                break;
            default:
                empPerHour = 0;
            }
            empWage = empPerHour * empPerRate;
            totalWage += empWage;
            System.out.println("Emp Wage:- " + empWage);
        }
        System.out.print("Total wage is:- " + totalWage);
    }
}
