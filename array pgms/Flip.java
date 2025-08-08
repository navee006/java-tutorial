import java.util.Scanner;
class Flip {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of rows: ");
int r = sc.nextInt();
System.out.print("Enter number of columns: ");
int c = sc.nextInt();
int[][] a = new int[r][c];
System.out.println("Enter matrix:");
for(int i=0;i<r;i++) {
for(int j=0;j<c;j++) {
a[i][j] = sc.nextInt();
}
}
System.out.println("Matrix before flipping:");
for(int i=0;i<r;i++) {
for(int j=0;j<c;j++) {
System.out.print(a[i][j] + " ");
}
System.out.println();
}
for(int j=0;j<c;j++) {
int temp = a[0][j];
a[0][j] = a[r-1][j];
a[r-1][j] = temp;
}
for(int i=0;i<r;i++) {
int temp = a[i][0];
a[i][0] = a[i][c-1];
a[i][c-1] = temp;
}
System.out.println("Matrix after flipping:");
for(int i=0;i<r;i++) {
for(int j=0;j<c;j++) {
System.out.print(a[i][j] + " ");
}
System.out.println();
}
sc.close();
}
}
