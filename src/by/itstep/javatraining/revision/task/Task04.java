package by.itstep.javatraining.revision.task;

/*	Task 04. Ordering Numbers [упорядочивание чисел]
 *
 *	Даны три числа. Упорядочите их в порядке неубывания.
 *
 *	Формат входных данных [input]
 *	На вход даётся три числа в диапазоне целочисленного типа int.
 *
 *	Формат выходных данных
 *	Возвратите в виде строки три числа, которые упорядочены в порядке неубывания.
 *	Числа в строке должны быть разделены друг от друга одним пробелом.
 *
 *	[ input 1]: 7 6 1
 *	[output 1]: 1 6 7
 *
 *	[ input 2]: 6 7 2
 *	[output 2]: 2 6 7
 *
 *	[ input 3]: 7 4 7
 *	[output 3]: 4 7 7
 */

public class Task04 {
    public static String task04(int a, int b, int c) {
        int min = a;
        int middle = b;
        int max = c;
        String result = "";

//        if (a >= b) {
//            if (a >= c) {
//                max = a;
//                min = c;
//                if (c >= b) {
//                    middle = c;
//                    min = b;
//                }
//            } else {
//                middle = a;
//                min = b;
//            }
//        } else if (a >= c) {
//            middle = a;
//            max = b;
//            min = c;
//        } else if (b >= c) {
//            middle = c;
//            max = b;
//        }

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= c) {
            max = b;
        }

        if (b <= a && b <= c) {
            min = b;
        } else if (c < a) {
            min = c;
        }

        if (min == b && max == a || min == a && max == b) {
            middle = c;
        } else if (min == c && max == b || min == b && max == c) {
            middle = a;
        }

        result = min + " " + middle + " " + max;
        return result;
    }
}
