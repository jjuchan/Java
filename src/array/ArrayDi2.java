package array;

public class ArrayDi2 {
    public static void main(String[] args) {
        //2X3 2차원 배열 생성
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
        };

        for (int row = 0; row < arr.length; row++) {
            for(int colum =0; colum < arr[row].length; colum++) {
                System.out.print(arr[row][colum] + " ");
            }
            System.out.println();
        }


    }
}
