
package MangoTree;

import java.util.Scanner;

class mangoTreeFinder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int find = scanner.nextInt();
        scanner.close();
        if(find >=1 && find<=row || find%column==0 || find%column==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
