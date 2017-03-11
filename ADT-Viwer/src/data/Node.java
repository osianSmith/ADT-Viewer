package data;

import java.util.ArrayList;

public class Node {
	private String NodeName;
	private String element;
	private ArrayList<Edge> outgoingEdge;
	
	public Node(String NodeName, String element){
		this.NodeName = NodeName;
		this.element = element;
		outgoingEdge = new ArrayList<Edge>();
	}

	public String getNodeName() {
		return NodeName;
	}

	public void setNodeName(String nodeName) {
		NodeName = nodeName;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public ArrayList<Edge> getOutgoingEdges() {
		return outgoingEdge;
	}

	public void addEdge(Edge newEdge) {
		this.outgoingEdge.add(newEdge);
	}
	
	

}
