import java.util.Scanner;

class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input for second array
        System.out.print("Enter the size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for(int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Common elements are:");
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // To avoid duplicates if same element appears more than once
                }
            }
        }
    }
}
