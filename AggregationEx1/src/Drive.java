
public class Drive {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.name = "Mango Tree";
		t.height = 126.58;
		t.f = new Fruit();
		t.f.name = "Mango";
		t.f.color = "Yellow";
		t.f.taste = "Sweet";
		System.out.println("Tree name : "+t.name);
		System.out.println("Height of Tree: "+t.height);
		System.out.println("Fruit name: "+t.f.name);
		System.out.println("Color of fruit: "+t.f.color);
		System.out.println("Taste of fruit: "+t.f.taste);
	}
}
