package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Middle_name
 */
public class Middle_name extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Middle_name() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String Quer="update stud set stud_midname=? where roll_no=?";
			String roll_no,midname;
			midname=request.getParameter("midname");
			roll_no=request.getParameter("roll");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Surya@135");
			PreparedStatement st=con.prepareStatement(Quer);
			st.setString(1, midname);
			st.setString(2,roll_no);
			st.executeUpdate();
			response.sendRedirect("updated.jsp");
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
