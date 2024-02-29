package controller;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao.SampleDao;
import dto.Config;
import dto.Sample;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/action")
public class InsertController extends HttpServlet {
	

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fn=req.getParameter("fn");
		String ln=req.getParameter("ln");
		String course=req.getParameter("course");
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
		Sample sample=ac.getBean("sample",Sample.class);
		
		sample.setFirstName(fn);
		sample.setLastName(ln);
		sample.setCourse(course);
		
		SampleDao dao=ac.getBean("sampleDao",SampleDao.class);
		Sample sampleInDb=dao.insert(sample);
		if(sampleInDb!=null)
		{
			req.setAttribute("data", sampleInDb);
			RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		}
		
		
		
	}

}
