package pkg;
import java.util.Scanner;
import java.util.Random;


public class Pokemon {
	private int lvl = 100;
	private String name;
	private int HP;
    
	public Pokemon(String name) {
		name = this.name;
		HP = this.HP;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHP() {
		return HP;
	}
	public void setName(String a) {
		name = a;
	}
	
	public void setHP(int a) {
		HP = a;
	}
	
	public boolean hasFainted() {
		if(HP <= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Pokemon() {
		
		
	}

}

