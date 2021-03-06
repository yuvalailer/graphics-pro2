package RayTracing;

public class Plane extends Shape{
	public double nx, ny, nz; //normal
	public double offset; //offset
	public int index;
	
	public Plane(double nx, double ny, double nz, double offset, int mat_idx, int index) {
		this.nx = nx;
		this.ny = ny;
		this.nz = nz;
		this.offset = offset;
		this.mat_idx = mat_idx;
		this.index = index;
	}
	
	public Plane() {
		this.nx = 0;
		this.ny = 0;
		this.nz = 0;
		this.offset = 0;
		this.mat_idx = 0;
		this.index = 0;
	}
	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	public double getNx() {
		return nx;
	}
	public void setNx(double nx) {
		this.nx = nx;
	}
	public double getNy() {
		return ny;
	}
	public void setNy(double ny) {
		this.ny = ny;
	}
	public double getNz() {
		return nz;
	}
	public void setNz(double nz) {
		this.nz = nz;
	}
	public double getOffset() {
		return offset;
	}
	public void setOffset(double offset) {
		this.offset = offset;
	}
	public int getMat_idx() {
		return mat_idx;
	}
	public void setMat_idx(int mat_idx) {
		this.mat_idx = mat_idx;
	}
	public Vector getNormal(Vector v) {
		Vector vec = new Vector(this.nx, this.ny, this.nz);
		return vec;
	}
	

}
