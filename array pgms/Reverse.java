import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number of rows: ");
int rows = scanner.nextInt();
System.out.print("Enter number of columns: ");
int cols = scanner.nextInt();
int[][] matrix = new int[rows][cols];
System.out.println("Enter matrix elements:");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix[i][j] = scanner.nextInt();
}
}
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols / 2; j++) {
int temp = matrix[i][j];
matrix[i][j] = matrix[i][cols - 1 - j];
matrix[i][cols - 1 - j] = temp;
}
}
System.out.println("Reversed matrix (row-wise):");
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
}
}
