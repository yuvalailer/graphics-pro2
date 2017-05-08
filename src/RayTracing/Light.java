package RayTracing;

public class Light {

	public int px; 		//position of the light (x)
	public int py;		//position of the light (y)
	public int pz;		//position of the light (z)
	public double r;	//light color (r)
	public double g;	//light color (g)	
	public double b;	//light color (b)
	public int spec;	// specular intensity
	public double shadow;// shadow intensity
	public int width;	//light width / radius (used for soft shadows)
	
	/**
	 * @return the px
	 */
	public int getPx() {
		return px;
	}
	/**
	 * @param px the px to set
	 */
	public void setPx(int px) {
		this.px = px;
	}
	/**
	 * @return the py
	 */
	public int getPy() {
		return py;
	}
	/**
	 * @param py the py to set
	 */
	public void setPy(int py) {
		this.py = py;
	}
	/**
	 * @return the pz
	 */
	public int getPz() {
		return pz;
	}
	/**
	 * @param pz the pz to set
	 */
	public void setPz(int pz) {
		this.pz = pz;
	}
	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}
	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}
	/**
	 * @return the g
	 */
	public double getG() {
		return g;
	}
	/**
	 * @param g the g to set
	 */
	public void setG(double g) {
		this.g = g;
	}
	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}
	/**
	 * @return the spec
	 */
	public int getSpec() {
		return spec;
	}
	/**
	 * @param spec the spec to set
	 */
	public void setSpec(int spec) {
		this.spec = spec;
	}
	/**
	 * @return the shadow
	 */
	public double getShadow() {
		return shadow;
	}
	/**
	 * @param shadow the shadow to set
	 */
	public void setShadow(double shadow) {
		this.shadow = shadow;
	}
	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
}
