public class ArgsTest {
    public static void guessAge(int age) {
        age--;
        System.out.println("in guessAge" + age);
    }

    public static void guessAge(Args args1) {
       args1.setAge(24);
        System.out.println("in guessAge" + args1.getAge());
    }

    public static void main(String[] args) {
        Args args1 = new Args(18);
        System.out.println("args1" + args1);

        guessAge(args1);
        System.out.println("in main" + args1.getAge());
    }
}
