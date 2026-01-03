package com.encapsulationandpolymorphism.ecommerce;

//Interface for products on which tax is applicable
interface Taxable {

// Method to calculate tax amount
double calculateTax();

// Method to return tax details
String getTaxDetails();
}