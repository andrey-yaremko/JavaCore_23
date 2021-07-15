import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;
import java.util.stream.Collectors;

public class Fraction {

    List<Deputat> deputatu = new ArrayList<>();
    private String nameFraction;

    public String getNameFraction() {
        return nameFraction;
    }

    public Fraction(String nameFraction) {
        this.nameFraction = nameFraction;
    }

    public void addDeputata() {
        System.out.println("ВВедіть імя депутата");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        System.out.println("ВВедіть фамілію депутата");
        String secondName = scanner.nextLine();

        System.out.println("ВВедіть чи депутат бере взятки: true/false");
        Boolean briber = scanner.nextBoolean();

        deputatu.add(new Deputat(firstName, secondName, briber));

    }

    public void deletedDeputata() {
        System.out.println("ВВедіть імя депутата якого хочете видалити");
        Scanner scanner = new Scanner(System.in);
        String nameDeputata = scanner.nextLine();

        for (Deputat d : deputatu) {
            if (nameDeputata.equals(d.getFirstName())) {
                System.out.println("ВВедіть фамілію депутата");
                String secondDeputata = scanner.nextLine();
                if (secondDeputata.equals(d.getSecondName())) {
                    deputatu.remove(d);
                    System.out.println("Депутат з імям " + nameDeputata + " " + secondDeputata + " видалено");
                } else {
                    System.out.println("Депутата з такою фамілією не існує");
                }
            } else {
                System.out.println("Депутата з таким іменем не існує");
            }
            break;
        }
    }

    public void showBribers() {
//        for (Deputat d : deputatu) {
//            if (d.isBriber()) {
//                System.out.println("Депутати які беруть взятки - " + d);
//            }
//            else {
//                System.out.println("В фракції немає депутатів які беруть взятки");
//            }
//        }
        deputatu.stream().filter(Deputat::isBriber).peek(run -> System.out.println(run)).collect(Collectors.toList());
    }

    public void showSomeBriber() {
        for (Deputat d : deputatu) {
            if (d.isBriber()) {
                for (Deputat c : deputatu) {
                    if (c.getBribeSize() < d.getBribeSize()) {
                        System.out.println(d);
                    }
                }
            }
        }
    }

    public void showAllDeputat() {
        deputatu.stream().peek(run -> System.out.println(run)).collect(Collectors.toList());
    }

    public void deletedAllDeputat() {
        deputatu.clear();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "deputatu=" + deputatu +
                ", nameFraction='" + nameFraction + '\'' +
                '}';
    }
}
