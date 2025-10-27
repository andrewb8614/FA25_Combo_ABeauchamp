
public class Animal {

	private int height;
	private double weight;
	private String name;

	public Animal() {
		this.height = 0;
		this.weight = 0.0;
		this.name = "none";
	}

	public Animal(int height, double weight, String name) {
		this.height = height;
		this.weight = weight;
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//@Override
	public String makeNoise() {
		return "Blah-Blah-Blah";
	}

	@Override
	public String toString() {
		return "animal [height=" + height + ", weight=" + weight + ", name=" + name + "]";
	}

	
	
	
}
