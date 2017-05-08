package RayTracing;

public class Plane {
	public int nx, ny, nz; //normal
	public int offset; //offset
	public int mat_idx; //material index
	
	public int getNx() {
		return nx;
	}
	public void setNx(int nx) {
		this.nx = nx;
	}
	public int getNy() {
		return ny;
	}
	public void setNy(int ny) {
		this.ny = ny;
	}
	public int getNz() {
		return nz;
	}
	public void setNz(int nz) {
		this.nz = nz;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getMat_idx() {
		return mat_idx;
	}
	public void setMat_idx(int mat_idx) {
		this.mat_idx = mat_idx;
	}
	

}
