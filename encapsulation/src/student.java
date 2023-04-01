public class student {
    //making the fields private is the first thing to do in order to implement encapsulation
    private String name;
    private int age;
    private String address;

    public student(String name,
                   int age,
                   String address){
        this.name = name; //without these 3 lines name,age,address can not be altered
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }

    @Override
    public String toString(){
        return("Student name is " + this.getName()+", age is: "+ this.getAge()+ " and address is: "+ this.getAddress());
    }

    public static void main(String[] args){
        student rasa = new student("Rasa", 22,"Badulla");
        /*System.out.println(rasa.setName("jj"));*/
        System.out.println(rasa.getName());
        System.out.println(rasa.getAge());
        System.out.println(rasa.getAddress());

    }
}
