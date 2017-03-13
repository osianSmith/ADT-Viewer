package data;

import java.util.ArrayList;
//TODO allow deletion of nodes and objects
/**
 * This is the Root node - the node that is created at first by default that
 * stores all the edges, nodes that is within this tree strucutute. 
 * @author osian
 *
 */
public class Root extends Node {
	// attributes
	private String rootName;
	private ArrayList<Node> storeageNodes;
	private ArrayList<Edge> storageEdges;
	
	

	/**
	 * This is the root construcor for node without the address
	 * @param rootName the name of the Root
	 * @param NodeName the name of the node
	 * @param element the name of the element
	 */
	public Root(String rootName,String NodeName, String element) {
		super(NodeName, element);
		// TODO Auto-generated constructor stub
		this.rootName = rootName;
		storeageNodes = new ArrayList<Node>();
		storageEdges = new ArrayList<Edge>();
		
	}
	/**
	 * This is the root construcor for node with the address
	 * @param rootName the name of the Root
	 * @param NodeName the name of the node
	 * @param element the name of the element
	 * @param address the address
	 */
	public Root(String rootName, String NodeName, String element,int address) {
		super(NodeName, element,address);
		this.rootName = rootName;
		storeageNodes = new ArrayList<Node>();
		storageEdges = new ArrayList<Edge>();
	}
	
	

	/**
	 * gets root name
	 * @return root name 
	 */
	public String getRootName() {
		return rootName;
	}

	/**
	 * returns storage Nodes
	 * @return storage Nodes
	 */
	public ArrayList<Node> getStoreageNodes() {
		return storeageNodes;
	}
	/**
	 * gets storage Edges
	 * @return storage edges
	 */
	public ArrayList<Edge> getStorageEdges() {
		return storageEdges;
	}
	
	/**
	 * adds edges to storage
	 * @param the new edge
	 */
	public void addEdge(Edge newEdge){
		this.storageEdges.add(newEdge);
	}
	
	/**
	 * adds a new Node to the array
	 * @param newNode the new node to the array.
	 */
	public void addnode(Node newNode){
		this.storeageNodes.add(newNode);
		}


}
