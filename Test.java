public class Test {
    public void alareefAge() {
       int age = 0;
       age = age + 17;
       System.out.println("Alareef's age is : " + age);
    }

    public void ameenAge() {
      int age = 0;
      age = age + 13;
      System.out.println("Ameen's age is : " + age);
    }
 
    public static void main(String args[]) {
       Test test = new Test();
       test.ameenAge();
       test.alareefAge();
    }

 }