package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Testenq
 */
@WebServlet("/Testenq")
public class Testenq extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String body = request.getParameter("body");

		String errorMsg = "";
		String 	cautionMsg = "";
		int err_cnt = 0;

		if(name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません<br>";
			err_cnt++;
		}

		if(err_cnt == 0 && body.length() == 0) {
			cautionMsg += "お問い合わせ内容はありません<br>";
		}

		String msg = name + "さんの問い合わせ<br>";
		msg += "問い合わせ種別：" + qtype + "<br>";
		if(cautionMsg.length() == 0) {
			msg += "お問い合わせ内容<br>";
			msg += body;
		}else {
			msg += cautionMsg;
		}

		if(errorMsg.length() != 0) {
			msg = errorMsg;
		}

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>お問い合わせ内容</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
