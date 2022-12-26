package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Contact {
  
  private String name;
  private String phoneNumber;

  SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
  private String birthday = sdf.format(new Date());



  public Contact(String name, String phoneNumber, String birthday) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.birthday = birthday;
  }

  public void printContact() {
    System.out.println(this.name);
    System.out.println(this.phoneNumber);
    System.out.println(birthday);
  }

}
