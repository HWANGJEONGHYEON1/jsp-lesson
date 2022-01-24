package example.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//어노테이션으로 서블릿의 이름을 표시하며, JSP파일에서 접근하기 위한 이름이다.
@WebServlet("/request")
public class ServletEx extends HttpServlet {


    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //GET방식 코드 작성
        //request와 response 인코딩 UTF-8로 변경
        request.setCharacterEncoding("UTF-8");
        System.out.println("request.getPath : " + request.getContextPath());
        response.setCharacterEncoding("UTF-8");

        //현재 페이지 인코딩 설정
        response.setContentType("text/html; charset=UTF-8;");

        //key값이 name인 데이터의 value를 String name에 저장
        String name = request.getParameter("name");

        //reponse의 PritnWriter객체 생성
        PrintWriter out = response.getWriter();

        //write메소드 속에는 html문서를 작성한다.
        out.write("<html><body>");
        out.write("<h1>"+name+"님 이 집속하셨습니다.</h1>");
        out.write("<a href='test.jsp'>초기화면으로 이동</a>");
        out.write("<h1>PATH : " + request.getContextPath() + "</ㅗ1>");
        out.write("</body></html>");

        //out.write는 버퍼를 이용하므로 close를 꼭 해줘야 출력된다.
        out.close();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("hello");
        response.sendRedirect("/");
    }
}
