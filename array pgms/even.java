import java.util.Scanner;
class even {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();
int[] array = new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++) {
array[i] = sc.nextInt();
}
System.out.println("Even elements in the array:");
for(int i=0;i<n;i++) {
if(array[i] % 2 == 0) {
System.out.println(array[i]);
}
}
}
}
