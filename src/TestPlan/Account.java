package TestPlan;

public class Account<stattic> {

     public static void main(String[] args)
     { System.out.println("Hello World");
     sayHello(  "Nadja");
     sayGoodbye("Deana");

     }




       private int age = 23;

     public static void sayHello(String name)
     {System.out.println("Hello" +name); }





    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account(int age) {
        this.age = age;
    }

    //TODO: Move the method to another class
       public static void sayGoodbye(String name)
      { System.out.println( "Good bye" +name);}

// my first comment
/*
    run this
    test
    tomorrow

 */

}

