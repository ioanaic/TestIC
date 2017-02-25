/**
 * @author flo
 * @since 25/02/2017.
 */
public class ArraysExample {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[4] = 5;

//        int[] nums = new int[6];
//        nums[0] = 1;
//        nums[1] = 5;
//        ...

        int[] nums = {1,5,6,3,7,9};

        SkeletonJava.printConsole(nums[4]);

        int[][] matrix = new int[3][4];
        matrix[0][3] = 4;

        int[][] mat = {
                {1,2},
                {3,4},
                {5}
        };
        System.out.println(mat[2][0]);
    }
}
