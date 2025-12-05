interface SpecialAccess{}
public class markersexample {
    class Employee implemente SpecialAccess{
        String name;
        Employee(String name){
            this.name=name;
        }
        class AccessManager{
            void granbtAccess(object  obj){
                if (obj instanceof markersexample){
                    System.out.println("Access granted to ");
                }
                else{
                    System.out.println("Acces not granted");
                }
            }
        }
        public class marker{}
    }
}