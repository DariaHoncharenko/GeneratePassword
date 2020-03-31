package userServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Random;


/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h3>Сгенерированный пароль:</h3>");
		out.println("<tr></tr>");
		
		int[] ArrayNumbers = new int [1000];
        for(int i = 0; i < 1000; i++) {
            ArrayNumbers[i] = i;
        }

        char[] ArrayChars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] ArrayBigChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N','O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        String[] ArraySigns = {".", "-", "_", "!", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "/", ":", ";", "<", "=", ">", "?", "@", "["};


        Random firstRandom = new Random();

        int numberFirstRandom  = firstRandom.nextInt(ArrayNumbers.length);
        out.print(ArrayNumbers[numberFirstRandom]);

        int charFirstRandom = firstRandom.nextInt(ArrayChars.length);
        out.print(ArrayChars[charFirstRandom]);

        int bigCharFirstRandom = firstRandom.nextInt(ArrayBigChars.length);
        out.print(ArrayBigChars[bigCharFirstRandom]);

        int signsFirstRandom =  firstRandom.nextInt(ArraySigns.length);
        out.print(ArraySigns[signsFirstRandom]);

        Random secondRandom = new Random();

        int bigCharSecondRandom = secondRandom.nextInt(ArrayBigChars.length);
        out.print(ArrayBigChars[bigCharSecondRandom]);

        int charSecondRandom = secondRandom.nextInt(ArrayChars.length);
        out.print(ArrayChars[charSecondRandom]);

        int signsSecondRandom = secondRandom.nextInt(ArraySigns.length);
        out.print(ArraySigns[signsSecondRandom]);

        int numberSecondRandom = secondRandom.nextInt(ArrayNumbers.length);
        out.print(ArrayNumbers[numberSecondRandom]);

        Random thirdRandom  = new Random();

        int signsThirdRandom = thirdRandom.nextInt(ArraySigns.length);
        out.print(ArraySigns[signsThirdRandom]);

        int bigCharThirdRandom = thirdRandom.nextInt(ArrayBigChars.length);
        out.print(ArrayBigChars[bigCharThirdRandom]);

        int charThirdRandom = thirdRandom.nextInt(ArrayChars.length);
        out.print(ArrayChars[charThirdRandom]);

        int numberThirdRandom = thirdRandom.nextInt(ArrayNumbers.length);
        out.print(ArrayNumbers[numberThirdRandom]);

    	out.println("<br></br>");
        
    	out.println("<a href='http://localhost:8080/GeneratePassword/mainPage.html'>Назад<a/><br>");
        
        out.close();
        
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
