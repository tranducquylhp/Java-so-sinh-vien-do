import java.util.Scanner;

public class DemSoSinhVienDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Nhap so sinh vien: ");
            n = scanner.nextInt();
            if (n>30){
                System.out.println("So luong sinh vien khong duoc vuot qua 30");
            }
        } while (n>30);

        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Nhap so diem cua sinh vien thu "+i+" la: ");
            arr[i] = scanner.nextInt();
        }

        int count =0;
        for (int i=0; i<n; i++){
            if (arr[i]>=5 && arr[i]<=10){
                count++;
            }
        }
        System.out.println();
        System.out.println("So sinh vien do la: "+count);
    }
}
