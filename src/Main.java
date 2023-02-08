public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the distance to travel in nautical miles:");

        int distance = scanner.nextInt();

        double regularMiles = distance * 1.15;

        System.out.println("Enter the top speed of the boat in knots:");

        double knots1 = scanner.nextDouble();

        double best = distance / knots1;

        System.out.println("Enter the average speed of the boat in knots:");

        double knots2 = scanner.nextDouble();

        double average = distance / knots2;

        String output = "The distance to travel in regular miles is: " + regularMiles + " miles\n"+"The best case travel time is: " + best + " hours at " + knots1 + " knots\n" + "The average case travel time is: " + average + " hours at " + knots2 + " knots";

        System.out.println(output);
    }
}
