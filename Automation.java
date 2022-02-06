package week3.day1;

public class Automation extends MultipleLangauge implements Language,TestTool  {
	static String st="Java";
	public void Java() {
		
	
		System.out.println("This Java method");
			
	}
	public void Selenium() {
		st="Selenium";
		System.out.println("This is Selenium method");
		System.out.println("Static variables "+st);
		this.ruby();
	}
		public void ruby() {
			System.out.println("This is Ruby method");
			System.out.println("The value of final variable"+fl_var);
			
		
	}
	
		public static void main(String[] args) {
			Automation at=new Automation();
			at.Java();
			at.Selenium();
			
		}
}
