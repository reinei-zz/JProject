package com.core.world;

import com.core.block.*;

public class World {
	/**
	 * Temporary World
	 */
	public Block[][] World = new Block[10][10];
	
	/**
	 * Returns the Block at the given Position
	 * 
	 * @param x
	 * @param y
	 * @return Block block
	 */
	Block getBlockInWorld(int x, int y) { 
		return World[x][y];
	}
	
	/**
	 * Sets the Block at the given Position
	 * 
	 * @param x
	 * @param y
	 * @param ID
	 */
	void setBlock(int x, int y, int ID) {
		World[x][y] = Block.blocks[ID];
	}
	
	/**
	 * Development initializer
	 */
	void initializeTheWorld() {
		for (int r=0; r<World.length; r++) {
		     for (int c=0; c<World[r].length; c++) {
		    	 World[r][c] = Repository.blockAir;
		     }
		}
	}
}
