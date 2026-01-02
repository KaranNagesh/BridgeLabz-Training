package com.inheritance.multilevel.educationcoursehirearchy;
//Inheriting properties of OnlineCourse class
public class PaidOnlineCourse extends OnlineCourse {

  private double fee;
  private double discount;
  
  //Parameterized constructor
  public PaidOnlineCourse(String courseName, int duration, String platform,
                          boolean isRecorded, double fee, double discount) {
      super(courseName, duration, platform, isRecorded);
      this.fee = fee;
      this.discount = discount;
  }

  public void displayFeeDetails() {
      displayOnlineDetails();
      System.out.println("Fee: " + fee);
      System.out.println("Discount: " + discount + "%");
      System.out.println("Final Fee: " + (fee - (fee * discount / 100)));
  }
}