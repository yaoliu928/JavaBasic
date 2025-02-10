public class ArgsTest {
    public static void guessAge(int age){
        age--;
        System.out.println("in guessAge" +age);
    }

    public static void main(String[] args){
        int age=18;
        guessAge(age);
        System.out.println("in main" +age);
    }
}
