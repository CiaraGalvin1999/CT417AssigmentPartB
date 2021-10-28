import org.joda.time.DateTime;

import java.util.Calendar;
import java.util.Date;

public class College {

    public static void main(String[] args) {
    //CREATING TEST DATA

        //Test students (first created with empty arrays of courses and modules
        Student s1 = new Student("Ciara", 22, new Date(1999, Calendar.APRIL, 18), 12345, new CourseProgramme[1], new Module[1]);
        Student s2 = new Student("Andrew", 26, new Date(1995, Calendar.JANUARY, 1), 12346, new CourseProgramme[1], new Module[1]);
        Student s3 = new Student("Simon", 22, new Date(1998, Calendar.FEBRUARY, 23), 12347, new CourseProgramme[1], new Module[1]);
        Student s4 = new Student("Theodore", 22, new Date(1998, Calendar.SEPTEMBER, 14), 12348, new CourseProgramme[1], new Module[1]);
        Student s5 = new Student("Alvin", 22, new Date(1997, Calendar.DECEMBER, 30), 12348, new CourseProgramme[1], new Module[1]);

        //Array of students
        Student[] testStudents = {s1, s2, s3, s4, s5};

        //Test modules (first created with empty arrays of students and courses
        Module m1 = new Module("Software Engineering","CT417", new Student[1], new CourseProgramme[1]);
        Module m2 = new Module("Information Retrieval", "CT400", new Student[1], new CourseProgramme[1]);
        Module m3 = new Module("Professional Skills", "CT401", new Student[1], new CourseProgramme[1]);
        Module m4 = new Module("Systems Modelling", "CT402", new Student[1], new CourseProgramme[1]);
        Module m5 = new Module("Machine Learning", "CT403", new Student[1], new CourseProgramme[1]);

        //Array of modules
        Module[] testModules = {m1, m2, m3, m4, m5};

        //Test courses
        CourseProgramme c1 = new CourseProgramme("Computer Science", new Module[1], new Student[1], new DateTime(2021, 9, 5, 0, 0), new DateTime(2022, 5, 20, 23, 59));
        CourseProgramme c2 = new CourseProgramme("Engineering", new Module[1], new Student[1], new DateTime(2021, 9, 7, 0, 0), new DateTime(2022, 5, 22, 23, 59));
        CourseProgramme c3 = new CourseProgramme("Arts with IT", new Module[1], new Student[1], new DateTime(2021, 9, 10, 0, 0), new DateTime(2022, 5, 25, 23, 59));
        CourseProgramme c4 = new CourseProgramme("Mathematics", new Module[1], new Student[1], new DateTime(2021, 9, 10, 0, 0), new DateTime(2022, 5, 25, 23, 59));
        CourseProgramme c5 = new CourseProgramme("Physics", new Module[1], new Student[1], new DateTime(2021, 9, 12, 0, 0), new DateTime(2022, 5, 27, 23, 59));

        //Array of courses
        CourseProgramme[] testCourses = {c1, c2, c3, c4, c5};

        //Add courses and modules for each student
        //COURSES
        CourseProgramme[] s1Courses = {c1, c3, c5};
        s1.setCourses(s1Courses);

        CourseProgramme[] s2Courses = {c2, c3, c5};
        s2.setCourses(s2Courses);

        CourseProgramme[] s3Courses = {c1, c3, c4};
        s3.setCourses(s3Courses);

        CourseProgramme[] s4Courses = {c1, c2, c4};
        s4.setCourses(s4Courses);

        CourseProgramme[] s5Courses = {c2, c4, c5};
        s5.setCourses(s5Courses);

        //MODULES
        Module[] s1Modules = {m1, m2 ,m3, m4, m5};
        s1.setModules(s1Modules);

        Module[] s2Modules = {m1, m2, m3, m4};
        s2.setModules(s2Modules);

        Module[] s3Modules = {m1, m2, m3, m4, m5};
        s3.setModules(s3Modules);

        Module[] s4Modules = {m1, m2, m4, m5};
        s4.setModules(s4Modules);

        Module[] s5Modules = {m1, m2, m4, m5};
        s5.setModules(s5Modules);

        //Add students and courses for each module
        //STUDENTS
        Student[] m1Students = {s1, s2, s3, s4, s5};
        m1.setStudents(m1Students);

        Student[] m2Students = {s1, s2, s3, s4, s5};
        m2.setStudents(m2Students);

        Student[] m3Students = {s1, s2, s3};
        m3.setStudents(m3Students);

        Student[] m4Students = {s1, s2, s3, s4, s5};
        m4.setStudents(m4Students);

        Student[] m5Students = {s1, s3, s4, s5};
        m5.setStudents(m5Students);

        //COURSES
        CourseProgramme[] m1Courses = {c1, c2};
        m1.setCourses(m1Courses);

        CourseProgramme[] m2Courses = {c4, c5};
        m2.setCourses(m2Courses);

        CourseProgramme[] m3Courses = {c3};
        m3.setCourses(m3Courses);

        CourseProgramme[] m4Courses = {c2, c3, c5};
        m4.setCourses(m4Courses);

        CourseProgramme[] m5Courses = {c1, c4};
        m5.setCourses(m5Courses);

        //Add students and modules for each course
        //STUDENTS
        Student[] c1Students = {s1, s3, s4};
        c1.setStudents(c1Students);

        Student[] c2Students = {s2, s4, s5};
        c2.setStudents(c2Students);

        Student[] c3Students = {s1, s2, s3};
        c3.setStudents(c3Students);

        Student[] c4Students = {s3, s4, s5};
        c4.setStudents(c4Students);

        Student[] c5Students = {s1, s2, s5};
        c5.setStudents(c5Students);

        //MODULES
        Module[] c1Modules = {m1, m5};
        c1.setModules(c1Modules);

        Module[] c2Modules = {m1, m4};
        c2.setModules(c2Modules);

        Module[] c3Modules = {m3, m4};
        c3.setModules(c3Modules);

        Module[] c4Modules = {m2, m5};
        c4.setModules(c4Modules);

        Module[] c5Modules = {m2, m4};
        c5.setModules(c5Modules);


        //PRINT DATA
        System.out.println("\n~~~~~~~~~~~~~~~STUDENT DATA~~~~~~~~~~~~~~~");
        for(Student s: testStudents) {
            System.out.println("\n----------------\n");
            System.out.println("Student Name: " + s.getName());
            System.out.println("Student Age: " + s.getAge());
            System.out.println("Student DOB: " + s.getDob());
            System.out.println("Student ID: " + s.getId());
            System.out.println("Student Username: " + s.getUsername());
            System.out.println("Student Courses: ");
            for(CourseProgramme c: s.getCourses()) {
                System.out.println("\t" + c.getCourseName());
            }
            System.out.println("Student Modules: ");
            for(Module m: s.getModules()) {
                System.out.println("\t" + m.getModuleName());
            }
        }

        System.out.println("\n~~~~~~~~~~~~~~~MODULE DATA~~~~~~~~~~~~~~~");
        for(Module m: testModules) {
            System.out.println("\n-----------------\n");
            System.out.println("Module name: " + m.getModuleName());
            System.out.println("Module ID: " + m.getModuleID());
            System.out.println("Students taking module: ");
            for(Student s: m.getStudents()) {
                System.out.println("\t" + s.getName());
            }
            System.out.println("Courses taking module: ");
            for(CourseProgramme c: m.getCourses()) {
                System.out.println("\t" + c.getCourseName());
            }
        }
        System.out.println("\n~~~~~~~~~~~~~~~COURSE DATA~~~~~~~~~~~~~~~");
        for(CourseProgramme c: testCourses) {
            System.out.println("\n-----------------\n");
            System.out.println("Course Name: " + c.getCourseName());
            System.out.println("Students taking course: ");
            for(Student s: c.getStudents()) {
                System.out.println("\t" + s.getName());
            }
            System.out.println("Modules for course: ");
            for(Module m: c.getModules()) {
                System.out.println("\t" + m.getModuleName());
            }
            System.out.println("Course start date: " + c.getStartDate());
            System.out.println("Course end date: " + c.getEndDate());
        }
    }

}
