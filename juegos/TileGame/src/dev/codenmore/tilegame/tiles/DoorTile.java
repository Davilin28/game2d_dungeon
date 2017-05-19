package dev.codenmore.tilegame.tiles;

import dev.codenmore.tilegame.gfx.Assets;

public class DoorTile extends Tile{
	public DoorTile(int id) {
		super(Assets.door, id);
	}
	@Override
	public boolean isSolid(){
		return true;
	}
}
