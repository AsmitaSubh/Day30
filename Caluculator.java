import java.util.Scanner;

public class CabInvoiceGenerator {
    private double distance;
    private double time;

    public CabInvoiceGenerator(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }

    public double calculateFare() {
        // Constants for fare calculation
        final double MINIMUM_FARE = 5.0;
        final double COST_PER_KM = 10.0;
        final double COST_PER_MINUTE = 1.0;

        // Calculate the fare based on distance and time
        double totalFare = Math.max(MINIMUM_FARE, distance * COST_PER_KM + time * COST_PER_MINUTE);
        return totalFare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled (in kilometers): ");
        double distance = scanner.nextDouble();

        System.out.print("Enter the time taken (in minutes): ");
        double time = scanner.nextDouble();

        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator(distance, time);
        double fare = invoiceGenerator.calculateFare();
        System.out.println("Total fare: $" + fare);

        scanner.close();
    }
}
