public class ORConditionalExpression {
    public static void main(String args[]){
        double grade = 4.0;
        if (grade == 4.0) {
            System.out.println("You are an awesome student");
        } else if (grade >= 3.5 && grade< 4.0) {
        System.out.println("You are an A grade Student.");
        } else if (grade >= 3.0 && grade< 3.5) {
            System.out.println("You are an average Student.");
        }
    }
}
