import java.util.Scanner;

class tes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        
        System.out.println("Enter a number:");
        String input = scn.nextLine();
        System.out.println("You entered: " + input);

        System.out.println("Enter an Integer number:");
        int num = scn.nextInt();
        System.out.println("You entered: " + num);
        
        System.out.print("Enter a Floating Number");
        float fnum = scn.nextFloat();
        System.out.println("The Floating Number is " + fnum);
        
        scn.close();

    }

}