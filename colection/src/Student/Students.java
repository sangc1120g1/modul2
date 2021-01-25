package Student;

public class Students {
    private String name;
    private int oge;
    private String Address;

    public Students(String name, int oge, String address) {
        this.name = name;
        this.oge = oge;
        Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOge() {
        return oge;
    }

    public void setOge(int oge) {
        this.oge = oge;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", oge=" + oge +
                ", Address='" + Address + '\'' +
                '}';
    }
}
