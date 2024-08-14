import java.util.Scanner;

public class Main {

    static void InputMatrix( int arr[][], int r, int c, String name) {
        Scanner scanner = new Scanner(System.in);
        for(int i= 0;i<r;i++){
            for(int j = 0; j<c;j++){
                System.out.print(name+"["+ i + "]["+ j+"]" +  "\t");
                arr[i][j ]= Integer.parseInt(scanner.next());
            }
        }
    }
    static void OutputMatrix( int arr[][], int r, int c) {
        for(int i= 0;i<r;i++){
            for(int j = 0; j<c;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập vào số dòng của ma trận A");
        int r1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập vào so cột của ma trận A");
        int c1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập vào số dòng của ma trận B");
        int r2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập vào so cột của ma trận B");
        int c2 = Integer.parseInt(scanner.nextLine());

        int [][] arr1 = new int[r1][c1];
        int [][] arr2 = new int[r2][c2];
        int [][] arr3 = new int[r1][c1];
        String a="a";
        String b="b";


        if(r1!=r2 && c1!=c2){
            System.out.println("Không thể thực hiện được, vui lòng nhập lại, số dòng mtA = số dòng mtB, số cột mtA = số cột mtB");
            System.out.println("Mời bạn nhập vào số dòng của ma trận A");
            r1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập vào so cột của ma trận A");
            c1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập vào số dòng của ma trận B");
            r2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập vào so cột của ma trận B");
            c2 = Integer.parseInt(scanner.nextLine());
            /*System.exit(0);*/
        }



//        Nhập ma trận A
        InputMatrix(arr1,r1,c1,a);
        System.out.println("Ma trận A:");
        // In ma trận A
        OutputMatrix(arr1,r1,c1);



        System.out.println("Mời bạn nhập vào giá trị ma trận B:");


        //Nhập ma trận B
        InputMatrix(arr2,r2,c2,b);
        System.out.println("Ma trận B:");
        // In ma trận B
        OutputMatrix(arr2,r2,c2);


        for(int i= 0;i<r1;i++){
            for(int j = 0; j<c1;j++){
                arr3[i][j]=arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Tổng của hai ma trận là");
        // In tổng 2 ma trận
        OutputMatrix(arr3,r1,c1);












    }
}
