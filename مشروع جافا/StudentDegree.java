/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author AL Masdar
 */
public class StudentDegree extends Student{
        private String[]subject;
        private double[] degree;
        private double avreage ;

        public StudentDegree(String[] subject, double[] degree, int id, String name, String major) {
            super(id, name, major);
            this.subject = subject;
            this.degree = degree;
        }

        public StudentDegree() {
            this.subject = null;
            this.degree = new double[6];
        }

        public String[] getSubject() {
            return subject;
        }

        public void setSubject(String[] subject) {
            this.subject = subject;
        }

        public double[] getDegree() {
            return degree;
        }

        public void setDegree(double[] degree) {
            this.degree = degree;
        }
        public void computeavreage(){

            double sum =0.0;
            for (int i = 0; i < 6; i++)
            {
                sum = sum + degree[i];
            }
            avreage = sum /6;


        }

        @Override
        public String toString() {
            System.out.println(super.toString());
            //  System.out.println("Student Id: "+getId()+" Student Name:  "+getName()+"  Major: "+getMajor());
            for (int i = 0; i < subject.length; i++)
            {
//            if(!subject[i].isEmpty()||!subject[i].equals(" ")){
//            }
                System.out.println( "StudentDegree{" + "subject=" + subject[i] + ", degree=" + degree[i] + '}');

            }
            System.out.println("Avreagea "+avreage);
            return "";
        }






    }


