public class Main {
    public static void main(String[] args) {
        Car carRakhimzhanov = new Car("W223", "Mercedes-Benz", 2023, 140000.0, "Obsidian Black", 7);

        System.out.println(carRakhimzhanov.toString());

        carRakhimzhanov.sell(2);

        System.out.println("Brand: " + carRakhimzhanov.getBrand());
        System.out.println("Model: " + carRakhimzhanov.getModel());
        System.out.println("Year: " + carRakhimzhanov.getYear());
        System.out.println("Price: " + carRakhimzhanov.getPrice());
        System.out.println("Color: " + carRakhimzhanov.getColor());
        System.out.println("Quantity: " + carRakhimzhanov.getQuantity());

        carRakhimzhanov.setColor("Selenite Grey");
        carRakhimzhanov.setPrice(145000.0);
        carRakhimzhanov.setYear(2024);
        carRakhimzhanov.delivery(4);

        System.out.println(carRakhimzhanov.toString());
    }
}