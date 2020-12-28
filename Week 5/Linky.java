import java.util.LinkedList;
public class Linky {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<String>();

        linky.add("rob");
        linky.add("chad");
        linky.add("bob");
        
        
        System.out.println(linky.get(1));
        Iterator it = linky.iterator();
        while(it.hasNext()) {
            if((String)it.next() == "chad") {
                System.out.println("we found chad!!!!");
            }
        }
    }
}
