public class Market {
    public static void main(String[] args) {
        MarketGlobus st = new MarketGlobus();
        MarketAsia st2 = new MarketAsia();
        MarketAzbuka st3 = new MarketAzbuka();
        
        st.floors = 3;
        st.address = "7 April";
        st.name = "Globus";
        
        st2.floors = 2;
        st2.address = "Bishkek Park";
        st2.name = "Asia";
        
        st2.floors = 4;
        st2.address = "Moskovskaya 171";
        st2.name = "Azbuka";
    //    st.setterValues("7 April", 3, "Globus");
        st.getterValues();
        st2.getterValues();
        st3.getterValues();
    }
}

class MarketGlobus{
    int floors;
    String address;
    String name;
    
    void setterValues (int floors, String address, String name){
        this.floors = floors;
        this.address = address;
        this.name = name;
    }
    
    void getterValues(){
        System.out.println(name + "\n " + address+ "\n " + floors + "\n ");
    }
}
class MarketAsia{
    int floors;
    String address;
    String name;
    
    void setterValues (int floors, String address, String name){
        this.floors = floors;
        this.address = address;
        this.name = name;
    }
    
    void getterValues(){
        System.out.println(name + "\n " + address+ "\n " + floors + "\n ");
    }
}
class MarketAzbuka{
    int floors;
    String address;
    String name;
    
    void setterValues (int floors, String address, String name){
        this.floors = floors;
        this.address = address;
        this.name = name;
    }
    
    void getterValues(){
        System.out.println(name + "\n " + address+ "\n " + floors +"\n");
}
}