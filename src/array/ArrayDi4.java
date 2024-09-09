package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        //2X3 2차원 배열 생성
        int[][] arr = new int[3][3];

        int i = 1;
        for (int row = 0; row < arr.length; row++) {
            for(int colum=0;colum<arr[row].length;colum++){
                arr[row][colum] = i++;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for(int colum =0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum] + " ");
            }
            System.out.println();
        }


    }
}
