import java.util.*;
public class removeKey {
    public static void main(String[] args) { 
        
        String[] names = {"Ram","Naresh","Vani","Rahim","Deepak"};
        String[] games = {"Cricket","Football","Tennis","Cricket","Boxing"};
        HashMap<String, String> result = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        for (int i = 0; i < names.length;i++) {
            result.put(names[i],games[i]);
        }
        result.remove(value);
        ArrayList<String> playedlist = new ArrayList<>(result.keySet());
        Collections.sort(playedlist);
        for (String i : playedlist) {
            System.out.println(i + ":" + result.get(i));
        }
        input.close();
    }
}