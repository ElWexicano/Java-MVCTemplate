package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.MyModel;

/**
 * A simple controller which is used to manipulate the model
 * and pass it to the view.
 * @author iamshanedoyle
 */
@WebServlet("/home")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private MyModel myModel;
	
    @Override
    public void init() throws ServletException {
    	super.init();
    	myModel = new MyModel();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		myModel.setNumber(myModel.getNumber()+1);
		
		request.setAttribute("message", myModel.getMessage());
		request.setAttribute("number", myModel.getNumber());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

}
