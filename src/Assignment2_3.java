public class Assignment2_3 {
    public static void main(String[] args) {
        System.out.println("\nThis program generates the conversion table below:");

        System.out.println("\nkilograms     pounds\n---------     ------");

        for(int i = 1; i < 16; i++) {
            if(i % 2 == 1) {
                String space = i < 10 ? "             " : "            ";
                double pounds = i * 2.20462;
                System.out.format(i + space + "%.1f%n", pounds);
            }
        }

        System.out.println("\nGoodbye ...");
    }
}
