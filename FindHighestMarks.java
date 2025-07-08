class Student {
    String name;
    int roll;
    int marks;

    Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}

public class HighestMarks {
    public static void main(String[] args) {
        Student[] s = {
            new Student("Ajay", 101, 85),
            new Student("Neha", 102, 92),
            new Student("Rahul", 103, 78)
        };

        Student top = s[0];
        for (Student st : s) {
            if (st.marks > top.marks) {
                top = st;
            }
        }

        System.out.println("Topper: " + top.name + ", Roll: " + top.roll);
    }
}
