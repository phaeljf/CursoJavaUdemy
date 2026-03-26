import entities.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    //System.out.println("Enter full file path: ");
    //String path = sc.nextLine();
    System.out.print("Enter salary: ");
    int salary = sc.nextInt();

    String path = "D:\\teste\\employees.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(path))){

        String line = br.readLine();

        List<Employee> emplooyers = new ArrayList<>();

        while (line != null) {

            String[] fields = line.split(",");
            emplooyers.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));

            line = br.readLine();
        }

        emplooyers.stream()
                .filter(e -> e.getSalary() > salary)
                .map(Employee::getEmail)
                .sorted()
                .forEach(System.out::println);

//        emplooyers.stream()
//                .filter(e -> e.getSalary() > salary)
//                .map(Employee::getEmail)
//                .sorted()
//                .forEach(System.out::println);

        double sum = emplooyers.stream()
                .filter(e -> e.getName().charAt(0) == 'M')
                .mapToDouble(Employee::getSalary)
                .sum();

        IO.print("Sum of salary of peole whose name starts with 'M': " + String.format("%.2f", sum));

    }catch(IOException ex){
        System.out.println("Error" + ex.getMessage());
    }



    sc.close();
}
