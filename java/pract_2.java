import java.util.Scanner;

import static java.lang.Math.*;

public class pract_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 задание

        System.out.print("Введите число: ");
        int N = scanner.nextInt();

        double sum = 0.0;

        for (int i = 2; i <= N; i++) {
            sum += 1.0 / Math.log(i);
        }

        System.out.println("Сумма равна: " + sum);

        // 2 задание
        double x = scanner.nextDouble();
        int n_2 = scanner.nextInt();

        double sum_2 = 0.0;

        for (int k = 0; k <= n_2; k++) {
            double term = Math.pow(-1, k) * Math.pow(x, 2 * k + 1) / (2 * k + 1);
            sum_2 += term;
        }
        System.out.println("Сумма равна: " + sum_2);

        // 3  задание

        int n_3 = scanner.nextInt();
        boolean ans = false;
        int n_3_str = String.valueOf(n_3).length();
        int ost;
        do {
            ost = n_3 / (int)pow(10, n_3_str - 1);
            if (ost % 2 == 1) {
                ans = true;
                break;
            }
            n_3_str -= 1;
        } while (n_3_str >= 1);
        System.out.println(ans);

        // 4 задание
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        sr(a, b);

        // 5 задание

        float weight;
        float height;
        boolean flagg = true;
        while (flagg) {
            System.out.println("Выберите дествие:\n1. Информация о разработчике.\n2. Информация о программе.\n3. Программа.\n4. Выход.");

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
                    break;
                case 4:
                    flagg = false;
                    break;
                default:
                    System.out.println("Введенны неправильные данные");
            }
        }
    }

    // 4 задание
    public static void sr(int a, int b) {
        double sr_arif = (a + b) / 2.0;
        double sr_geom = sqrt(a*b);
        System.out.println(sr_arif + " " + sr_geom);
    }

    // 5 задание
    public static double num_5(float weight, float height) {
        double result = (sqrt(weight*height / 3600));
        return result;
    }
}
