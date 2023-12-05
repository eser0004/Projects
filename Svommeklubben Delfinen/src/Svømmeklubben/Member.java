package Svømmeklubben;

import java.util.Scanner;

class Member {
    private String name;
    private int age;
    private String membershipType;
    private String swimmerCategory;
    private String swimmerType;

    public Member(String name, int age, String membershipType, String swimmerCategory, String swimmerType) {
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
        this.swimmerCategory = swimmerCategory;
        this.swimmerType = swimmerType;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getMembershipType() {
        return membershipType;
    }

    public String getSwimmerCategory() {
        return swimmerCategory;
    }

    public String getSwimmerType() {
        return swimmerType;
    }
}
