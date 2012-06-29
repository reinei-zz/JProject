package com.core.block;

public class Repository {
	public static final Block blockAir		= new BlockAir(0, "Air").setName("Air").setCuttingEdge(true).setSolid(false);
	public static final Block blockWall		= new BlockWall(0, "Wall").setName("Wall");
}