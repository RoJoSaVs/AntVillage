package dijkstra;

import graphHandler.Graph;
import graphHandler.Node;

import java.util.ArrayList;
import java.util.LinkedList;

public class dijkstraSolver {
    private LinkedList<DijkstraNode> open;
    private LinkedList<DijkstraNode> close;
    private Graph graph;

    public dijkstraSolver(Node startNode, Graph grid) {
        this.open = new LinkedList<DijkstraNode>();
        this.close = new LinkedList<DijkstraNode>();
        this.open.add(new DijkstraNode(startNode, startNode.getId(), 0));
        this.graph = grid;
    }

    public  void runDijkstra(){
        DijkstraNode currentDijkstraNode = this.open.get(0);
        while(!open.isEmpty()){

            ArrayList<Integer> currentNeighborsIds = currentDijkstraNode.getDataNode().getLink();
            ArrayList<Integer> currentPathValues = currentDijkstraNode.getDataNode().getEdgesWeight();

            for(int i = 0; i < currentNeighborsIds.size(); i++){
                int currentId = currentNeighborsIds.get(i);

                boolean found = false;

                for(DijkstraNode node : this.close){
                    if(currentId == node.getDataNode().getId()){
                        found = true;
                        break;
                    }
                }

                if(!found){
                    int currentPathWeight = currentPathValues.get(i) + currentDijkstraNode.getAggregatedWeight();

                    DijkstraNode newDijkstraNode = null;

                    for(DijkstraNode dijkstraNode : this.open){
                        if(dijkstraNode.getDataNode().getId() == currentId){
                            newDijkstraNode = dijkstraNode;
                            break;
                        }
                    }

                    if(newDijkstraNode.equals(null)) {
                                newDijkstraNode = new DijkstraNode(
                                this.graph.getNodes().get(currentId),
                                currentDijkstraNode.getSourceID(),
                                currentPathWeight
                        );
                    }
                }
            }
        }
    }

    public void sortNodes(){
        LinkedList<DijkstraNode> newOpenList = new LinkedList<DijkstraNode>();
        for(DijkstraNode dijkstraNode : this.open){

        }
    }
}