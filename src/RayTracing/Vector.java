package RayTracing;


public class Vector {
	public double x, y, z;
	public double size;
	
	public Vector(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.size = Math.sqrt(x*x + y*y + z*z);
	}
	
	public Vector() {
		this(0,0,0);
	}
	
	public double dot(Vector other) { // dot product
		return (this.x*other.x + this.y*other.y + this.z*other.z);
	}
	
	public Vector cross(Vector other) { // cross product
		Vector vec = new Vector();
		vec.x = this.y*other.z - this.z*other.y;
		vec.y = this.z*other.x - this.x*other.z;
		vec.z = this.x*other.y - this.y*other.x;
		return vec;
	}
	
	public double getSize() {
		double size = Math.sqrt(x*x + y*y + z*z);
		return size;
	}
	
	public Vector normalize() { // normalize the vector
		double size = this.getSize();
		if (size == 0.0) {
			return this;
		}
		Vector vec = new Vector(this.x/size, this.y/size, this.z/size);
		return vec;
	}
	
	public Vector add(Vector other) { // vector addition
		Vector vec = new Vector();
		vec.x = this.x + other.x;
		vec.y = this.y + other.y;
		vec.z = this.z + other.z;
		return vec;
	}
	
	public Vector sub(Vector other) { // vector subtraction
		Vector vec = new Vector();
		vec.x = this.x - other.x;
		vec.y = this.y - other.y;
		vec.z = this.z - other.z;
		return vec;
	}
	
	public Vector mult(double i) { // multiply by scalar
		Vector V = new Vector();
		V.x = this.x*i;
		V.y = this.y*i;
		V.z = this.z*i;
		return V;
	}
	
	public Vector div(double i) { // divide by scalar
		Vector V = new Vector();
		V.x = this.x/i;
		V.y = this.y/i;
		V.z = this.z/i;
		return V;
	}

	public double getDistanceScalar(Vector position) { // distance between two points
		double x = Math.abs(this.x - position.x);
		double y = Math.abs(this.y - position.y);
		double z = Math.abs(this.z - position.z);
		return Math.sqrt(x*x + y*y + z*z);
	}

	public Vector dotByPart(Vector that) { // multiply vectors by parts
		Vector ans = new Vector();
		ans.x = this.x * that.x;
		ans.y = this.y * that.y;
		ans.z = this.z * that.z;
		return ans;
	}

}
