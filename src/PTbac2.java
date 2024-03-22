import java.util.Scanner;

public class PTbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giai pt bac 2 co dang ax^+bx+c=0");

        System.out.println("Nhap a=");
        double a = scanner.nextDouble();

        System.out.println("Nhap b=");
        double b = scanner.nextDouble();

        System.out.println("Nhap c=");
        double c = scanner.nextDouble();

        System.out.println("Giai pt bac 2 : "+a+"^x+"+b+"x+"+c+" = 0");

        if(a==0){
            if(b==0){
                System.out.println("PT vo nghiem !");
            }else{
                System.out.println("Pt co 1 nghiem x=" + (-c/b));
            }
            return;
        }

        double delta = b*b - 4*a*c;
        double x1,x2;

        if(delta > 0){
            System.out.println("Pt co 2 nghiem:");
            x1 = (float)((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float)((-b - Math.sqrt(delta)) / (2*a));

            System.out.println("x1 = "+x1+"\nx2 = "+x2);
        } else if (delta ==0) {
            System.out.println("PT co nghiem kep:");
            x1 = (-b/(2*a));
            System.out.println("x = "+x1);
        }else{
            System.out.println("PT vo nghiem !");
        }

    }
}
