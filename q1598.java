// LeetCode 1598: Crawler Log Folder - Stack simulation for folder navigation with special command handling
// Core Logic: Use stack, pop for "../", skip for "./", push for regular folders
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
