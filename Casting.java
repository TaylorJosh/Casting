public class Casting {
    public static void main(String[] args) throws Exception {
       
        //Casting Part 1: double -> int
       double num = 112.35;
       System.out.println("double: " + num);

       int numInt = (int)num;
       System.out.println("int: " + numInt);


       //Casting Part 2: string -> int
       String stringNum = "49";
       System.out.println("string: " + stringNum);

       int stringNumInt = Integer.parseInt(stringNum);
       System.out.println("int: " + stringNumInt);



    }
}
