
public class Weapon {

	private String weaponName;
	private int damage;

	public Weapon() { // default constructor
		super();
		this.weaponName = "";
		this.damage = 0;
	}

	public Weapon(String weaponName, int damage) {// fields constructor
		super();
		this.weaponName = weaponName;
		this.damage = damage;
	}

	public String getName() {
		return weaponName;
	}

	public void setName(String weaponName) {
		this.weaponName = weaponName;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Weapon " + weaponName + "\nDamage: " + damage;
	}

}
