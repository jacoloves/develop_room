package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Minato
 */
@WebServlet("/Minato")
public class Minato extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>スッキリメンバーの紹介</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>湊　雄介のプロフィール</h1>");
		out.println("<p>"
				+ "入社2年目の23歳。<br>"
				+ "入社まではプログラミングの経験はなく、入社1年目にJavaのプログラミングを菅原に教えてもらう。<br>"
				+ "難しいことはちょっと苦手。でも、、かっこよくて、最高!"
				+ "</p>");
		out.println("<a href=memberList.html>一覧へ戻る</a>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
