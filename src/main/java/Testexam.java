import java.util.Scanner;


    public class Testexam {

        static  void Multiples(){
            int X;
            int A;
            //Reading the X and A value in run time
            Scanner SC = new Scanner(System.in);
            System.out.println(" Enter X value");
            X = SC.nextInt();
            System.out.println(" Enter A value");
            A = SC.nextInt();

            int num;
            int i =1;
            int j =1;


            for(int k =1; k<=X*3;k++)
            {
                while( j <= X * 2)
                {
                    while (i <= X)
                    {
                        num = A * i;
                        if (num > X)
                        {
                            System.out.println("---------- Multiples A until X Completed ---------");
                            break;
                        }

                        System.out.println("Multiples of "+ A + " * " + i + " = " + num);
                        i++;
                    }
                    i = X + 1;
                    num = (A + 1) * j;
                    if (num > X * 2)
                    {
                        System.out.println("---------- Multiples A+1, 2x is Completed---------");
                        break;
                    }
                    System.out.println("Multiples of "+ (A+1) + " * " + j + " = " + num);
                    j++;
                }
                j = (X *2) + 1;
                num = (A + 2) * k;
                if (num > X * 3) {
                    System.out.println("---------- Multiples of A+2 until 3X is Completed---------");
                    break;
                }
                System.out.println("Multiples of "+ (A+2) + " * " + k + " = " + num);
            }

        }

        public static void main(String[] args) {

            Multiples();

        }


    }

