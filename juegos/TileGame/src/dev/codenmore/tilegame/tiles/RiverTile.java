package dev.codenmore.tilegame.tiles;

import dev.codenmore.tilegame.gfx.Assets;

public class RiverTile extends Tile{

		public RiverTile(int id) {
			super(Assets.river, id);
		}
		@Override
		public boolean isSolid(){
			return true;
		}
}
