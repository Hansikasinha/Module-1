public class nested{
    public static void main(String[] args) {
        int marks=87;
        if(marks>=50){
            System.out.println("you passed");
            if (marks>=90){
                System.out.println("A+");
            }
            else if(marks>=75){
                System.out.println("A");
            }
            else{
                  System.out.println("B");
            }
        }
        else{
            System.out.println("failed");
        }
    }
}