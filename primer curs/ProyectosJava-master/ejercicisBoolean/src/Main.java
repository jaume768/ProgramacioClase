public class Main {

    public static void main(String[] args) {
	    //Write a program which tests whether x is greater than 5 and y is less than 7. (Note: x, y and any other variables in
        //this and subsequent exercises in this chapter are of type int; however you can use any mixture of numerical primitives that you prefer).
        //Test the program with the following combinations of x and y respectively and print the result out after each test:
        //(1,1), (6,5) and (4,5).

        boolean result;
        int x;
        int y;

        x = 1; y = 1; result = ((x > 5) && (y < 7)); System.out.println(result);
        x = 6; y = 5; result = ((x > 5) && (y < 7)); System.out.println(result);
        x = 4; y = 5; result = ((x > 5) && (y < 7)); System.out.println(result);
    }
}
