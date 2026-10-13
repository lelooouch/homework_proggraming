import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class pract_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 задание
        int n = scanner.nextInt();
        int[] A_1 = new int[n];

        for (int i = 0; i < n; i++) {
            A_1[i] = i;
        }
        System.out.println(Arrays.toString(A_1));

        int i = 0;
        int j = n - 1;
        int m_1 = 0;
        int m_2 = 0;
        while (i < n & j > 0) {
            if (m_1 == 2) {
                m_1 = 0;
                System.out.println("--------");
                while (m_2 < 2) {
                    System.out.println(A_1[j]);
                    j--;
                    m_2++;
                }
                m_2 = 0;
                System.out.println("--------");
            }
            System.out.println(A_1[i]);
            i++;
            m_1++;
        }
        // 2 задание
        int n_2 = scanner.nextInt();
        int[] int_arr = new int[n_2];
        Map<Integer, Integer> count_num = new HashMap<>();

        for (int i_2 = 0; i_2 < n_2; i_2++){
            int_arr[i_2] = (int) (Math.random() * 100);
            System.out.print(int_arr[i_2] + " ");
        }
        int count_n = 0;
        for (int j_2 = 0; j_2 < n_2; j_2++) {
            if (!count_num.containsKey(int_arr[j_2])) {
                for (int k = 0; k < n_2; k++) {
                    if (int_arr[j_2] == int_arr[k]) {
                        count_n++;
                    }
                }
                count_num.put(int_arr[j_2], count_n);
                count_n = 0;
            }
        }
        System.out.println(count_num);

        // 3 задание
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};

        System.out.println("До обмена:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));

        swapArrays(A, B);

        System.out.println("После обмена:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));

        // 4 задание

        int N_4 = scanner.nextInt();
        int M_4 = scanner.nextInt();

        int[][] arr_4 = new int[M_4][N_4];

        for (int i_4 = 0; i_4 < M_4; i_4++) {
            for (int j_4 = 0; j_4 < N_4; j_4++) {
                arr_4[i_4][j_4] = (j_4 + 1) * 5;
            }
        }

        System.out.println(Arrays.deepToString(arr_4));


        // 5 задание

        float weight;
        float height;
        float result_5;
        boolean flagg = true;
        int target = 0;
        float[][] bd = new float[5][3];
        while (flagg) {
            System.out.println("Выберите дествие:\n1. Информация о разработчике.\n2. Информация о программе.\n3. Программа.\n4.Посмотреть прошлые записи.\n5. Выход.");
            int num_for_choose = scanner.nextInt();
            switch (num_for_choose) {
                case 1:
                    System.out.println("Мария Башурова, РИ-250931");
                    break;
                case 2:
                    System.out.println("Программа определит площадь тела.");
                    break;
                case 3:
                    while (true) {
                        System.out.println("Введите ваш вес для рассчета поверхности тела: ");

                        if (scanner.hasNextFloat()) {
                            weight = scanner.nextFloat();

                            if (weight > 0) {
                                break;
                            } else {
                                System.out.println("Вес должен быть больше 0.");
                            }
                        } else {
                            System.out.println("Неверный тип данных.");
                            scanner.next();
                        }
                    }

                    while (true) {
                        System.out.println("Введите ваш рост для рассчета поверхности тела: ");

                        if (scanner.hasNextFloat()) {
                            height = scanner.nextFloat();

                            if (height > 0) {
                                break;
                            } else {
                                System.out.println("Рост должен быть больше 0.");
                            }
                        } else {
                            System.out.println("Неверный тип данных.");
                            scanner.next();
                        }
                    }

                    System.out.printf("Ваша площадь поверхности тела %.2f м^2", num_5(weight, height));
                    result_5 = num_5(weight, height);

                    for (int i_5_2 = 0; i_5_2 < 6; i_5_2++) {
                        if (i_5_2 == 5) {
                            bd[target][0] = weight;
                            bd[target][1] = height;
                            bd[target][2] = result_5;
                            target++;
                            if (target == 5){
                                target = 0;
                            }
                        } else if (bd[i_5_2][0] == 0.0) {
                            bd[i_5_2][0] = weight;
                            bd[i_5_2][1] = height;
                            bd[i_5_2][2] = result_5;
                            break;
                        }
                    }
                    break;
                case 4:
                    for (int i_5 = 0; i_5 < 5; i_5++){
                        if (bd[i_5][0] == 0.0) {
                            break;
                        }
                        System.out.printf("Вес: %.2f кг, рост: %.2f см, площадь: %.2f м^2\n", bd[i_5][0], bd[i_5][1], bd[i_5][2]);
                    }
                    break;
                case 5:
                    flagg = false;
                    break;
                default:
                    System.out.println("Введенны неправильные данные");
            }
        }
    }

    // 3 задание
    public static void swapArrays ( int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
    }
    // 5 задание
    public static float num_5(float weight, float height) {
        float result = (float) (sqrt(weight*height / 3600));
        return result;
    }
}