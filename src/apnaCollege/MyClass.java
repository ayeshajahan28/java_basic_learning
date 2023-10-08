package apnaCollege;

public class MyClass {
        public static void sortBinaryArray(int[] inputArray) {
            for(int i : inputArray){
                System.out.print(i + "  ");
            }
            int zeroCount=0;
            System.out.println("Input array before sorting");
            for(int i=0;i<inputArray.length;i++){
                if(inputArray[i]==0){
                    zeroCount++;
                }
            }
            for (int i=0;i<zeroCount;i++){
                inputArray[i]=0;
            }


            for (int i=zeroCount;i<inputArray.length;i++)
            {
                inputArray[i]=1;
            }
            System.out.println("Input array after sorting");

            for(int i : inputArray){
                System.out.print(i + " ");
            }
        }

        public static void main(String[] args){
            sortBinaryArray(new int[]{1,0,1,1,0,1,0,0});


        }
    }

