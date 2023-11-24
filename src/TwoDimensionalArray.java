import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] nums = new int[3][4];

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 4; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }

        }



        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        for(int n[] : nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }





////        System.out.println(Arrays.toString(array2));
////        System.out.println("array2.length = " + array2.length);
////
////        for (int[] outer : array2) {
////            System.out.println(Arrays.toString(outer));
////
////        }
//
//        for (int i = 0; i < array2.length; i++) {
//            var innerArray = array2[i];
//            for (int j = 0; j < innerArray.length; j++) {
////                System.out.println(array2[i][j] + " ");
//
//                array2[i][j] = (i * 10) + (j + 1);
//            }
////            System.out.println();
////        }
//
////        int[][] num = {{1,2,3}, {1,2,3}};
////
////        System.out.println(Arrays.toString(num));
//
////        for(var outer : array2 ){
////            for(var element : outer){
////                System.out.print(element+" ");
////            }
////            System.out.println();
////
////        }
//
//            System.out.println(Arrays.deepToString(array2));
//
//        }
    }
}
