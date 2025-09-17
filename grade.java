public class grade{
    public static void main(String[] args) {
        int marks=90;
        String grade=(marks>=90)?"A":
                     (marks>=75)?"B":
                     (marks>-50)?"C":"F";
        System.out.println("grade:"+grade);
    }
}