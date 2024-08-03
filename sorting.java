import java.util.Arrays;
import java.util.Collections;
//Array.sort(arr)
//0(n logn) 
public class sorting {
    public static void bubblesort(int num []){
        for (int turn = 0; turn < num.length; turn++) {
            for (int j = 0; j < num.length - 1 - turn; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }


    public static void selectionsort(int num[]){
        for (int i = 0; i < num.length; i++) {
            int minPos = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[minPos] < num[j]) {
                    minPos = j;
                }
            }
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
        }
    }

    public static void insertion_sort(int num[]){
        for (int i = 1; i < num.length; i++) {
            int curr = num[i];
            int prevv = i-1;

            //find out correct pos to insert
            while (prevv >= 0 && num[prevv] > curr) {
                num[prevv + 1] = num[prevv];
                prevv--;
            }
            //insert
            num[prevv + 1] = curr;
        }
    }



    public static void printARR(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ " ");
        }
        System.out.println();
    }
    
    public static void countsort(int num[]){
        int largeest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            largeest = Math.max(largeest, num[i]);
        }

        int count[] = new int[largeest+ 1];
        for (int i = 0; i < count.length; i++) {
            count[num[i]]++;
        }
        //sorting
        int j = 0 ;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                num[j] = i; 
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {1,4,1,3,2,4,3,7};
        // int num[] = {5,4,1,3,2};
        // bubblesort(num);
        // selectionsort(num);
        // insertion_sort(num);
        // Arrays.sort(num);
        // Arrays.sort(num,0,3);
        // Arrays.sort(num, Collections.reverseOrder());
        // Arrays.sort(num, 0,3,Collections.reverseOrder());
        countsort(num);
        printARR(num);
    }
    
}
