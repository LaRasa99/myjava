class dog2{
    public void bark(){
        System.out.println("woof ");
    }
    //overloading method
    public void bark(int num){// same method name different parameters
        for (int i=0; i<num;i++){
            System.out.println("woof ");
        }
    }
}

class main2{
    public static void main(String[] args){
        dog2 mydog2 = new dog2();

        mydog2.bark();

        mydog2.bark(5);
    }
}