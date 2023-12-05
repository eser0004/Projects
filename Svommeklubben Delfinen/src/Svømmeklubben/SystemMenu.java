package Svømmeklubben;

import java.util.Scanner;

public class SystemMenu {
    public static void main(String[] args) {
        MembershipSystem membershipSystem = new MembershipSystem();
        Treasurer treasurer = new Treasurer();
        Scanner scanner = new Scanner(System.in);
        Member newMember = membershipSystem.createMember();
        Treasurer newTreasurer = treasurer.createTreasurer();
        while (true) {
            System.out.println("menu:");
            System.out.println("1. Opret ny medlem");
            System.out.println("2. Oversigt over medlemer");
            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    membershipSystem.displayMemberInfo(newMember);
                    break;
                case 2:
                treasurer.calculateAnnualMembership(treasurer);
                break;
            }
        }
    }
}
