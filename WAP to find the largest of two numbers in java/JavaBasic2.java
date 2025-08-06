import java.util.*;
public class JavaBasic2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value A : ");
        int A = sc.nextInt();
        System.out.print("Enter value B : ");
        int B = sc.nextInt();
        if(A>=B) {
            System.out.println("A is largest of 2");
        } else {
            System.out.println("B is largest of 2");
        }
    }    
}
