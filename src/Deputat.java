import java.util.Scanner;

public class Deputat {
    private String firstName;
    private String secondName;
    private boolean briber = false;
    private int bribeSize;

    public Deputat(String firstName, String secondName, boolean briber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.briber = briber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public boolean isBriber() {
        return briber;
    }

    public void setBriber(boolean briber) {
        this.briber = briber;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    public void setBribeSize(int bribeSize) {
        this.bribeSize = bribeSize;
    }

    public void giveBribe() {
        if (briber == false) {
            System.out.println("цей депутат не бере хабарів");
        } else {
            Scanner scanner = new Scanner(System.in);
            int bribe = scanner.nextInt();

            if (bribe > 5000) {
                bribeSize = bribe;
                System.out.println("Поліція увязнить депутата");
            } else {
                System.out.println(bribe);
            }
        }
    }




    @Override
    public String toString() {
        return "Deputat{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", briber=" + briber +
                ", bribeSize=" + bribeSize +
                '}';
    }
}
