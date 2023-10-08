package Java_Intro_1.array;

public class arrayQuestions {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(repeatDistinct(arr));

    }
    public static boolean repeatDistinct(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j <arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
