import java.util.Stack;

public class q1598 {
    public int minOperations(String[] logs) {
        Stack<String> folderSys = new Stack<>();
        for(String log: logs){
            if(log.equals("../")){
                if(!folderSys.isEmpty()) folderSys.pop();
            } 
            else if(log.equals("./")) continue;
            else{
                folderSys.push(log);
            }
        }
        return folderSys.size();
    }
}
