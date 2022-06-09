package dijkstra;

import graphHandler.Node;

public class DijkstraNode {
    private Node dataNode;
    private int sourceID;
    private int aggregatedWeight;

    public DijkstraNode(Node dataNode, int sourceID, int aggregatedWeight) {
        this.dataNode = dataNode;
        this.sourceID = sourceID;
        this.aggregatedWeight = aggregatedWeight;
    }

    public int getAggregatedWeight() {
        return aggregatedWeight;
    }

    public void setAggregatedWeight(int aggregatedWeight) {
        this.aggregatedWeight = aggregatedWeight;
    }

    public Node getDataNode() {
        return dataNode;
    }

    public int getSourceID() {
        return sourceID;
    }

    public void setSourceID(int sourceID) {
        this.sourceID = sourceID;
    }
}
