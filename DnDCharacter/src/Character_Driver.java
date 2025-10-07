import java.util.Scanner;

public class Character_Driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is your character's name?");
		String name = input.next();

		System.out.println("How many hit points?");
		int hp = input.nextInt();

		System.out.println("How much power?");
		int power = input.nextInt();

		System.out.println("What is there armor class?");
		int ac = input.nextInt();

		System.out.println(" What is weapons name?");
		String weaponName = input.next();

		System.out.println(" What is weapons damage?");
		int damage = input.nextInt();

		Character bob = new Character(hp, name, power, ac);
		Weapon axe = new Weapon(weaponName, damage);

		Character monster = new Character();

		monster.setName("Bugaboo");
		monster.setPower(40);
		monster.setHealth(80);
		monster.setArmor(10);

		System.out.println(bob.toString());
		System.out.println(axe.toString());

		System.out.println("\n" + monster);

		bob.setWeapon(35, "Long_Sword");
		monster.setWeapon(25, "Claws");
		System.out.println(bob.toString());
		System.out.println(monster.toString());

		Character harpy = new Character(100, "Harpy", 75, 25, "Talons", 35);

	}

}
