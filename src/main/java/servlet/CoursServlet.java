package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import bll.CoursBLL;
import bo.Cours;

@WebServlet("/cours")
public class CoursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CoursBLL bll;
	
	@Override
	public void init() throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Cours> cours = bll.selectAll();
		request.setAttribute("listeCours", cours);
		request.getRequestDispatcher("/WEB-INF/cours.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String libelle = request.getParameter("libelle");
		Cours cours = new Cours();
		cours.setTitre(libelle);
		bll.insert(cours);
		doGet(request, response);
	}
}
