import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Staff {
    String fullName;
    String jobTitle;
    String email;
    String phone;
    double salary;
    int age;

    public Staff(String fullName, String jobTitle, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static Staff[] staff() {
        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        staffArray[1] = new Staff("Koval Tatiana", "Engineer", "kovtatiana@mailbox.com", "892312312", 27000, 36);
        staffArray[2] = new Staff("Belaya Olga", "Secretary", "belolga@mailbox.com", "892312312", 26000, 42);
        staffArray[3] = new Staff("Kazimirov Kirill", "Engineer", "kazkirill@mailbox.com", "892312312", 31000, 35);
        staffArray[4] = new Staff("Shmid Denis", "Engineer", "shmidenis@mailbox.com", "892312312", 40000, 39);
        return staffArray;
    }

    public static void printStaffAll(Staff[] staff) {

        int count = staff.length;
        int n = 0;
        while (n < count) {
            System.out.println(printStaff(staff, n));
            n++;
        }
    }

    public static String printStaff(Staff[] staff, int n) {
        StringBuffer printPerson = new StringBuffer();
        printPerson.append("Full Name: ").append(staff[n].fullName)
                .append("\n")
                .append("Job title: ").append(staff[n].jobTitle)
                .append("\n")
                .append("Email: ").append(staff[n].email)
                .append("\n")
                .append("Phone: ").append(staff[n].phone)
                .append("\n")
                .append("Salary: ").append(staff[n].salary)
                .append("\n")
                .append("Age: ").append(staff[n].age).append("\n\n");
        return printPerson.toString();
    }

    public static void main(String[] args) {
        printStaffAll(staff());
    }
}