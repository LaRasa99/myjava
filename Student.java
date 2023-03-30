public class Student {
    String name;
    int age;
    String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return ("Student name is "+ this.getName()+ ", age is: " + this.getAge());
    }

    public static void main(String[] args){ //initailizing the class
        Student john = new Student("John",25,"23 East, California"); // john is the object name
        System.out.println(john.toString());
        System.out.println(john.getName());
        System.out.println(john.getAge());
    }
}
