package Svømmeklubben;

import java.util.Scanner;

class MembershipSystem {
    public Member createMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        System.out.print("Enter member age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter membership type (active/passive): ");
        String membershipType = scanner.nextLine().toLowerCase();
        System.out.print("Enter swimmer category (junior/senior): ");
        String swimmerCategory = scanner.nextLine().toLowerCase();
        System.out.println("Enter SwimmerType (motionist/konkurrencesvømmer");
        String swimmerType = scanner.nextLine().toLowerCase();

        return new Member(name, age, membershipType, swimmerCategory, swimmerType);
    }

    public void displayMemberInfo(Member member) {
        System.out.println("\nMember Information:");
        System.out.println("Name: " + member.getName());
        System.out.println("Age: " + member.getAge());
        System.out.println("Membership Type: " + member.getMembershipType());
        System.out.println("Swimmer Category: " + member.getSwimmerCategory());
        System.out.println("Swimmer type: "+ member.getSwimmerType()+"\n");
    }
}