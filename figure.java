class Main {
	static Rectangle r;
	static Triangle t;
	
	static Cube my_cube;
	static Cilinder my_cilinder;
	
	
	public static void main(String[] args) 
	{
		r = new Rectangle(6);
		r.print(r.square());
		
		t = new Triangle(4,7);
		t.print(t.square());
		
		my_cube = new Cube(4,5,6);
		my_cube.print(my_cube.volume());
		
		my_cilinder = new Cilinder(3,5);
		my_cilinder.print(my_cilinder.volume());
		
		System.out.write(1);
	}
}

class Figure 
{
	int side_a, side_b;
	public Figure(int _side_a, int _side_b)
	{
		this.side_a = _side_a;
		this.side_b = _side_b;
	}
	
	public double square()
	{
		return this.side_a * this.side_b;
	}
	
	public void print(double data)
	{
		System.out.println(data);
	}
}

class Rectangle extends Figure
{
	public Rectangle(int _side_a) 
	{
		super(_side_a, _side_a);
	}
	
	public void print(double data)
	{
		System.out.println("Это фигура - квадрат с площадью " + data);
	}
}

class Triangle extends Figure
{
	public Triangle(int _side_a, int _side_b) 
	{
		super(_side_a, _side_b);
	}
	
	public double square()
	{
		return 0.5 * super.side_a * super.side_b;
	}
	
	public void print(double data)
	{
		System.out.println("Это фигура - треугольник с площадью " + data);
	}
}

class Body 
{
	int side_a,side_b,side_c;
	public Body(int _side_a, int _side_b, int _side_c) 
	{
		this.side_a = _side_a;
		this.side_b = _side_b;
		this.side_c = _side_c;
	}

	public double volume()
	{
		return this.side_a * this.side_b * this.side_c;
	}
	
	public void print(double data)
	{
		System.out.println(data);
	}
}

class Cube extends Body
{
	public Cube(int _side_a, int _side_b, int _side_c) 
	{
		super(_side_a, _side_b, _side_c);
	}
	
	public void print(double data)
	{
		System.out.println("Это тело - куб с объемом " + data);
	}
}

class Cilinder extends Body 
{
	public Cilinder(int _side_a, int _side_b) {
		super(_side_a, _side_b, 0);
	}
	
	public double volume()
	{
		return this.side_a * 4 * Math.PI * this.sqr(this.side_b);//side_b - радиус
	}
	
	public double sqr(double data)
	{
		return data*data;
	}
	
	public void print(double data)
	{
		System.out.println("Это тело - цилиндр с объемом " + data);
	}
}

