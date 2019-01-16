public class Employee {
    private int idNumber;

    public int getIdNumber() {
        return this.idNumber;
    }

    public Employee(int id) {
        this.idNumber = id;
    }

    public boolean hasAdministratorRights() {
        return false;
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Employee)) {return false;}

        Integer temp = ((Employee) obj).getIdNumber();
        return temp.equals(this.getIdNumber());
    }

}
