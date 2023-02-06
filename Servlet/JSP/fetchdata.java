package Thursday_Lab;
 import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 import java.io.IOException;
 import java.sql.Connection;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class fetchdata
 */
public class fetchdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fetchdata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		String quer="select * from stud where roll_no=?";
		String rollno;
		rollno=request.getParameter("rollnno");
		int i= Integer.parseInt(rollno);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin");
		PreparedStatement st=con.prepareStatement(quer);
		st.setString(1, rollno);
		ResultSet rs=st.executeQuery();
		while(rs.next()) {
			System.out.println("hii");
		}
		}
		catch (Exception e){
			e.printStackTrace();
		}
			
	}
}



