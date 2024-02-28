package controller;

import java.io.IOException;

import dao.exceptions.BaseDAOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.IParticipantService;
import service.ParticipantServiceImpl;
import service.dto.ParticipantDTO;
import service.exceptions.BaseServiceException;
/**
 * The {@link ParticipantInsertController} class acts 
 * as a controller between the user-client and the Service-layer.
 */
@WebServlet("/insert")
public class ParticipantInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final IParticipantService participantService = new ParticipantServiceImpl();
       

    public ParticipantInsertController() {}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname = request.getParameter("firstname").trim();
		String lastname = request.getParameter("lastname").trim();
		String mobilePhone = request.getParameter("mobilePhone").trim();
		String email = request.getParameter("email").trim();
		
		ParticipantDTO dto = new ParticipantDTO(firstname, lastname, mobilePhone, email);
		
		try {
			participantService.insert(dto);
			request.getRequestDispatcher("insert-success.jsp").forward(request, response);
		} catch(BaseDAOException | BaseServiceException e) {
			e.printStackTrace();
			request.getRequestDispatcher("insert-error.jsp").forward(request, response);
			
		}
		

	}

}
