import java.util.Scanner;
class BinarySearch {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n = scanner.nextInt();
int[] arr = new int[n];
System.out.println("Enter the elements:");
for(int i = 0; i < n; i++) {
arr[i] = scanner.nextInt();
}
for(int i = 0; i < n - 1; i++) {
for(int j = 0; j < n - i - 1; j++) {
if(arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
System.out.print("Sorted array: ");
for(int i = 0; i < n; i++) {
System.out.print(arr[i] + " ");
}
System.out.println();
System.out.print("Enter the element to search: ");
int key = scanner.nextInt();
int low = 0;
int high = n - 1;
boolean found = false;
while(low <= high) {
int mid = (low + high) / 2;
if(arr[mid] == key) {
System.out.println("Element found at index: " + mid);
found = true;
break;
} else if(arr[mid] < key) {
low = mid + 1;
} else {
high = mid - 1;
}
}
if(!found) {
System.out.println("Element not found in the array.");
}

}
}
