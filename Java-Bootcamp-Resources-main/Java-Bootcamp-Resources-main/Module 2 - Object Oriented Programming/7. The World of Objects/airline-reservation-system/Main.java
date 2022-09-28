
public class Main {
  
    public static void main(String[] args) {

        Person rayanSlim = new Person("Rayan Slim", "Canadian", 
        "01/01/1111", 5);

        rayanSlim.setSeatNumber(10);;

        System.out.println("Name: " + rayanSlim.getName() + "\n" + "Nationality: " +
         rayanSlim.getNationality() + "\n" + "Date of Birth: " + rayanSlim.getDateOfBirth() +
          "\n" + "Seat Number: " + rayanSlim.getSeatnumber() + "\n");
      
    }
  
  
}
