package com.curso.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.domain.Customer;
import com.curso.servicios.CustomerService;

/**
 * Servlet implementation class VerClienteServlet
 */
public class VerClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerService customerService = new CustomerService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VerClienteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String 	id= request.getParameter("idCustomer");
		int newId = Integer.parseInt(id);
		Customer customer = customerService.getById(newId);
		System.out.println("El nombre del cliente es" + customer.getFirstName());
		request.setAttribute("cliente", customer.getFirstName());
		
		RequestDispatcher rd = request.getRequestDispatcher("cliente.jsp");
		rd.forward(request, response);
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
