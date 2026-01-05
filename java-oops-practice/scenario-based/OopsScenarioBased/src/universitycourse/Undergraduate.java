package universitycourse;


//Inheriting properties of Student class
class Undergraduate extends Student {

  public Undergraduate(int id, String name) {
      super(id, name);
  }

  @Override
  void displayInfo() {
      System.out.println("Undergraduate Student: " + name);
  }
}