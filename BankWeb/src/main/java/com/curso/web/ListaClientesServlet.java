package com.curso.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.domain.Customer;
import com.curso.servicios.CustomerService;


public class ListaClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      CustomerService customerService = new CustomerService();
    
    public ListaClientesServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> listaCustomer = customerService.dameTodosLosProductos();
		
		request.setAttribute("lista", listaCustomer);
		
		RequestDispatcher rd = request.getRequestDispatcher("lista-clientes.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
	}

}
