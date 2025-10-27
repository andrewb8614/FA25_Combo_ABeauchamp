
public class Cat extends Animal {

private boolean longHair;
private boolean bobTail;


public Cat() {
	super();
	this.longHair = longHair;
	this.bobTail = bobTail;
}
public Cat(int height, double weight, String name,boolean longHair, boolean bobTail) {
	super(height, weight, name);
	this.longHair = longHair;
	this.bobTail = bobTail;
}
public boolean isLongHair() {
	return longHair;
}
public void setLongHair(boolean longHair) {
	this.longHair = longHair;
}
public boolean isBobTail() {
	return bobTail;
}
public void setBobTail(boolean bobTail) {
	this.bobTail = bobTail;
}


public String makeNoise() {
	return "Meow";
}


@Override
public String toString() {
	return "cat [height=" + super.getHeight() + ", weight=" + super.getWeight() + ", name=" + super.getName() + "Cat [longHair=" + longHair + ", bobTail=" + bobTail + "]";
}


	
	


}
