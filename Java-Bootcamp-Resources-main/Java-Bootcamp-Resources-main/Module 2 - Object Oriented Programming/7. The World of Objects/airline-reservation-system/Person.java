import java.util.Arrays;
import java.util.Random;
public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getSeatnumber() {
        return this.seatNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDaterOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    public String[] getPassport() {
        return Arrays.copyOf(this.passport, this.passport.length);
    }
    public void setPassport() {
        this.passport = new String[] {this.name, this.nationality, this.dateOfBirth};
    }

    public boolean applyPassport() {
        Random rand = new Random();
        int n = rand.nextInt(50);
        if (n % 2 == 0) {
            return false;
        }
        return true;
    }

    public void chooseSeat() {
        Random rand = new Random();
        int n = rand.nextInt(11);
        this.seatNumber = n;
    }

    public String toString() {
        return "Name: " + this.name + "\n"
        +  "Nationality: " + this.nationality + "\n"
        +  "Date of Birth: " + this.dateOfBirth + "\n"
        +  "Seat Number: " + this.seatNumber + "\n"
        +  "Passport: " + Arrays.toString(passport) + "\n";
    }

   
}
