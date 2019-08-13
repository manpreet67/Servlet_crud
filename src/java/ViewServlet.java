/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author manpreet
 */
public class ViewServlet extends HttpServlet {

    

   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print("<a href='index.html'> Add New Employees</a>");
        out.print("<h1> Employees List </h1>");
        List <Emp> list=EmpDao.getAllEmployees();
        out.print("<table border='1' width='100%'>");
        out.print("<tr><th>ID</th><th>NAME</th><th>PASSWORD</th><th>EMAIL</th></th><th>COUNTRY</th></th><th>EDIT</th></th><th>DELETE</th></tr>");
    for(Emp e:list)
    {
        out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td><td>"+e.getEmail()+"</td><td>"+e.getCountry()+"</td><td><a href='EditServlet?id="+e.getId()+"'> Edit </a></td><td><a href='DeleteServlet?id="+e.getId()+"'> Delete </a> </td></tr>"); 
    }
    out.print("</table>");
    out.close();
                
    }
}

  


