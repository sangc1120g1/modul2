package Baitap3;

import java.util.ArrayList;
import java.util.Scanner;

public class Method {
    ArrayList<customer> customerArrayList = new ArrayList<>();

    public boolean add(customer customer) {
        boolean status = false;
        customerArrayList.add(customer);
        return status;
    }

    public boolean delete(int identity) {
        boolean status = false;
        for (int i = 0; i < customerArrayList.size(); i++) {
            if (customerArrayList.get(i).getIdentityCard() == identity) {
                customerArrayList.remove(i);
                status = true;
                break;
            }
        }
        return status;
    }

    public void update(int identity) {

    }

    public customer search(int identity) {
        customer customer = new customer();
        for (Baitap3.customer value : customerArrayList) {
            if (value.getIdentityCard() == identity) {
                customer = value;
            }
        }
        return customer;
    }

    public int pay(int identity) {
        receipt receipt = new receipt();
        receipt.setNewElectricNumber(new Scanner(System.in).nextInt());
        receipt.setOldElectricNumber(new Scanner(System.in).nextInt());
        return (receipt.getNewElectricNumber()- receipt.getOldElectricNumber())*12000;
    }
}
