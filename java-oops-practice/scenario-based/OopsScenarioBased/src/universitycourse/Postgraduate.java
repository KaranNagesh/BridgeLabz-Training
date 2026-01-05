package universitycourse;


//Inheriting properties of Student class
class Postgraduate extends Student {
	
	//Parameterized constructor
  public Postgraduate(int id, String name, double gpa) {
      super(id, name, gpa);
  }

  @Override
  void displayInfo() {
      System.out.println("Postgraduate Student: " + name);
  }
}