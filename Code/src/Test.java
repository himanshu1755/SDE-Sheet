import java.net.SocketOption;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here

        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue =  new LinkedList<>();
        Integer []visited =  new Integer[V];
        for(int i=0;i<V;i++){
            visited[i] = 0;
        }
        visited[1] = 1;
        queue.add(1);
        while(!queue.isEmpty()){
            Integer data =  queue.peek();
            result.add(queue.remove());
            List<Integer> neighbour = adj.get(data);

            for(int i=0;i<neighbour.size();i++){
                if(visited[neighbour.get(i)] == 0){
                    visited[neighbour.get(i)] = 1;
                    queue.add(neighbour.get(i));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String s = "hello";
        StringBuilder ss = new StringBuilder("himanshu");
        for(int i=0;i<s.length();i++){
            ss.setCharAt(i,'0');

            System.out.println(ss.charAt(i));
        }
    }
}
