
public class ObjectComparision{
    public static void main(String[] args){
        ObjectComparision obj1 =new ObjectComparision();
        ObjectComparision obj2 =new ObjectComparision();
        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj1));
        int a=obj1.hashCode();
        int b=obj2.hashCode();
        System.out.println("Hashcode of obj1 is "+a );
        System.out.println("Hashcode of obj2 is "+b );
    }
    
}
