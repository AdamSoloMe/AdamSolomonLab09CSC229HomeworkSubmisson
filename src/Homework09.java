public class Homework09 {
        // ToDo 01:  Write an algorithm to solve the following problem
    /*
     . So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over one hundred divisors?

    */


        /* this function returns the nth triangle number which is the sum of all the natural numbers less than, or equal to, n */
        public static int triangleNumber(int n) {
            int sum = 0;
            for (int i = 0; i <= n; i++)
                sum += i;
            return sum;
        }

        public static void main(String[] args) {


            int j = 0; // j represents the jth triangle number so for example the 7th triangle number is 28  the 8th triangle numbers is 36 etc
            int n = 0; // n represents the triangle number corresponding to j, so if J is 8 n equals 36  if j is 7 n equals 28
            int numberOfDivisors = 0; // this is number of divisors for each triangle number n

            while (numberOfDivisors <= 100) {//this while loop will run until the number of divisors of the triangle number is 100


                // and also] sets n to be the next triangle number
                numberOfDivisors = 0;// this line of code resets the numberOfDivisors each time it has finished calculating the number of divisors for each triangle number
                System.out.println("this is what number of divisors is reset to for next triangle number "+numberOfDivisors);
                System.out.println();
                // because it's checking a new triangle number each time the loop iterates
                j++;//here the jth triangle number is iterating up by 1
                System.out.println("this is "+j+"th triangle number");
                n = triangleNumber(j);//so here n will be the triangle number associated with j
                System.out.println("The Triangle number is : " + n);


                // for every number from 1 to the triangle number,
                // count the number of divisors
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0)//this if else statement checks if i is a divisor of the triangle number
                        numberOfDivisors++;

                }
                System.out.println("this is the number of divisors is for this triangle number "+numberOfDivisors);



            }
            System.out.println(" ");

            System.out.println("The First Triangle number with over 100 divisors is:"+n);//the Answer is 73920
        }
    }


