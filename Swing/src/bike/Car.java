package bike;

public class Car {
	String cl;
	String sp;
	String se;
	public String getCl() {
		return cl;
	}
	public void setCl(String cl) {
		this.cl = cl;
	}
	public String getSp() {
		return sp;
	}
	public void setSp(String sp) {
		this.sp = sp;
	}
	public String getSe() {
		return se;
	}
	public void setSe(String se) {
		this.se = se;
	}
	public String getWl() {
		return wl;
	}
	public void setWl(String wl) {
		this.wl = wl;
	}
	public String getBr() {
		return br;
	}
	public void setBr(String br) {
		this.br = br;
	}
	String wl;
	String br;
	void display()
	{
			System.out.println("model colour is "+ cl);
			System.out.println("speed is "+ sp);
			System.out.println("model seat "+ se);
			
	}
		}



