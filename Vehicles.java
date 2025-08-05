import java.util.Scanner;
import java.time.Year;

class Vehicle {
String brand, model;
int year;
double price;

Vehicle(String brand, String model, int year, double price) {
this.brand = brand;
this.model = model;
this.year = year;
this.price = price;
}

void showInfo() {
System.out.println("Brand: " + brand);
System.out.println("Model: " + model);
System.out.println("Year: " + year);
System.out.println("Price: Rs" + price);
}

double resaleValue() {
int age = Year.now().getValue() - year;
return price * Math.pow(0.85, age);
}
}

class Car extends Vehicle {
int doors;

Car(String brand, String model, int year, double price, int doors) {
super(brand, model, year, price);
this.doors = doors;
}

void showCar() {
System.out.println("\n--- Car ---");
showInfo();
System.out.println("Doors: " + doors);
System.out.println("Insurance: Rs" + (5000 + 1000 * doors));
System.out.println("Maintenance: Rs" + (3000 + 500 * doors));
System.out.printf("Resale: Rs%.2f\n", resaleValue());
}
}

class Bike extends Vehicle {
boolean sidecar;

Bike(String brand, String model, int year, double price, boolean sidecar) {
super(brand, model, year, price);
this.sidecar = sidecar;
}

void showBike() {
System.out.println("\n--- Motorcycle ---");
showInfo();
System.out.println("Sidecar: " + (sidecar ? "Yes" : "No"));
System.out.println("Insurance: Rs" + (sidecar ? 4000 : 2500));
System.out.println("Maintenance: Rs" + (sidecar ? 3000 : 2000));
System.out.printf("Resale: Rs%.2f\n", resaleValue());
}
}

public class Vehicles {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Car Brand: ");
String cb = sc.nextLine();
System.out.print("Model: ");
String cm = sc.nextLine();
System.out.print("Year: ");
int cy = sc.nextInt();
System.out.print("Price: ");
double cp = sc.nextDouble();
System.out.print("Doors: ");
int doors = sc.nextInt();
sc.nextLine();

System.out.print("\nBike Brand: ");
String bb = sc.nextLine();
System.out.print("Model: ");
String bm = sc.nextLine();
System.out.print("Year: ");
int by = sc.nextInt();
System.out.print("Price: ");
double bp = sc.nextDouble();
sc.nextLine();
System.out.print("Has sidecar (yes/no): ");
boolean sidecar = sc.nextLine().equalsIgnoreCase("yes");

Car car = new Car(cb, cm, cy, cp, doors);
Bike bike = new Bike(bb, bm, by, bp, sidecar);

System.out.println("\n=== Vehicle Report ===");
car.showCar();
bike.showBike();
}
}
