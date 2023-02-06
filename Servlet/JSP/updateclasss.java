package Thursday_Lab;

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
 * Servlet implementation class updateclasss
 */
public class updateclasss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateclasss() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String Quer="update stud set class=? where roll_no=?";
			String roll_no,firstclass;
			firstclass=request.getParameter("class");
			roll_no=request.getParameter("roll");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");
			PreparedStatement st=con.prepareStatement(Quer);
			st.setString(1, firstclass);
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
