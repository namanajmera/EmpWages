class EmpWage {
    static final int isPresent = 1;
    static final int empPerRate = 20;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double empCheck = Math.floor(Math.random() * 10) % 2;

        // System.out.println();
        int empPerHour = 0;
        int empWage = 0;
        if (empCheck == isPresent) {
            empPerHour = 8;
        }
        empWage = empPerHour * empPerRate;
        System.out.println("Emp Wage:- " + empWage);
    }
}
