//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 void  main() {
    ArrayList<Integer> n = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        n.add(i);

    }
    IO.println("sum : " + getSum(n));
     IO.println("average : " + getAverage(n));
     IO.println("max : " + getMax(n));
     IO.println("min : " + getMin(n));

    HashSet<String> h =new HashSet<>();
    h.add("USA");
    h.add("Canada");
    h.add("France");
    h.add("Australia");
    h.add("japan");

    for(String c : h){
        IO.println(c);
    }

    HashMap<Integer,Double> e = new HashMap<>();
    e.put(350,10000.0);
    e.put(327,7500.5);
    e.put(332,800.0);
    e.put(349,6500.5);
    e.put(359, 7000.4);

    for(Map.Entry<Integer,Double> entry : e.entrySet()){
        IO.println(entry.getKey() + " : " + entry.getValue());
    }



}
    public static int getSum(ArrayList<Integer> n) {
        int sum = 0;
        for (int s : n) {
            sum += s;
        }
        return sum;
    }

    public static int getMax(ArrayList<Integer> n){
        return Collections.max(n);

        }
    public static int getMin (ArrayList<Integer> n){
        return Collections.min(n);
        }

        public static double getAverage(ArrayList<Integer>n){
            double a = 0;
             a = (double) getSum(n) / n.size();
            return a;
        }
        public static double getAverageSalary(HashMap<Integer,Double>e){
            double sum=0;
            for(double s : e.values()){
                sum += s;
            }
            return sum;
        }




