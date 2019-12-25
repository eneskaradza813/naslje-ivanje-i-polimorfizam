package vjzeba10;

public abstract class Product {

    public int type;
    public String name;
    public double price;
    public String[] additions;
    
    public abstract double countPrice();
    
    @Override
    public String toString(){
        return "Proizvod: " + this.name + "," + "cijena: " + countPrice() + "," + "dodaci: " + allAdditions();
    }
    
    public String allAdditions(){
        String output = "";
        for(String addition : this.additions)
            if(addition != null)
                output += addition + ",";
        
        if(output.equals(""))
              output += ("bez dodatka");
        
        return output;
    }
    public void addition(String addition){
        for(int i = 0; i < this.additions.length; i++)
            if(this.additions[i] == null)
            {
                this.additions[i] = addition;
                break;
            }
    }
    
}
