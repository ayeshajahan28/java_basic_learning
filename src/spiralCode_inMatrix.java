public class spiralCode_inMatrix {

    public static void spiralCode(int arr[][]){
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        int n = arr.length;
        int m = arr[0].length;

        int tne = n*m;
        int count = 0;

        //left wall
        while (count<tne) {
            for (int i=minr, j=minc; i<=maxr && count<tne; i++) {
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minc++;
            //bottom wall
            for (int i=maxr, j=minc; j<=maxc && count<tne; j++){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxr--;
            //right wall
            for(int i=maxr, j=maxc; i>=minr && count<tne; i--){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            maxc--;
            //top wall
            for (int i=minr, j=maxc; j>=minc && count<tne;j--){
                System.out.print(arr[i][j] + " ");
                count++;
            }
            minr++;
        }
    }
    public static void main(String[] args) {
        int arr [][] = {{1, 2, 3},
                        {4, 5, 6}};
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int arr[][] = new int[n][m];

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
        spiralCode(arr);
    }
}

