package november22;

public  class Desktop implements Hardware,Software {
	

	public void softwareResources() {
		System.out.println("software resources called!!");
	
		
	}


	public void hardwareResources() {
		System.out.println("hardware resources called!!");
	}
	
	public void desktopModel() {
		System.out.println("Desktop model is:Accenture");
	}
	
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.softwareResources();
		desk.hardwareResources();
		desk.desktopModel();
		
	}

}
