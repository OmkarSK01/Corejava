package collectionframework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeSet {
    int id;
    String name;
    String address;

    public EmployeeSet(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "EmployeeSet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        EmployeeSet that = (EmployeeSet) o;
        return Objects.hash(this.id, this.name, this.address)
                ==Objects.hash(that.id, that.name, that.address);
    }

    @Override
    public int hashCode() {
        System.out.println( Objects.hash(id, name, address));
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {
        EmployeeSet employeeSet1 = new EmployeeSet(1,"Prakash","Pune");
        EmployeeSet employeeSet2 = new EmployeeSet(1,"Prakash","PUne");
        EmployeeSet employeeSet3 = new EmployeeSet(1,"Prakash","Pune");
        EmployeeSet employeeSet4 = new EmployeeSet(1,"Prakash","Pune");

        Set<EmployeeSet> set = new HashSet<>();
        set.add(employeeSet1);
        set.add(employeeSet2);
        set.add(employeeSet3);
        set.add(employeeSet4);

        System.out.println(set);
    }
}



