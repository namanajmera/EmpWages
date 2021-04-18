class EmpWage {
    public static final int isPresent = 1;
    public static final int empPerRate = 20;
    public static final int isPartTime = 2;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double empCheck = Math.floor(Math.random() * 10) % 3;
        // System.out.println();
        int empPerHour = 0;
        int empWage = 0;
        if (empCheck == isPresent) {
            empPerHour = 8;
        } else if (empCheck == isPartTime) {
            empPerHour = 4;
        }
        empWage = empPerHour * empPerRate;
        System.out.println("Emp Wage:- " + empWage);
    }
}
