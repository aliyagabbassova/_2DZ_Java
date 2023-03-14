package org.example;

public class Main {

    public static void main(String[] args) {

        String str1 = "Java = ";
        String str2 = "Hello";
        int num1 = 3;
        int num2 = 56;
        StringBuilder str3 = new StringBuilder();
        word(str1, str2);
        changeover(num1, num2);
        changesign();
        replace(str1);

        System.out.println();
        System.out.println("Содержит ли строка все символы второй строки?: " + str1.contains(str2));
        }
         //2.	Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
// (вхождение в обратном порядке).
        public static boolean word (String str1, String str2) {
            boolean isRotation = false;

            if (str1.length() == str2.length()) {
                String concat = str1 + str1;
                if (concat.indexOf(str2) != -1) {
                    isRotation = true;

                }
            }

            System.out.println("Являются ли строки вращением друг друга: " + isRotation);

            return isRotation;
        }


        //4.	Дано два числа, например 3 и 56, необходимо составить следующие строки:
        // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        public static void changeover(int num1, int num2) {
            StringBuilder sb = new StringBuilder();
            sb.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n")
                    .append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n")
                    .append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
            System.out.println();
            System.out.println(sb.toString());
        }

        //5. Замените символ “=” на слово “равно”.
        // Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

        public static void changesign () {
            StringBuilder str3 = new StringBuilder("GB = good company...");
            System.out.println();
            System.out.println(str3);
            str3.insert(str3.length() / 4, " равно ");
            str3.deleteCharAt(3);
            System.out.println(str3);
        }

        //6.	*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        public static void replace (String str1) {

            StringBuilder sb = new StringBuilder("a = b");

            System.out.println(sb.replace(sb.indexOf("="), sb.indexOf("=") + 1, "равно"));
        }
    }


