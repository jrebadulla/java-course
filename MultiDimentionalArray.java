class Student {
    int rollno;
    String name;
    int marks;
}

public class MultiDimentionalArray {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Jellian";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 12;
        s2.name = "Marie";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 16;
        s3.name = "Nicole";
        s3.marks = 90;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Enhance for Loop
        for (Student stud : students) {
            System.out.println(stud.name + " : " + stud.marks);
        }

        // for (int i = 0; i < students.length; i++) {
        // System.out.println(students[i].name);
        // }

        int nums[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {

        for (int j = 0; j < 5; j++) {
        nums[i][j] = (int) (Math.random() * 10);
        System.out.print(nums[i][j] + " ");
        }
        System.out.println();
        }

        // // Enhance for Loop

        // for (int n[] : nums) {
        // for (int m : n) {
        // System.out.print(m + " ");
        // }
        // System.out.println();
        // }

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 7;
        nums[2] = 9;
        nums[3] = 5;

        for (int n : nums) {
        System.out.println(n);
        }

    }
}
