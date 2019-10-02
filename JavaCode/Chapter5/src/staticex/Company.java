package staticex;

public class Company {
	
	private static Company instance = new Company();
	
	private Company() {}
	//외부에서 인스턴스 생성과 상관없이 가져다가 쓰기 위해서 static으로 사용
	public static Company getInstance() {
		if(instance== null) {
			instance = new Company();
		}
		return instance;
	}
	
	
}
