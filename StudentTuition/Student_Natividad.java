public class Student_Natividad {

    int studentNo;
    String studentName;
    String course;
    int unitsEnrolled;
    final double miscFee = 11879.60;
    double tuitionFee;

    public Student_Natividad(int studentNo, String studentName, String course, int unitsEnrolled) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.course = course.toUpperCase();
        this.unitsEnrolled = unitsEnrolled;
    }

    public double tuitionRate() {
        switch (course) {
            case "CS":
                return 1400;
            case "EMC":
                return 2000;
            case "NETAD":
                return 1600;
            case "WEBDEV":
                return 1500;
            default:
                return 0;
        }
    }

    public double compute() {
        tuitionFee = (tuitionRate() * unitsEnrolled) + miscFee;
        return tuitionFee;
    }

    public void display() {
        System.out.println("\nDisplaying Student Details");
        System.out.println("Student No : " + studentNo);
        System.out.println("Name : " + studentName);

        String courseName = "";
        switch (course) {
            case "CS":
                courseName = "Computer Science";
                break;
            case "EMC":
                courseName = "Entertainment and MultiMedia Computing";
                break;
            case "NETAD":
                courseName = "IT Net Administration";
                break;
            case "WEBDEV":
                courseName = "IT Web Development";
                break;
        }

        System.out.println("Course " + courseName);
        System.out.printf("Per Unit Tuition : Php %,.2f\n", tuitionRate());
        System.out.printf("Total Tuition Fee with Misc Fees: Php %,.2f\n", compute());
    }
}

