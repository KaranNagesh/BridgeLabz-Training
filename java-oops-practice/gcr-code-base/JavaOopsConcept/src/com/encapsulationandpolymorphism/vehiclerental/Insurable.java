package com.encapsulationandpolymorphism.vehiclerental;


//Interface representing insurance-related behavior
interface Insurable {

// Method to calculate insurance cost
double calculateInsurance(int days);

// Method to get insurance details
String getInsuranceDetails();
}