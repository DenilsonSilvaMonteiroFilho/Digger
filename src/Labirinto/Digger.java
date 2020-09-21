package Labirinto;

public class Digger {
	private int xLocal;
	private int yLocal;
	private String[] dna = {};
	
	Comands comand = new Comands();
	
	public Digger(int x, int y) {
		this.xLocal = x;
		this.yLocal = y;
	}
	
	public int getXLocal() {
		return this.xLocal;
	}
	public void setXLocal(int x) {
		this.xLocal = x;
	}
	public int getYLocal() {
		return this.yLocal;
	}
	public void setYLocal(int y) {
		this.yLocal = y;
	}
	
	//nextPosition need a limits of map
	public void nextPosicion(int xLimit, int yLimit) {
		String mov = comand.mov();
		
		switch(mov) {
			case "up":if(this.yLocal > 0) {
						this.yLocal--;
					}
				break;
			
			case "down":if(this.yLocal < yLimit - 1) {
							this.yLocal++;
						}
				break;
				
			case "left":if(this.xLocal > 0) {
							this.xLocal--;
						}
				break;
				
			case"right":if(this.xLocal < xLimit - 1) {
							this.xLocal++;
						}
				break;
		}
		
	}
	//mudar as variaveis de entra, para ser so de um objeto o outro vai ser o propio Digger
	public boolean isColison(int xObj1, int yObj1, int xObj2, int yObj2) {
		if(xObj1 == xObj2 & yObj1 == yObj2) {
			return true;
		}
		return false;
	}
	
}
