package iterators_and_comparatotrs.exercises.p06_Strategy_pattern;

public class Person {

  private String name;
  private int age;
  
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

public String getName() {
  return this.name;
}

public int getAge() {
  return this.age;
}

@Override
public String toString() {
  return String.format("%s %s", this.getName(), this.getAge());
}
}
