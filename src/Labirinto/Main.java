package Labirinto;

public class Main {

	public static void main(String[] args) {
		
		
		String obj = "[*]";
		int xObj = 9, yObj = 2;
		String diggerObj = "[D]";
		boolean found = false;
		
		//set Digger//
		Digger digger = new Digger(0,0);
		//
		
		//set map//
		Map map = new Map(20,5);
		//
		
		int count = 0;
		
		while(!found) {
			digger.nextPosicion(map.getXLocal(), map.getYLocal());
			
			//refresh image
			String[][] mapa = map.creatMap();
			mapa = map.insertElement(mapa,obj,xObj,yObj);
			mapa = map.insertElement(mapa, diggerObj, digger.getXLocal(), digger.getYLocal());
			map.seeMap(mapa);
			System.out.println("________________________________________");
			//
			count++;
			if(digger.isColisonDigger(xObj, yObj)) {
				found = true;
				System.out.println(count);
			}
		}
		
		
	}
}
