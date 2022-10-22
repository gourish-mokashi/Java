package More_about_classes;

public class Private_constructors {
    private static Private_constructors obj;
    private Private_constructors(){

    }
    public static Private_constructors getInstance(){
        if (obj==null){
            obj=new Private_constructors();
            System.out.println("hi");
        }
        return obj;
    }
    public static void main(String[] args) {
       Private_constructors pc =Private_constructors.getInstance();

    }
}
