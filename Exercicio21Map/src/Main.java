//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);
    IO.println("Enter file full path: ");
//    String path = sc.nextLine();
    String path = "D:\\teste\\election.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {

        String linha = br.readLine();
        Map<String, Integer> election = new TreeMap<>();

        while (linha != null) {
            String[] field = linha.split(",");
            String name = field[0];
            int amountVote = Integer.parseInt(field[1]);
            if (!election.containsKey(name)) {
                election.put(name, amountVote);
            } else {
                election.put(name, election.get(name) + amountVote);
            }
            linha = br.readLine();
        }
//        System.out.println();
//        for (Map.Entry<String, Integer> candidate : election.entrySet()) {
//            System.out.println(candidate.getKey() + ": " + candidate.getValue());
//        }
        System.out.println();
        election.forEach((key, value) -> System.out.println(key + ": " + value));


    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }

}

/*

//        ArrayList<Candidate> candidates = new ArrayList<>();

                if (!name.equals().foreach()) {
                    candidates.add(new Candidate(name, amountVote));
                } else if (name.equals(Candidate)) {


                }
*/