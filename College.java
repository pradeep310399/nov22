package november22;

public class College extends University {
	public void ug() {
		System.out.println("ug is:BACHELOR OF ARCHITECTURE");
	}
	public static void main(String[] args) {
		
		College institute = new College();
		institute.ug();
		institute.pg();
	}

}
