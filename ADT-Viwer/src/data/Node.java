package data;

import java.util.ArrayList;

/**
 * This class is the actual node of the data. 
 * @author Osian
 *
 */
public class Node {
	//atributes
	private String NodeName;
	private String element;
	private ArrayList<Edge> outgoingEdge;
	private int address;

	/**
	 * This is the construcor if user has requested a address
	 * @param NodeName the Name of the node
	 * @param element This is the element that will be stored in the node
	 * @param address The address of the object that the user sets
	 */
	public Node(String NodeName, String element, int address){
		this.NodeName = NodeName;
		this.element = element;
		outgoingEdge = new ArrayList<Edge>();
		this.address = address;
	}
	/**
	 * Contructor of the nodes if we want a system address. this will be chosen by default
	 * @param NodeName This is the Name of the node
	 * @param element This is what the user sets the node to
	 */
	public Node(String NodeName, String element){
		this.NodeName = NodeName;
		this.element = element;
		outgoingEdge = new ArrayList<Edge>();
		address = System.identityHashCode(this); //this goes and gets the addresss
		//directly from the JVM
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
	
	public int getAddress(){
		return this.address;
	}
	
	

}
