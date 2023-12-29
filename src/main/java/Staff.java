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

    static Staff[] staff() {
        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        staffArray[1] = new Staff("Koval Tatiana", "Engineer", "kovtatiana@mailbox.com", "892312312", 27000, 36);
        staffArray[2] = new Staff("Belaya Olga", "Secretary", "belolga@mailbox.com", "892312312", 26000, 42);
        staffArray[3] = new Staff("Kazimirov Kirill", "Engineer", "kazkirill@mailbox.com", "892312312", 31000, 35);
        staffArray[4] = new Staff("Shmid Denis", "Engineer", "shmidenis@mailbox.com", "892312312", 40000, 39);
        return staffArray;
    }

    static void printStaffAll(Staff[] staff) {
        int count = staff.length;
        int n = 0;
        while (n < count) {
            System.out.println(printStaff(staff, n));
            n++;
        }
    }

    static String printStaff(Staff[] staff, int n) {
        StringBuffer printPerson = new StringBuffer();
        printPerson.append("Full Name: ").append(staff[n].getFullName())
                .append("\n")
                .append("Job title: ").append(staff[n].getJobTitle())
                .append("\n")
                .append("Email: ").append(staff[n].getEmail())
                .append("\n")
                .append("Phone: ").append(staff[n].getPhone())
                .append("\n")
                .append("Salary: ").append(staff[n].getSalary())
                .append("\n")
                .append("Age: ").append(staff[n].getAge()).append("\n");
        return printPerson.toString();
    }

    public static void main(String[] args) {
        printStaffAll(staff());
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}