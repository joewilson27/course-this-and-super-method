/**
 * this() method executes the constructor of the same class
 * super() method executes the constructor of superclass / parent class
 * 
 * Every class in java extends the Object class by default
 */
// class A extends Object { is same as class A {
class A {
  // default constructor
  public A() {
    super(); // Every class in java extends the Object class by default, so this super() method is called the default constructor of Object class
    System.out.println("in A");
  }
  // parameterized constructor
  public A(int n) {
    super();
    System.out.println("in A int");
  }
}

class B extends A {
  // default constructor
  public B() {
    // 4. We want to call parameterized constructor from superclass / parent class
    //super(7);

    System.out.println("In B");
  }
  // parameterized constructor
  public B(int n) {
    /**
     * Every constructor in java HAS a mehod even if you don't created or mentioned by default. And that method is super(), it is the first statement in every constructor
     */
    // super(); // it will call the default constructor of superclass/parent class (THIS IS THE DEFAULT)
    
    // 3. it will call the parameterized constructor of superclass/parent class
    //super(n);
    
    // 5. It will call the default constructor from the same class
    // this();

    // 6. we will call constructor type string B(String name)
    this("tester");
    System.out.println("In B int");
  }

  // test example
  public B(String name) {
    System.out.println("In B string");
  }
}

public class Demo {
  public static void main(String[] args) {
    /**
     * 1.
     * Whenever you get object of a class, it call the constructor of class itself and superclasses/parent classes
     * For this example, it will print out:
     * in A
     * in B
     */
    //B obj = new B();

   /**
    * 2.
    * Let's create object with parameterized constructor
    * For this example, it will print out:
    * in A
    * in B int
    *
    * Because the object created with parameterized constructor and they will call the default constructor of A class (since b extends A)
    */
    //B obj = new B(7);

    /**
     * 3.
     * So what if I want to call the parameterized constructor superclass from the object of subclass
     * For this example, it will print out:
     * in A int
     * in B int
     */
    //B obj = new B(7);

    /**
     * 4.
     * I want to call the parameterized constructor of superclass/parent class from the object that use default constructor
     * For this example, it will print out:
     * in A int
     * in B
     */
    //B obj = new B();

    /**
     * 5.
     * I want to execute every constructor in B class and default constructor in A class
     * Then this() come to rescue this case
     * For this example, it will print out:
     * in A
     * in B
     * in B int
     */
    //B obj = new B(7);

    /**
     * 6.
     * I want to print parameterized constructor type int  and type string and also default constructor of superclass
     * For this example, it will print out:
     * in A
     * in B string
     * in B int
     */
    B obj = new B(7);
  }
}
