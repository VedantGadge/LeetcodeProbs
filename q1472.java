public class q1472 {

    class Node {
    // Stores the URL of the page
    String data;
    // Pointer to the next page in history
    Node next;
    // Pointer to the previous page in history
    Node back;

    // Default constructor
    Node() {
        data = "0";
        next = null;
        back = null;
    }

    // Constructor with data
    Node(String x) {
        data = x;
        next = null;
        back = null;
    }

}

class BrowserHistory {

    Node currentPage;

    public BrowserHistory(String homepage) {
        currentPage = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        newNode.back = currentPage;
        currentPage.next = newNode;
        currentPage = newNode;
    }
    
    public String back(int steps) {
        while(steps>0 && currentPage.back!=null){
            currentPage = currentPage.back;
            steps--;
        }
        return currentPage.data;
    }
    
    public String forward(int steps) {
        while(steps>0 && currentPage.next!=null){
            currentPage = currentPage.next;
            steps--;
        }
        return currentPage.data;
    }
}
    
    public static void main(String[] args) {
        
    }
}
