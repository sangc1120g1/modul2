package ThiTH;

import java.util.Scanner;

public class teacher implements Payroll {
    private String name;
    private String address;
    private String dateOfBirth;

    public teacher(){}

    public teacher(String name, String address, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public int payRoll() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input day");
        int day = Integer.parseInt(Sc.nextLine());
        System.out.println("Input luong/day");
        int luong = Sc.nextInt();
        System.out.println("Input thuong");
        int thuong = Sc.nextInt();
        System.out.println("Input phat");
        int phat = Sc.nextInt();
        return (day*luong+thuong-phat);
    }
}
