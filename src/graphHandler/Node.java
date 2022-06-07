package graphHandler;
import java.util.ArrayList;

public class Node {
	
	private int id;
	private ArrayList<Integer> linkedElements; //Store each node link
	private ArrayList<Integer> edges; //Store each adyacent node weight
	private boolean hasFood;
	
	public Node(int id)
	{
		this.id = id;
		this.linkedElements = new ArrayList<Integer>(); //Store each node link
		this.edges = new ArrayList<Integer>();
		this.hasFood = false;
	}
	
	public void setLink(int adyacentNode)
	{
		int weightVal = (int)((Math.random()*10)+1);
		edges.add(weightVal);
		linkedElements.add(adyacentNode);
	}	
	
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public ArrayList<Integer> getLink()
	{
		return this.linkedElements;
	}
	
	public ArrayList<Integer> getEdgesWeight()
	{
		return this.edges;
	}
	
	public void setFood(boolean hasFood) {
		this.hasFood = hasFood;
	}
	
	public boolean getFood() {
		return this.hasFood;
	}

}
