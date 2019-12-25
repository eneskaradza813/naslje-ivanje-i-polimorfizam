package vjzeba10;

public class Vjzeba10 {

    public static void main(String[] args) {

        
        Pizza p = new Pizza("Kapricoza", 25);
        p.addition("paradajz");
        p.addition("pavlaka");
        System.out.println(p);
        
        Sandwich s = new Sandwich("Sendvic sa sunkom", 35);
        p.addition("krastavica");
        p.addition("luk");
        p.addition("paradajz");
        System.out.println(s);
        
        
        
    }

}
