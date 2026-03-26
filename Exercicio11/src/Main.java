import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    IO.print("Entre com numero de formas: ");
    int formas = sc.nextInt();

    List<Shape> sp = new ArrayList<>();


    for (int i = 0; i < formas; i++) {
        IO.println("Forma " + (i + 1) + ":");
        IO.print("Retangulo ou Circulo (r/c)? ");
        char tipo = sc.next().toLowerCase().charAt(0);
        IO.print("Cor (BLACK/BLUE/RED): ");
        Color cor = Color.valueOf(sc.next().toUpperCase());

        if (tipo == 'r') {
            IO.print("Largura: ");
            double largura = sc.nextDouble();
            IO.print("Altura: ");
            double altura = sc.nextDouble();

            sp.add(new Rectangle(cor, largura, altura));

        }  else if (tipo == 'c') {
            IO.print("Raio: ");
            double raio = sc.nextDouble();

            sp.add(new Circle(cor, raio));
        }
    }

    IO.println("SHAPE AREAS:");

    for (Shape s : sp) {
        System.out.printf("%.2f \n",s.area());
    }
}
