import java.util.*;

public class arraycc {
    public static int linearSearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int num[]) {
        int largenum = Integer.MIN_VALUE;
        int samllnum = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largenum < num[i]) {
                largenum = num[i];
            }
            if (samllnum > num[i]) {
                samllnum = num[i];

            }

        }
        System.out.println("smallest is :" + samllnum);
        return largenum;
    }

    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;

            }
            if (num[mid] < key) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void rev_array(int num[]) {
        int first = 0;
        int last = num.length - 1;

        while (first < last) {
            // swao
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;

        }
    }

    public static void pair_array(int num[]) {
        int total_pair = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
                total_pair++;
            }
            System.out.println();

        }
        System.out.println("total pairs :" + total_pair);
    }

    public static void subarray(int num[]) {
        int total_pair = 0;

        for (int i = 0; i < num.length; i++) {
            int start = i;

            for (int j = i; j < num.length; j++) {
                int end = j;

                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");

                }
                total_pair++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total pair :" + total_pair);
    }

    public static void Sum_subarray(int num[]) {

        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int start = i;

            for (int j = i; j < num.length; j++) {
                int end = j;
                current_sum = 0;

                for (int k = start; k <= end; k++) {

                    // subarray sum
                    current_sum += num[k];

                }
                System.out.println(current_sum);
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                }

            }

        }
        System.out.println("max sum :" + max_sum);

    }

    public static void Prefix_Sum_subarray(int num[]) {

        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int start = i;

            for (int j = i; j < num.length; j++) {
                int end = j;
                current_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.println(current_sum);
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                }

            }

        }
        System.out.println("max sum :" + max_sum);

    }

    public static void Kadane_algo(int num[]) {
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int i = 0; i < num.length; i++) {
            current_sum = current_sum + num[i];
            if (current_sum < 0) {
                current_sum = 0;
            }
            max_sum = Math.max(current_sum, max_sum);
        }
        System.out.println("max sum = " + max_sum);
    }

    // public static boolean judgeSquareSum(int c) {
    // int a = 0;
    // int b = (int)Math.sqrt( c);
    // int sum = (a * a) + (b * b);

    // if (sum == c) {
    // return true;
    // } else if (sum < c) {
    // a++;
    // } else {
    // b--;
    // }
    // return false;
    // }

    public static boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (int) Math.sqrt(c);

        while (a <= b) {
            long currentSum = a * a + b * b;
            if (currentSum == c) {
                return true;
            } else if (currentSum < c) {
                a++;
            } else {
                b--;
            }
        }

        return false;
    }

    // public static boolean isPowerOfTwo(int n) {
    // for (int i = 0; Math.pow(2, i) <= n; i++) {
    // if (n == Math.pow(2, i)) {
    // return true;
    // }
    // }
    // return false;
    // }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        int key = 60;
        // System.out.println(reverse(-123));
        // System.out.println(isPowerOfTwo(3));
        // System.out.println(judgeSquareSum(2147483600));
        // Kadane_algo(num);
        // Prefix_Sum_subarray(num);
        // Sum_subarray(num);
        // subarray(num);
        // pair_array(num);

        //reverse the array
        // rev_array(num);
        // for (int i = 0; i < num.length; i++) {
        // System.out.print(num[i]+ " ");

        // }

        // System.out.println("index value :"+binarySearch(num, key));

        // System.out.println("largest num is :"+ getLargest(num));
        // int index = linearSearch(num, key);
        // if (index == -1) {
        // System.out.println("NOT found");

        // }else{
        // System.out.println("key is at index :"+ index);

        // }

        // int marks[] = new int[50];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[3] = sc.nextInt();

        // System.out.println("1st "+ marks[0]);
        // System.out.println("1st "+ marks[1]);
        // System.out.println("1st "+ marks[3]);
        // System.out.println("1st "+ marks[4]);

        // // marks[0] = marks[0] + 100;
        // // System.out.println("updated :"+ marks[0]);
        // int percentage = (marks[0]+ marks[1] + marks[3])/3;
        // System.out.println(percentage);
        // System.out.println("length of array :"+ marks.length);
        // }

    }
    public static void main(String[] args) {
        
    }

}
