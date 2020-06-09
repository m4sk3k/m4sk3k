import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2_2_var2 {
    public static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        try{
            fillArr();
        }catch (InputMismatchException e){
            System.out.println("Вы ввели не целое число: " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Такого столбца нет: " + e);
        }
    }
    public static void fillArr(){
        System.out.println("Введите кол-во строк: ");
        int x = sc.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        int y = sc.nextInt();
        int[][] arr = new int[x][y];
        for(int i  = 0;  i < x; i++){
            for(int j  = 0;  j < y; j++){
                arr[i][j] = (int)(Math.random()*10);
                System.out.print("["+arr[i][j] + "] ");
            }
            System.out.println();
        }
        str(arr);
    }
    public static void str(int[][] arr){
        System.out.println("Какой столбец вывести?");
        int k = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            System.out.println("["+arr[i][k-1]+"]");
        }
    }
}

