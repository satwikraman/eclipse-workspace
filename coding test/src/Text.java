class A{
    public void m1(){
        System.out.println("hello");
    }
}
 class B extends A{
    public void m1(){
        System.out.println("world");
    }
}

 class Text extends B {

     public static void main(String []args){
         
        Text t= new Text();
        t.m1();  
     }
}