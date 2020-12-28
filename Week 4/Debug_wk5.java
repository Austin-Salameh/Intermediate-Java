
public class Debug_wk5 {

   
    public static void main(String[] args) {
        Trees[] tree = new Trees[3]; 
        
        tree[0] = new Trees ("Southern Oak", 70); 
        tree[1] = new Trees ("Birch", 50);          
        tree[2] = new Trees ("Blue Spruce", 65);
        
        for(Trees types: tree)
            System.out.println(types);
    }
}

class Trees {
    
    private String type; 
    private int height; 
  
    public Trees(String type, int height){
        this.type=type;
        this.height=height; 
    }
    
   public String toString(){
       return "The " + type + " grows to " + height + " feet high.";          
   }
   
}