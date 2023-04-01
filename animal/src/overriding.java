class Dog1 {
    public void bark() {
        System.out.println("woof ");
    }
}
class Hound extends Dog1{
    public void sniff(){
        System.out.println("sniff ");
    }
    public void bark(){ // same method name same parameter
        System.out.println("bowl ");
    }
}
class main1{
    public  static void main(String[] args){
        Hound myhound = new Hound();
        myhound.sniff();
        myhound.bark();

        Dog1 mydog1 = new Dog1();
        mydog1.bark();
    }
}
