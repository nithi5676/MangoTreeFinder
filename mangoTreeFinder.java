
package MangoTree;

import java.util.Scanner;

class mangoTreeFinder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int find = scanner.nextInt();
        scanner.close();
        int temp = column;
        int multiply = row * column;
        multiply -= column;
        boolean check = false;
        if (find <= column) {
            check = true;
        }
        for (int j = 1; j < row; j++) {
            temp += j;
            if (temp == find) {
                check = true;
                break;
            }
            if (find > multiply && find <= multiply + column) {
                check = true;
            }
        }
        if (check) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
