package academy.learnprogramming.Stacks;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (!firstName.equals(employee.firstName)) return false;
        return lastName.equals(employee.lastName);
    }

    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + id;
        return result;
    }

    public String toString() {
        return "Employee{ " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

}

