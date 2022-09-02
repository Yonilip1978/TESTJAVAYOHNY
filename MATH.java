package TESTJAVAYOHNY;

public class MATH {

    public static void main(String []args) {

        for (int i = 1; i <= 400; i++) {

            if (i % 7 == 0 || i / 10 == 7)
                System.out.println(i + " Boom!");

            else
                System.out.println(i);


        }
    }
}



