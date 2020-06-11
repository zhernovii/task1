import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print((char)27+"[30m");
        Scanner sc = new Scanner(System.in);
        int positiveTrying = 33;
        int negativeTrying = 5;
        List<String> wrongAnswers = new ArrayList<String>();

        for (int p = 0, n = 0; p < positiveTrying && n < negativeTrying; ) {
            int num1 = (int) (Math.random() * 6 + 4);
            int num2 = (int) (Math.random() * 6 + 4);
            System.out.print(num1 + " * " + num2 + " = ");
            int result = num1 * num2;
            int yourResult = sc.nextInt();
            if (yourResult == result) {
                System.out.print((char) 27 + "[32m вірно");
                p++;
            } else {
                System.out.print((char) 27 + "[31m не вірно" + (char) 27 + "[32m (" + result + ")");
                wrongAnswers.add(num1 + " * " + num2 + " = " + result + (char) 27 + "[31m (" + yourResult + ")" + (char) 27 + "[0m");
                n++;
            }
            System.out.println("\n" + (char) 27 + "[36m" + p + "/" + positiveTrying + ", " + (char) 27 + "[31m" + n + "/" + negativeTrying);
            System.out.println((char) 27 + "[39m");

            if (p == positiveTrying) {
                System.out.println((char) 27 + "[32mТИ ВИГРАВ!!");
                if (n > 0) {
                    System.out.println((char) 27 + "[0m\nАле попрацюй з цими прикладами");
                    for (String s : wrongAnswers) {
                        System.out.println(s);
                    }
                }
            }
            if (n == negativeTrying) {
                System.out.print((char) 27 + "[31m ти програв!!");
                if (n > 0) {
                    System.out.println((char) 27 + "[0m\nПопрацюй з цими прикладами");
                    for (String s : wrongAnswers) {
                        System.out.println(s);
                    }
                }
            }

        }
    }
}
