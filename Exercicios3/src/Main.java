//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import entities.Employee;
import entities.Rectangle;
import entities.Student;
import util.CurrencyConverter;

import java.util.Locale;

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    /*
    //Exercicio 1
    Rectangle rectangle = new Rectangle();
    System.out.println("Enter rectangle width and height: ");
    double w =  sc.nextDouble();
    double h = sc.nextDouble();
    rectangle.width = w;
    rectangle.height = h;
    System.out.printf("AREA =  %.2f%n", rectangle.area());
    System.out.printf("PERIMETER =  %.2f%n", rectangle.perimeter());
    System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());


    //Exercicio 2
    Employee emp = new Employee();
    System.out.print("Name: ");
    emp.name = sc.nextLine();
    System.out.print("Gross salary: ");
    emp.grossSalary = sc.nextDouble();
    System.out.print("Tax: ");
    emp.tax = sc.nextDouble();

    System.out.println("Employee: "+ emp);

    System.out.print("Which percentage to increase salary? ");
    emp.increaseSalary(sc.nextDouble());

    System.out.print("Upadate data: "+ emp);

    //Exercicio 3
    Student student = new Student();
    System.out.print("Studant name: ");
    student.name = sc.nextLine();

    double nota1 = 0.0;
    double nota2 = 0.0;
    double nota3 = 0.0;

    do{
        System.out.print("Nota 1 Semenstre: ");
        nota1 = sc.nextDouble();
    }while(nota1 < 0 || nota1 > 30);
    student.nota1 = nota1;

    do{
        System.out.print("Nota 2 Semenstre: ");
        nota2 = sc.nextDouble();
    }while(nota2 < 0 || nota2 > 35);
    student.nota2 = nota2;

    do{
        System.out.print("Nota 3 Semenstre: ");
        nota3 = sc.nextDouble();
    }while(nota3 < 0 || nota3 > 35);
    student.nota3 = nota3;

    student.aprovacao();

      */

    //Exercicio 4
    System.out.print("What is the dollar price? ");
    double dollarPrice = sc.nextDouble();

    System.out.print("How many dollars will be bought? ");
    double dollarBought = sc.nextDouble();

    System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter(dollarPrice, dollarBought));


    sc.close();
}
