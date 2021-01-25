package ThiTH;

import java.util.ArrayList;
import java.util.Scanner;

public class officers {

    ArrayList<teacher> teacherArrayList = new ArrayList<>();

    public boolean add(teacher Teacher) {
        teacherArrayList.add(Teacher);
        return true;
    }

    public teacher remove() throws Exception {
        if (isNull()) {
            throw new Exception("Not a Teacher");
        } else {
            return teacherArrayList.remove(0);
        }
    }

    public teacher remove(String name) throws Exception {
        teacher Teacher = new teacher();
        if (isNull()) {
            throw new Exception("Not a Teacher");
        } else {
            for (int i = 0; i < teacherArrayList.size(); i++) {
                if (teacherArrayList.get(i).getName().equals(name)) {
                    Teacher = teacherArrayList.remove(i);
                    break;
                }
            }
        }
            return Teacher;
    }

    public teacher search(String name) throws Exception {
        teacher Teacher = new teacher();
        boolean status = false;
        for (int i = 0; i < teacherArrayList.size(); i++) {
            if (teacherArrayList.get(i).getName().equals(name)) {
                Teacher = teacherArrayList.get(i);
                status = true;
            }
        }
        if (status) {
            return Teacher;
        } else {
            throw new Exception("Can not a teacher you want to search");
        }
    }

    public boolean update(String name) throws Exception {
        if (isNull()) {
            throw new Exception("Arrays is null");
        } else {
            return isChoseMenu(name);
        }
    }

    public void display() {
        for (int i = 0; i < teacherArrayList.size(); i++) {
            System.out.println(teacherArrayList.get(i).toString());
        }
    }

    public int displayLuong(String name){
        int luong = 0;
        for (int i = 0; i < teacherArrayList.size(); i++) {
            if (teacherArrayList.get(i).getName().equals(name)){
                luong = teacherArrayList.get(i).payRoll();
            }
        }
        return luong;
    }

    private boolean isChoseMenu(String name) throws Exception {
        boolean status = false;
        for (int i = 0; i < teacherArrayList.size(); i++) {
            if (teacherArrayList.get(i).getName().equals(name)) {
                Scanner Sc = new Scanner(System.in);
                if (Menu() == 1) {
                    System.out.println("Input name ");
                    String Name = Sc.nextLine();
                    teacherArrayList.get(i).setName(Name);
                    status = true;
                } else if (Menu() == 2) {
                    System.out.println("Input Address ");
                    String Address = Sc.nextLine();
                    status = true;
                    teacherArrayList.get(i).setName(Address);
                } else if (Menu() == 3) {
                    System.out.println("Input DateOfBirth ");
                    String dateOFBirth = Sc.nextLine();
                    teacherArrayList.get(i).setDateOfBirth(dateOFBirth);
                    status = true;
                } else {
                    throw new Exception("Cant not search your Want in Menu");
                }
            }
        }
        return status;
    }

    private boolean isNull() {
        return teacherArrayList.size() <= 0;
    }

    private int Menu() {
        System.out.println("1: Name");
        System.out.println("2: Address");
        System.out.println("3: DateOFBirth");
        System.out.println("Your chose");
        Scanner Sc = new Scanner(System.in);
        return Sc.nextInt();
    }
}

