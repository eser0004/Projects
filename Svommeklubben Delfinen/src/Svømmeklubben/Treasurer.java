package Svømmeklubben;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Treasurer {
    private List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public void calculateAnnualMembership() {
        for (Member member : members) {
            double baseFee;

            if (member.getMembershipType().equals("active")) {
                baseFee = (member.getAge() < 18) ? 1000 : 1600;

                if (member.getAge() >= 60) {
                    baseFee *= 0.75;
                }
            } else {
                baseFee = 500;
            }
            System.out.println("Annual membership fee for " + member.getName() + ": " + baseFee + " DKK");
        }
    }
    public void applyDiscountForSeniors() {
        for (Member member : members) {
            if (member.getAge() >= 60) {
                double discountedFee = 0.75 * calculateBaseFee(member);
                System.out.println("Discounted fee for senior member over 60 " + member.getName() + ": " + discountedFee + " DKK");
            }
        }
    }
    private double calculateBaseFee(Member member) {
        return (member.getMembershipType().equals("active") && member.getAge() >= 18) ? 1600 : 500;
    }
}