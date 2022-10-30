package org.kai;

import java.io.PrintWriter;
import java.io.IOException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Servlet
 */

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<head>");
		out.println("<title>CSS Template</title>");
		out.println("<meta charset=\"/utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");

		out.println("<style>");
		out.println("* {");
		out.println("  box-sizing: border-box;");
		out.println("}");
		out.println("");
		
		out.println("menu {");
		out.println("  float: left;");
		out.println("   width: 20%;");
		out.println("}");
		out.println("");
		
		out.println("menuitem {");
		out.println("  padding: 8px;");
		out.println("   margin-top: 7px;");
		out.println("   border-bottom: 1px solid #f1f1f1;");
		out.println("}");
		out.println("");
		
		out.println("main {");
		out.println("   float: left;");
		out.println("  width: 60%;");
		out.println("   padding: 0 20px;");
		out.println("   overflow: hidden;");
		out.println("}");
		out.println("");
		
		out.println("right {");
		out.println("   background-color: lightblue;");
		out.println("  float: left;");
		out.println("   width: 20%;");
		out.println("   padding: 10px 15px;");
		out.println("   margin-top: 7px;");
		out.println("}");
		out.println("");
		
		out.println("@media only screen and (max-width:800px) {");
		out.println("main {");
		out.println("   width: 80%;");
		out.println("  padding: 0;");
		out.println("}");
		out.println("right {");
		out.println("   width: 100%;");
		out.println("}");
		out.println("}");
		out.println("");
		
		out.println("@media only screen and (max-width:500px) {");
		out.println("menu, .main, .right {");
		out.println("   width: 100%;");
		out.println("}");
		out.println("");
		out.println("</style>");
		out.println("</head>");		
		
		
		out.println("  <body>");
		
		out.println(" style=\"font-family:Verdana;");
		
		out.println("  <div>");
		out.println(" style=\"background-color:#f1f1f1;padding:15px;");
		out.println("   <h1>Cinque Terre</h1>");
		out.println("   <h3>Resize the browser window</h3>");
		out.println("  </div>");
		out.println("");
		
		out.println("  <div>");
		out.println(" style=\"overflow:auto;");
		
		out.println("  <div>");
		out.println("    class=\"menu\"");
		out.println("   <div class=\"menuitem\">The Walk</div>");
		out.println("   <div class=\"menuitem\">Transport</div>");
		out.println("   <div class=\"menuitem\">History</div>");
		out.println("    <div class=\"menuitem\">Gallery</div>");
		out.println("  </div>");
		out.println("");
		
		out.println("  <div>");
		out.println("    class=\"main\"");
		out.println("   <h2>The Walk</h2>");
		out.println("   <div class=\"menuitem\">Transport</div>");
		out.println("   <p>The walk from Monterosso to Riomaggiore will take you approximately two hours, give or take an hour depending on the weather conditions and your physical shape.</p>");
		out.println("    <img src=\"img_5terre.jpg\" style=\"width:100%\">");
		out.println("  </div>");
		out.println("");
		
		out.println("  <div>");
		out.println("    class=\"right\"");
		out.println("   <h2>What?</h2>");
		out.println("   <p>Cinque Terre comprises five villages: Monterosso, Vernazza, Corniglia, Manarola, and Riomaggiore.</p>");
		out.println("   <h2>Where?</h2>");
		out.println("   <p>On the northwest cost of the Italian Riviera, north of the city La Spezia.</p>");
		out.println("   <h2>Price?</h2>");
		out.println("   <p>The Walk is free!</p>");
		out.println("  </div>");
		out.println("");
		
		out.println("  </div>");
		out.println("");
		
	
		out.println(" <div style=\"background-color:#f1f1f1;text-align:center;padding:10px;margin-top:7px;font-size:12px;\"> This web page is a part of a demonstration of fluid web design made by w3schools.com. Resize the browser window to see the content respond to the resizing.</div>");
		out.println("");
		
		out.println("");
		out.println("</body>");
	
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
