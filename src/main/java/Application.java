import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ManyPeople people = new ManyPeople();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("========ATM 프로그램=======");
            System.out.println("1.입금버튼을 누르셨습니다.");
            System.out.println("2.출금버튼을 누르셨습니다.");
            System.out.println("3.카드를 넣어주세요.");
            System.out.println("4.이미 삽입된 카드가 있습니다.");
            int no=sc.nextInt();

            switch (no) {
                case 1:people.deposit(); break;
                case 2:people.withdraw(); break;
                case 3:people.plug(); break;
                case 4:people.exist(); break;

            }if (no==4) {
                break;
            }
        }
    }
}
