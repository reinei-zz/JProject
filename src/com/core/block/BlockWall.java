package com.core.block;

public class BlockWall extends Block {
	/**
	 * @param ID
	 * @param The Blocks texture Name
	 */
	public BlockWall(int h, String Name){
		super(h);
		textureName = Name;
	}
}