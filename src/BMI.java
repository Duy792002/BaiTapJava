import java.util.Scanner;

public class BMI {
    public static void bmi(double h, double w){
        double bmi = w/Math.pow(h,2) ;
        System.out.println("Chi so BMI = "+bmi);

        if(bmi < 18.5){
            System.out.println("Thieu dinh duong !");
        }else if (bmi >= 18.5 && bmi <25){
            System.out.println("Binh thuong !");
        }else{
            System.out.println("Beo phi thua can !");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chi so BMI: \n < 18.5 Thieu dinh duong \n 18.5->25 Binh Thuong \n > 25 Beo phi");

        System.out.println("Nhap chieu cao (m):");
        double h = scanner.nextDouble();

        System.out.println("Nhap can nang (kg):");
        double w = scanner.nextDouble();

        bmi(h,w);
    }

}
