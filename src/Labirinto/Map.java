package Labirinto;

public class Map {
	private int x;
	private int y;
	
	public Map(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getXLocal() {
		return this.x;
	}
	public void setXLocal(int x) {
		this.x = x;
	}
	public int getYLocal() {
		return this.y;
	}
	public void setYLocal(int y) {
		this.y = y;
	}
	
	//Create map and complement with "[]"
	public String[][] creatMap(){
		String[][] matriz = new String[this.y][this.x];
		for (int i = 0; i < this.y; i++) {
			for (int j = 0; j < this.x; j++) {
				if (matriz[i][j] == null) {
					matriz[i][j] = "[]";
				}
			}
		}
		return matriz;
	}
	//Insert in map the object what need a search for he
	public String[][] insertElement(String[][] map,String obj,int x, int y){
		String[][] modfMap = map;
		modfMap[y][x] = obj;
		return modfMap;
	}
	
	public void seeMap(String[][] map) {
		for (int i = 0; i < this.y; i++) {
			for (int j = 0; j < this.x; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}

