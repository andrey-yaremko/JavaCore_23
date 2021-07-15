import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Goverman {

    List<Fraction> fractions = new ArrayList<>();
    public void ddd(){

    }

    public void addFraction() {
        System.out.println("Введіть назву фракції");
        Scanner scanner = new Scanner(System.in);
        String nameFraction = scanner.nextLine();

        fractions.add(new Fraction(nameFraction));
        System.out.println(fractions);
    }

    public void removeFraction() {
        System.out.println("Введіть індекс фракції яку хочете видалити");
        Scanner scanner = new Scanner(System.in);
        int fract = scanner.nextInt();
        fractions.remove(fract);
    }
    public void showAllFraction(){
        System.out.println("Список всіх фракцій");
        for (Fraction f:fractions){
            System.out.println(f);
        }
    }

    public void clearSpicialFraction(){
        System.out.println("Введіть індекс фракції");
        Scanner scanner = new Scanner(System.in);
        int indexFraction = scanner.nextInt();
        fractions.get(indexFraction).deletedAllDeputat();
    }

    public void showNeedFraction(){
        System.out.println("Введіть індекс фракції");
        Scanner scanner = new Scanner(System.in);
        int indexFraction = scanner.nextInt();
        System.out.println("Список депутатів фракції");
        fractions.get(indexFraction).showAllDeputat();
    }

    public void AddDeputataSpecificFraction(){
        System.out.println("Введіть індекс фракції");
        Scanner scanner = new Scanner(System.in);
        int indexxFraction = scanner.nextInt();
        fractions.get(indexxFraction).addDeputata();
    }

    public void DeletedFractionDeputata(){
        System.out.println("ВВедіть індекс фракції");
        Scanner scanner = new Scanner(System.in);
        int indexFraction = scanner.nextInt();
        fractions.get(indexFraction).deletedDeputata();
    }

    public void ShowAllFractionBribers(){
        System.out.println("ВВедіть індекс фракції");
        Scanner scanner = new Scanner(System.in);
        int indexFraction = scanner.nextInt();
        fractions.get(indexFraction).showBribers();
    }

    public void ShowTopFractionBriber(){
        System.out.println("ВВедіть індекс фракції");
        Scanner scanner = new Scanner(System.in);
        int indexFraction = scanner.nextInt();
        fractions.get(indexFraction).showSomeBriber();
    }


    @Override
    public String toString() {
        return "Goverman{" +
                "fractions=" + fractions +
                '}';
    }
}
