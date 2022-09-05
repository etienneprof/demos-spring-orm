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

import bll.BidonBLL;
import bo.Bidon;

@WebServlet("/BidonServlet")
public class BidonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private BidonBLL bll;
	
	@Override
	public void init() throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
	}
	
	/*
	 * Alternative a la syntaxe ci-dessus
	 */
	/*
	@Override
	public void init(ServletConfig config) throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
	*/
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Bidon> bidons = bll.selectAll();
		for (Bidon current : bidons) {
			System.out.println(current);
		}
	}
}
