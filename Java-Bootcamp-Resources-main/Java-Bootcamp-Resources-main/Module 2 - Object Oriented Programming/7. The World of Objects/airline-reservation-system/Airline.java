public class Airline {
    Person[] seats;

    public Airline() {
        this.seats = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(seats[index]);
    }

    public void setPerson(Person person) {
        this.seats[person.getSeatnumber() -1] = new Person(person);
    }

    public void createReservation(Person person) {

        while (seats[person.getSeatnumber()-1] != null) {
            System.out.println("\n" + person.getName()
            + ", seat: " + person.getSeatnumber()
            + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
        }

        int index = person.getSeatnumber()-1;
        seats[index] = new Person(person);
        System.out.println("Thank you " + person.getName() 
        + " for flying with Java Airlines. Your seat number is " 
        + person.getSeatnumber() + ".\n");
    }

    public String toString() {
        String temp = "";

        for (int i = 0; i < this.seats.length; i++) {
            if (seats[i] != null) {
                temp += seats[i].toString();
                temp += "\n\n";
            } else {
                temp += "Seat " + (i+1) + " is empty.";
                temp += "\n\n";
            }
            
        }

        return temp;
    }
    
}
