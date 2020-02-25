package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.EmployeesDTO;


public class Contaner_employeesDAO {

	public List<EmployeesDTO> selectEmp(){

		//DTOインスタンス格納用
		List<EmployeesDTO> employeesDTO = new ArrayList<>();

		//コネクションを初期化
		Connection con = null;

		try {
			//JDBCドライバの読み込み
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

			//データベースへのアクセス
			con = DriverManager.getConnection("jdbc:mysql://localhost/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","");

			//SQL文を発行するためのオブジェクト
			Statement stm = con.createStatement();
			//SQL文の発行
			String sql = "select * from employees";
			// SQL文の実行結果を取得
			ResultSet rs = stm.executeQuery(sql);

			//DBから取得した値が存在するまでループ
			while(rs.next()) {
				//DTOインスタンス生成
				EmployeesDTO dto = new EmployeesDTO();
				//IDカラムの値をDTOへ設定
				dto.set_Employee_Id(rs.getInt("id"));
				//NAMEカラムの値をDTOへ設定
				dto.set_Employee_Name(rs.getString("name"));
				//DTOインスタンスをリストへ格納
				employeesDTO.add(dto);
			}
		//JDBCドライバが取得できない場合
		}catch(InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.out.println("JDBCドライバのロードに失敗しました。");
		//接続先エラーもしくは、SQL発行エラーが発生した場合
		}catch(SQLException e) {
			System.out.println("MySQLに接続できませんでした。");
			System.out.println("SQLException: " + e.getMessage());
		    System.out.println("SQLState: " + e.getSQLState());
		    System.out.println("VendorError: " + e.getErrorCode());
		}finally {
			//DB接続が存在する場合
			if(con != null) {
				try {
					//切断
					con.close();
				}catch(SQLException e) {
					System.out.println("MySQLのクローズに失敗しました。");

				}
			}
		}
		//格納した値をListへ返却
		return employeesDTO;
	}

}
