package ants;
import graphHandler.*;

public class Ants {
	private char antType;
	private int foodColected;
	
	public Ants(char antType) {
		this.antType = antType;
		this.foodColected = 0;
	}
	
	public char getAntTyper() {
		return this.antType;
	}
	
	
	public int getFoodColected() {
		return this.foodColected;
	}
	
	public void setFoodColected(int amount) {
		this.foodColected = this.foodColected + amount;
	}
	
	public void getFoodRoute(Graph graph) {
		int beginPoint = 0;
		int endPoint = 5;
		
		this.getFoodRouteAux(graph.getNodes().get(0), beginPoint, endPoint);
		
		
	}
	
	private void getFoodRouteAux(Node startingNode, int beginPoint, int endPoint) {
		
	}
}
