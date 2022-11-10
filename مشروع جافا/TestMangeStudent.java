/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;

/**
 *
 * @author AL Masdar
 */
public class TestMangeStudent {
    public static void main(String[] args) throws FileNotFoundException {
    ManageStudent s=new ManageStudent();
    StudentDegree s1=new StudentDegree();
    StudentDegree s2=new StudentDegree();
    String[] sub=new String[6];
    double[] deg=new double[6];
    sub[0]="Math";
    deg[0]=89.0;
    sub[1]="Math";
    deg[1]=70.0;
    sub[2]="Math";
    deg[2]=66.0;
    sub[3]="Math";
    deg[3]=50.0;
    sub[4]="Math";
    deg[4]=70.0;
    s1.setId(1);
    s1.setName("Ahmed");
    s1.setMajor("CS");
    s1.setSubject(sub);
    s1.setDegree(deg);
    s1.computeavreage();
    s2.setId(2);
    s2.setName("Ali");
    s2.setMajor("IS");
    s2.setSubject(sub);
    s2.setDegree(deg);
    s2.computeavreage();
    s.add(s1);
    s.add(s2);

    s.display();
    // s.delete(s1);
    //s.display();

//        System.out.println(s2.computeavreage());
}
}
