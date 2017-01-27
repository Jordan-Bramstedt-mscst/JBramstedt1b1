import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
        System.out.println("p123 #1:");
        String myName = "Jordan Bramstedt";
        int age = 19;
        double annualpay = 10000.0;
        
        System.out.println("My name is " + myName + ", my age is " + age + " and");
        System.out.print("I hope to earn $" + annualpay + " per year.\n");
        
        System.out.println("\np123 #3:");
        String name = "Jordan Bramstedt";
        String address1 = "1120 south park st";
        String city = "Red Wing";
        String state = "MN";
        int zip = 55066;
        String phone = "507-848-7412";
        String major = "Computer Programming and Web Development AAS";
        
        System.out.println(name + "\n" + address1 + "\n" + city + "\n" + state + "\n" + zip + "\n" + phone + "\n" + major);
        
        System.out.println("\np124 #5:");
        int cookiesEaten;
        int caloriesPerserving = 300;
        int servingPerbag = 10;
        int cookiesPerbag = 40;
        int Totalcalories;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many cookies did you eat? ");
        cookiesEaten = keyboard.nextInt();
        Totalcalories = servingPerbag * caloriesPerserving;
        Totalcalories = Totalcalories / cookiesPerbag;
        Totalcalories = Totalcalories * cookiesEaten;
        System.out.println("Calories consummed = " + Totalcalories);
        
   
        System.out.println("\np124 #6:");
        double Percent = 0.65;
        double Sales = 8300000;
        double Predict;
        
        Predict = Percent * Sales;
        
        System.out.println("East Coast sales: $" + Predict);
        
        
	}

}
