package Baitap3;

public class customer {
    private String name;
    private String DateOfBirth;
    private int identityCard;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public customer(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public customer(String name, String dateOfBirth, int identityCard, String address) {
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.identityCard = identityCard;
        this.address = address;
    }

    @Override
    public String toString() {
        return "customer{" +
                "name='" + name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", identityCard=" + identityCard +
                '}';
    }
}
