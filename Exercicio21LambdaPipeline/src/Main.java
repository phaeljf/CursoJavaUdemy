import entities.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws FileNotFoundException {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    IO.println("Enter full file path: ");
    //String path = sc.nextLine();
    String path = "D:\\teste\\in.txt";

    try(BufferedReader br = new BufferedReader(new FileReader(path))) {

        List<Product> products = new ArrayList<>();

        String line =  br.readLine();

        while (line != null) {
            String[] lineSplit = line.split(",");
            products.add(new  Product(lineSplit[0], Double.parseDouble(lineSplit[1])));
            line = br.readLine();
        }

//        double avg = products.stream()
//                .mapToDouble(Product::getPrice)
//                .average()
//                .orElse(0.0);

        double avg = products.stream()
                .map(p -> p.getPrice())
                .reduce(0.0, (x, y) -> x+y)/products.size();



        //System.out.printf("Average price: %.2f\n", avg);
        System.out.println("Average price: " + String.format("%.2f", avg));

//        products.stream()
//                .filter(p -> p.getPrice() < avg)
//                .sorted(Comparator.reverseOrder())
//                .forEach(p -> System.out.println(p.getName()));

        products.stream()
                .filter(p -> p.getPrice() < avg)
                .map(Product::getName)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    } catch (IOException e) {
        System.err.println("Error: " + e.getMessage());
    }
    sc.close();


}
