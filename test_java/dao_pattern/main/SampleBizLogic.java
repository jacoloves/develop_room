package main;

import java.util.List;

import dao.Contaner_employeesDAO;
import dto.EmployeesDTO;


public class SampleBizLogic {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//DAOクラスを生成
		Contaner_employeesDAO dao = new Contaner_employeesDAO();

		//selectEmp()メソッドの値をListを格納
		List<EmployeesDTO> emp = dao.selectEmp();

		//Listの中のEmployeesDTOクラスをループ
		for(EmployeesDTO empdata : emp) {
			System.out.println("社員ID：" + empdata.get_Employee_Id() + "  社員名：" + empdata.get_Employee_Name());
		}
	}

}
