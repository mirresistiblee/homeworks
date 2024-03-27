public class Lise {
    public static void main(String[] args) {
        KTAML dikish_2 = new KTAML(2,"Moskovskaya 171","KTAML","only girls");
       
        System.out.println(dikish_2.getFloors()+"\n"+dikish_2.getAddress()+"\n"+dikish_2.getName()+"\n"+dikish_2.getStudents());
    //    st.setterValues("Moskovskaya 171", 2, "KTAML");
    }
}

class KTAML{
   private int floors;
    private String address;
    private String name;
    private String students;
    
    public KTAML(){}
    public KTAML(int f,String a,String n,String s){
        this.floors = f;
         this.address = a;
         this.name = n;
         this.students = s;
    }
    int getFloors(){return this.floors;}
    String getAddress(){return this.address;}
    String getName(){return this.name;}
    String getStudents(){return this.students;}
    
    void setFloors (int floors){this.floors = floors;}
     void setAddress(String address){this.address = address;}
     void setName(String name){this.name = name;}
     void setStudents(String students){this.students = students;}
    }
