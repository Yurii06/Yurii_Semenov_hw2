public class Main {
    public static int generateRandomAge () {
        int result = 0 + (int) (Math.random() * 101);
        return result;
    }
    public static String ageAndTemperature ( int age, int temperature) {
        String result;
        if (age >= 25 && age <= 45 && temperature >= -25 && temperature <= 30) {
            result = "можно идти гулять";
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            result = "можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            result = "можно идти гулять";
        } else {
            result = "оставайтесь дома";
        }
        return result;


    }
    public static void main(String[] args) {
        System.out.println(ageAndTemperature( 25, 18));
        System.out.println(ageAndTemperature(43, 27));
        System.out.println(ageAndTemperature(17 , 70));
        System.out.println(ageAndTemperature(8, 13));
        System.out.println(ageAndTemperature(70,-12));
        System.out.println(ageAndTemperature(generateRandomAge(),10));


    }

}