package dijkstra;

import graphHandler.Graph;
import graphHandler.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class dijkstraSolver {
    private final LinkedList<DijkstraNode> open;
    private final LinkedList<DijkstraNode> close;
    private final Graph graph;

    public dijkstraSolver(Node startNode, Graph grid) {
        this.open = new LinkedList<>();
        this.close = new LinkedList<>();
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
                    boolean opened = false;

                    for(DijkstraNode dijkstraNode : this.open){
                        if(dijkstraNode.getDataNode().getId() == currentId){
                            newDijkstraNode = dijkstraNode;
                            opened = true;
                            break;
                        }
                    }

                    if(newDijkstraNode == null) {
                                newDijkstraNode = new DijkstraNode(
                                this.graph.getNodes().get(currentId),
                                currentDijkstraNode.getSourceID(),
                                currentPathWeight
                        );
                    }

                    if(newDijkstraNode.getAggregatedWeight() > currentPathWeight){
                        newDijkstraNode.setAggregatedWeight(currentPathWeight);
                        newDijkstraNode.setSourceID(currentId);
                    }

                    if(!opened){
                        this.open.add(newDijkstraNode);
                    }

                    this.open.sort(Comparator.comparingInt(DijkstraNode::getAggregatedWeight));
                }
            }

            this.close.add(currentDijkstraNode);
            this.open.pop();
        }
    }
}