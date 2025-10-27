
public class Dog extends Animal {

private String breed;
private String color;
public Dog() {
	super();
	breed = "none";
	color = "black";
}
public Dog(int height, double weight, String name, String breed, String color) {
	super(height, weight, name);
	this.color = color;
	this.breed = breed;
	
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


public String makeNoise() {
	return "Woof-Woof-Woof";
}

@Override
public String toString() {
	return "Dog [breed= " + breed + " name = " + super.getName() + " color= " + color + "Height= " + super.getHeight() + "Weight= " + super.getWeight() + "]";
}




}
