class EmpWage {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int isPresent = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        // System.out.println();

        if (empCheck == isPresent) {
            System.out.println("Employee is present.");
        } else {
            System.out.println("Employee is Absent.");
        }
    }
}
