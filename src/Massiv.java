import java.util.*;
public class Massiv {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива.");
        int size = s.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
            System.out.print("Полученный массив:");
                System.out.print(" " + array[i]);
                System.out.println();
            }
        }
    }

