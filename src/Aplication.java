import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Goverman goverman = new Goverman();

        while (true){
            System.out.println("___________________________________________");
            menu();

            Scanner scanner = new Scanner(System.in);
            switch (scanner.next()){
                case "1":
                    goverman.addFraction();
                    break;
                case "2":
                    goverman.removeFraction();
                    break;
                case "3":
                    goverman.showAllFraction();
                    break;
                case "4":
                    goverman.clearSpicialFraction();
                    break;
                case "5":
                    goverman.showNeedFraction();
                    break;
                case "6":
                    goverman.AddDeputataSpecificFraction();
                    break;
                case "7":
                    goverman.DeletedFractionDeputata();
                    break;
                case "8":
                    goverman.ShowAllFractionBribers();
                    break;
            }
        }

    }
    public static void menu(){
        System.out.println("Введіть 1 щоб додати фракцію");
        System.out.println("Введіть 2 щоб видалити конкретну фракцію");
        System.out.println("Введіть 3 щоб вивести усі  фракції");
        System.out.println("Введіть 4 щоб очистити конкретну фракцію");
        System.out.println("Введіть 5 щоб вивести конкретну фракцію");
        System.out.println("Введіть 6 щоб додати депутата в фракцію");
        System.out.println("Введіть 7 щоб видалити депутата з фракції");
        System.out.println("Введіть 8 щоб вивести список хабарників");
    }
}
