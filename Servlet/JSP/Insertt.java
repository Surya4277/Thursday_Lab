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
 * Servlet implementation class Insertt
 */
public class Insertt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insertt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String Quer="insert into stud (roll_no,stud_firstname,stud_midname,stud_surname,class,division) values(?,?,?,?,?,?)";
			String roll_nno,firstname,midlename,lastname,class_name,division;
			roll_nno=request.getParameter("roll");
			int i=Integer.parseInt(roll_nno);
			firstname=request.getParameter("firstname");
			midlename=request.getParameter("midname");
			lastname=request.getParameter("surname");
			class_name=request.getParameter("class");
			division=request.getParameter("div");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");
			PreparedStatement st=con.prepareStatement(Quer);
			
			st.setString(1,roll_nno);
			st.setString(2,firstname);
			st.setString(3,midlename);
			st.setString(4,lastname);
			st.setString(5,class_name);
			st.setString(6,division);
			
			
			int count=st.executeUpdate();
			if(count>0) {
				response.sendRedirect("datainserted.jsp");
			}
			con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}


