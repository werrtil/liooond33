public class Main {
    public static void main(String[] args) {
        System.out.println(gagdd(20, 30));
        System.out.println(gagdd(13, 6));
        System.out.println(gagdd(42, 32));
        System.out.println(gagdd(21, 7));
        System.out.println(gagdd(13, 17));


    }

    public static String gagdd(int age, int temperatyra) {
        if (age <= 20 && temperatyra >= -20 && temperatyra <= 30) {
            return "ostovaites doma";
        }
        else if (age < 45 && temperatyra > -10 && temperatyra <= 25) {
            return "mojno idti gylat";
        }
        else if (age > 45 && temperatyra >= -10 && temperatyra <= 20) {
            return "mojno idti gylat";
        }
        else{
            return "ostovaites doma";
        }
    }
}






