/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AL Masdar
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ManageStudent extends StudentDegree implements Manger{
    //Scanner in ;
    private ArrayList<StudentDegree>students;
//   PrintWriter out;

    public ManageStudent() throws FileNotFoundException {
//       in= new Scanner(System.in);
        students = new ArrayList<>();
//        out = new PrintWriter("text.txt");


    }


  //  @Override
    public void add(StudentDegree student) {
        // add a Student to ArrayList and Then Printing thr AraayList to File //
        students.add(student);
//        for (int i = 0; i < students.size(); i++)
//        {
//             out.print(students.get(i).getId());
//             out.print(students.get(i).getName());
//             out.print(students.get(i).getMajor());
//             out.print(students.get(i).getSubject());
//             out.print(students.get(i).getDegree());
//        }


    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Student student) {
        int index=  students.indexOf(student);
        students.remove(index);
    }

    @Override
    public void display() {
        System.out.println(students);
        // System.out.println(computeavreage());

    }



}


