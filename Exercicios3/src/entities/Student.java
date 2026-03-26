package entities;

public class Student {

    public String name;
    public double nota1 = 0;
    public double nota2 = 0;
    public double nota3 = 0;

    public void aprovacao(){
        double totalAno = nota1 + nota2 + nota3;
        if(totalAno >= 60 ){
            System.out.printf("FINAL GRADE = %.2f%n", totalAno);
            System.out.printf("PASS");
        } else {
            System.out.printf("FINAL GRADE = %.2f%n", totalAno);
            System.out.println("FAILED");
            System.out.printf("MISSING = %.2f%n", 60-totalAno);
        }
    }

}
