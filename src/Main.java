public class Main {
    public static void main(String[] args) {
        double[] numbers = {0.5, 1.25, 3.75, -0.8, 2.33, -4.6, 0.125, -7.9, 1.5, -2.4, 6.67, -0.35, 9.2, -5.5, 0.9};
        double suma = 0;
        int kolvo = 0;
        boolean proverka = false;
        for (double num: numbers){
            if (num <0){
                proverka = true;
            } else if (proverka) {
                suma += num;
                kolvo ++;
            }
        }
        System.out.println(suma/kolvo);
    }
}