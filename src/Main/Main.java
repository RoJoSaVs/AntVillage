package Main;
import graphHandler.Graph;

public class Main {
	
	public static void main(String[] args)
    {
		Graph graph = new Graph();
		graph.createRandomGraph(10, 0.3);
		/*for(int i = 0; i < 10; i++) {
			System.out.println(graph.getNodes().get(i).getLink());
			System.out.println(graph.getNodes().get(i).getEdgesWeight());
			System.out.println("--------------------------");
		}/**/
    }

}
