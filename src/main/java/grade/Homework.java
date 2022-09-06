package grade;

public class Homework {
    public static void main(String[] args) {
        int grade =0 + (int) (Math.random() *100);
        System.out.println("Grade: " + grade);
        if (grade>=90) {
            System.out.println("You got an A");
        }else if (grade>=80){
        System.out.println("you got a B");
        }else if (grade>=70){
            System.out.println("you got a c");
        }else if (grade>=60){
            System.out.println("you got a D");
        }else{
            System.out.println("You got an F");
        }
    }
}

