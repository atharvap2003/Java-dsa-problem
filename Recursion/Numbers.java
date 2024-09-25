public class Numbers {


    // Print upto decreasing order of number:: 
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }


    // Print upto increasing order of number::
    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");

    }
     
    // Factorial finding?? 
    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        // int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    
    // Ṣum of n Numbers
    public static int sumOfN(int n){
        if(n == 1){
            return 1;
        }
        int snum1 =  sumOfN(n-1);
        int re = n + snum1;
        return re;
    }

    // Fibonacci Number Building??
    public static int fib(int n){
        if(n==1 || n==0) return n;

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // Array is Sorted or not??
    public static boolean isSorted(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    // First Occurence of the Number:
    public static int firstOcc(int arr[], int key, int i){
        if(arr[i] == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOcc(arr, key, i+1);
    }


    // Last Occurence of the Number:
    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }


    public static void main(String[] args) {

        // int arr[] = {1,2,4,94,5,5,45};
        // System.out.println(isSorted(arr, 0));

        // System.out.println(lastOcc(arr, 5, 0));

    }
}