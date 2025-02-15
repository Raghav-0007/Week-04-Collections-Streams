package multiplecatchblocks;

public class Main {

    public static int getValue(int[] arr, int index){
        return arr[index];
    }
    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,7};
        int[] arr=null;
        try {
            int value=getValue(arr, 7);
            System.out.println(value);
        }catch (IndexOutOfBoundsException | NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
