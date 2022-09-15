import java.util.Scanner;

public class TwoDArray {
        public static void main(String[] args){
        int[][] arr = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
        System.out.println("Enter data for " + (i+1)+" row");
        for(int j = 0 ; j < arr[0].length ; j++){
            System.out.println("ENter data ");
            arr[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0 ; i < arr.length ; i++){
           for(int j = 0 ; j < arr[0].length ; j++){
              System.out.print(arr[i][j] + " ");
        }
              System.out.println();
        }
}

}
