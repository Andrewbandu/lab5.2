public class lab1 {
    public static void main(String[] args){
        int randomNumber =(int) (Math.random()*101);//  генерує випадкове число з проміжку [-20;20]

        System.out.println("випадкове число: " + randomNumber);

        int num = (int)(Math.log10(randomNumber)+1);//визначення кількості цифр

        System.out.println("кількість цифр " + num);
    }
}
