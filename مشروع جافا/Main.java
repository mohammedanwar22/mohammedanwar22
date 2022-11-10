/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileNotFoundException;
import java.time.Clock;
import java.util.Scanner;
import javax.security.auth.Subject;
import javax.swing.JOptionPane;

/**
 *
 * @author AL Masdar
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
    Scanner in =new Scanner (System.in);
    ManageStudent mange = new ManageStudent();
    StudentDegree student ;
    String[] subject= new String[6];
    double[] Degrees = new double[6];
    JOptionPane.showMessageDialog(null,"Wekcome to The Program ");
    do {
        System.out.println("Please Enter a for Aadding Students : ");
        System.out.println("Please Enter B for delete Student: ");
        System.out.println("Please Enter C to Display All Information About Students: ");
        System.out.println("Please Enter E to close The Program");
        char choice = in.next().charAt(0);
        switch(choice){
            case 'a':
            case 'A':
                student = new StudentDegree();
                System.out.println("Enter the Students ID ");
                student.setId(in.nextInt());
                System.out.println("Enter the Students Name ");
                student.setName(in.next());
                System.out.println("Enter students Major ");
                student.setMajor(in.next());
                System.out.println("Please Enter The Subject of Student following By Degree ");
                for (int i = 0; i < 6; i++)
                {
                    System.out.println("Subject  "+i+" : ");
                    subject[i]= in.next();
                    System.out.println("Degrees  "+i+" : ");
                    Degrees[i] = in.nextDouble();
                }
                student.setSubject(subject);
                student.setDegree(Degrees);
                student.computeavreage();
                mange.add(student);
                System.out.println("Student Added sucussefuly");
                break;
            case 'b':
            case 'B':
                // mange.delete(student);
                System.out.println("Student had Delete sucssflly");
                break;
            case 'c':
            case 'C':
                System.out.println("The List Of All Students Information ");
                mange.display();
                break;
            case 'e':
            case 'E':
                System.out.println("GOOD BYE");
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter Coorect Choice That Are Avilable : ");
                System.out.println();
                //    System.out.println(student.toString());


        }
    } while(true);
}
}
