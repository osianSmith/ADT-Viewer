package data;

import java.util.ArrayList;

/**
 * This clas is the actual node of the data. 
 * @author Osian
 *
 */
public class Node {
	//atributes
	private String NodeName;
	private String element;
	private ArrayList<Edge> outgoingEdge;

	/**
	 * Contructor of the nodes
	 * @param NodeName This is the Name of the node
	 * @param element This is what the user sets the node to
	 */
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
