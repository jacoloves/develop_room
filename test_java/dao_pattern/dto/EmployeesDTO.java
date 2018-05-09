package dto;

public class EmployeesDTO {

	private int employee_id;
	private String emplyee_name;

	/*id取得のためのgetter*/
	public int get_Employee_Id() {
		return this.employee_id;
	}


	/*id設定のためsetter*/
	public void set_Employee_Id(int id) {
		this.employee_id = id;
	}

	/*name取得のためgetter*/
	public String get_Employee_Name() {
		return this.emplyee_name;
	}

	/*name設定のためsetter*/
	public void set_Employee_Name(String name) {
		this.emplyee_name = name;
	}
}
