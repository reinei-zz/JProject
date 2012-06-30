package com.core.block;

public class Block {
	
	public static final Block[] blocks = new Block[4096];
	
	int blockID;
	
	/**
	 * Filename without path and file extension
	 */
	String textureName;	
	
	/**
	 * Text for the tooltip
	 */
	String displayName;	
	
	/**
	 * Does it have smooth Edges or is it a Block
	 */
	boolean isCuttingEdge;
	
	/**
	 *  Is it like Air? (Doors, Torches)
	 */
	boolean isSolid;
	
	/**
	 * TODO write description
	 * @param Block ID
	 * @return null
	 */
	public Block(int i) {
		if (blocks[i] != null){
			throw new IllegalArgumentException("ID "+i+"is already used from "+blocks[i]+"when"+this+"should be added");
		}
		else {
			blocks[i] = this;
			blockID = i;
			textureName = "";
			isCuttingEdge = false;
			isSolid = true;
		}
	}
	
	/**
	 * The Path and Name of the .png File
	 * @param The Block
	 * @return Path to the TextureFile
	 */
	String getTextureFile(Block block) {
		return "/Textures/"+block.textureName+".png";
	}
	
	/**
	 * The Path and Name of the .png File
	 * @param The Block ID
	 * @return Path to the TextureFile
	 */
	String getTextureFile(int ID) {
		return "/Textures/"+blocks[ID].textureName+".png";
	}
	
	public Block setDisplayName(String Name){
		displayName = Name;
		return this;
	}
	
	public Block setSolid(boolean solid){
		isSolid = solid;
		return this;
	}
	
	public Block setCuttingEdge(boolean cuttingedge){
		isCuttingEdge = cuttingedge;
		return this;
	}
	
	/*
	 * Work In Progress
	 */
	
/*	void onBlockPlacedbyPlayer(int x, int y, World world, Player player) { }  //TODO int z und method call
	void onBlockPlacedbyMachine(int x, int y, World world, Block placer) { }
	
	void onNeighborBlockChange(int x, int y, World world){ } //TODO method call	
*/	
}