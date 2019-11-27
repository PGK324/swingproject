package bike;

public class bike {

	String cl;
	String sp;
	String se;
	public String getCl() {
		return cl;
	}
	public void setCll(String cll) {
		this.cl = cll;
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
	void display()
	{
			System.out.println("model colour" + cl);
			System.out.println("model speed" + sp);
			System.out.println("model seat" + se);
			
	}

}
