class main_class{
    public static void main(String args[]){
        child_class obj = new child_class(); // Here we decleared the object obj belonging to the child_class. This way we can use multiple classes for neat work.
        
       obj.PrintName(); // Inheriting PrintName method from child_class
       obj.PrintAge();  // Inheriting PrintAge method from child_class
    }
}