package nestedtrycatchblock;

public class Main {
    public static void main(String[] args) {

        int[] arr={1,2,4,5,6,7,8,9,0};
        try {
//            int value=arr[9];
            int value=arr[4];
            try {
//                int result=value/0;
                int result=value/2;
                System.out.println(result);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
