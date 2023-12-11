/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cgpacalc;
import java.util.Scanner;
/**
 *
 * @author ayomi
 */
public class CgpaCalc {

    /**
     * @param args the command line arguments
     */
    
    public String getMyGrade(double score){
        String grade = "";
        if(score >= 70 && score <= 100){
            grade = "A";
        } else if (score >= 60 && score <= 69){
            grade = "B";
        } else if (score >= 50 && score <= 59){
            grade = "C";
        } else if (score >= 45 && score <= 49){
            grade = "D"; 
        } else if(score >= 40 && score <= 44){
            grade = "E";     
        } else if(score >= 0 && score <= 39){
            grade = "F";   
        }    
        return grade; 
    }
    
    public int getMyPoint(String grade){
        int point = 0;
        switch(grade){
            case "A":
                point = 5;
                break;
            case "B":
                point = 4;
                break;
            case "C":
                point = 3;
                break;
            case "D":
                point = 2;
                break;
            case "E":
                point = 1;
                break;    
            default:
                point = 0;
                break;    
        }
        return point;
    }
       
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("SIMPLE CGPA CALCULATION SYSTEM");
        
        Scanner i = new Scanner(System.in);
        
        System.out.print("Enter Course 1: ");
        String course1 = i.nextLine();
        
        System.out.print("Enter " + course1 + " units: ");
        int gradeUnit1 = i.nextInt();
        
        System.out.print("Enter " + course1 + " score: ");
        double score1 = i.nextDouble();
        
        i.nextLine();
                     
        System.out.print("Enter Course 2: ");
        String course2 = i.nextLine();
        
        System.out.print("Enter " + course2 + " units: ");
        int gradeUnit2 = i.nextInt();
                
        System.out.print("Enter " + course2 + " score: ");
        double score2 = i.nextDouble();
        
        i.nextLine();
        
        System.out.print("Enter Course 3: ");
        String course3 = i.nextLine();
        
        System.out.print("Enter " + course3 + " units: ");
        int gradeUnit3 = i.nextInt();
        
        System.out.print("Enter " + course3 + " score: ");
        double score3 = i.nextDouble();
        
        i.nextLine();
        
        System.out.print("Enter Course 4: ");
        String course4 = i.nextLine();
        
        System.out.print("Enter " + course4 + " units: ");
        int gradeUnit4 = i.nextInt();
        
        System.out.print("Enter " + course4 + " score: ");
        double score4 = i.nextDouble();
        
        i.nextLine();
        
        System.out.print("Enter Course 5: ");
        String course5 = i.nextLine();
        
        System.out.print("Enter " + course5 + " units: ");
        int gradeUnit5 = i.nextInt();
        
        System.out.print("Enter " + course5 + " score: ");
        double score5 = i.nextDouble();
        
            
        CgpaCalc st = new CgpaCalc();        
        
        String grade1 = st.getMyGrade(score1);
        String grade2 = st.getMyGrade(score2);
        String grade3 = st.getMyGrade(score3);
        String grade4 = st.getMyGrade(score4);
        String grade5 = st.getMyGrade(score5);
        
        int point1 = st.getMyPoint(grade1);
        int point2 = st.getMyPoint(grade2);
        int point3 = st.getMyPoint(grade3);
        int point4 = st.getMyPoint(grade4);
        int point5 = st.getMyPoint(grade5);
              
        int totalGradeUnit = gradeUnit1 + gradeUnit2 + gradeUnit3 + gradeUnit4 + gradeUnit5;
        double TotalQualityPoint = (point1 * gradeUnit1) + (point2 * gradeUnit2) + (point3 * gradeUnit3) + (point4 * gradeUnit4) + (point5 * gradeUnit5);
        double Gpa = TotalQualityPoint /  totalGradeUnit;
        
        
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|COURSE CODE |  COURSE UNIT   |  GRADE  | POINT  |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.println("|   " + course1+ "   |       " + gradeUnit1 + "        |    " + grade1 + "    |    " + point1 + "   |");
        System.out.println("|   " + course2+ "   |       " + gradeUnit2 + "        |    " + grade2 + "    |    " + point2 + "   |");
        System.out.println("|   " + course3+ "   |       " + gradeUnit3 + "        |    " + grade3 + "    |    " + point3 + "   |");
        System.out.println("|   " + course4+ "   |       " + gradeUnit4 + "        |    " + grade4 + "    |    " + point4 + "   |");
        System.out.println("|   " + course5+ "   |       " + gradeUnit5 + "        |    " + grade5 + "    |    " + point5 + "   |");
        System.out.println("|------------|----------------|---------|--------|");
        System.out.format(" Your Gpa is = %.2f", Gpa);
        System.out.println("\b to two decimal places.");
    }
}
