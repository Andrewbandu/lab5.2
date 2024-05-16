public class Lab {
    public static void main(String[] args) {
        int katet1 = 3;
        int katet2 = 4;
        System.out.println(" катет1 " + katet1 + " катет2 " + katet2);
        double hipotenuse = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
        System.out.println(" гіпотенуза :  " + hipotenuse);
        double P = katet1 + katet2 + hipotenuse; //периметр
        System.out.println("Периметр " + P);

        double S = (katet1 * katet2) / 2;
        System.out.println("Площа " + S);


    }
}
