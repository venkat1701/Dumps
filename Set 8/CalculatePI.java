import java.util.Scanner;
        public class CalculatePI {

            public static void main(String[] args) {
                // Create a Scanner object
                Scanner input = new Scanner (System.in);

                // Prompt the user to enter input
                System.out.println("Enter number of terms");
                double i = input.nextDouble(); // value of i user entered
                    double sum = 0;
                for(i=0; i<10000; i++){
                           if(i%2 == 0) // if the remainder of `i/2` is 0
                           sum += -1 / ( 2 * i - 1);
                        else
                           sum += 1 / (2 * i - 1);
    }

                        System.out.println(sum);


    }
}