package Com.Constructor;

public class GradeDetail {
	private String a;
	private String b;
	private String c;
	public GradeDetail(String a, String b, String c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void GradeDetails() {
		System.out.println("GradeDetails Are....");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
	}
	
}
