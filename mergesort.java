// program to take 2 array list of size is dynamic use user input and merge them and later sort them
import java.util.ArrayList;
import java.util.Scanner;

class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            list1.add(sc.nextInt());
        }

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            list2.add(sc.nextInt());
        }

        ArrayList<Integer> mergedList = mergeLists(list1, list2);
        System.out.println("Merged List: " + mergedList);
        
        mergedList.sort(null); // Sort the merged list
        System.out.println("Sorted Merged List: " + mergedList);
        
        sc.close();
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);
        return merged;
    }
}