package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOEmpresa;

import entidade.Empresa;

/**
 * Servlet implementation class CadastrarEmpresa
 */
@WebServlet("/CadastrarEmpresa")
public class CadastrarEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CadastrarEmpresa() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Empresa empresa = new Empresa(request.getParameter("nome"));
		DAOEmpresa daoEmpresa = new DAOEmpresa();
		daoEmpresa.salvar(empresa);
		RequestDispatcher r = request.getRequestDispatcher( "CadEmpresa.jsp" );  
		r.forward( request, response );
	}

}
