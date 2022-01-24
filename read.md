JSP를 배우기 위해 정리한 기본적인 개념


WWW (Word Wide Web) (== W3, Web)​​

: 네트워크를 통해 정보를 공유할 수 있는 범세계적 정보 검색 시스템

​

HTTP (Hypertext Transfer Protocol)​

: WWW상에서 정보를 주고받을 수 있는 통신 규약

Client와 Server간의 요청(request)/응답(response) 방식의 통신 규약

HTML문서를 주고 받으면서 통신하고, 포트 번호는 80번을 사용한다.

​

URI (Uniform Resource Identifier)

: 인터넷에 있는 자원을 나타내는 유일한 주소.

하위개념으로 URL과 URN이 있다.

​

URL (Uniform Resource Locator)

네트워크상에서 자원이 어디 있는지를 알려주기 위한 규약

인터넷 프로토콜(HTTP, HTTPS, FTP...)과 함께 사용한다.

형식은 프로토콜://호스트명+주소이다.

예) https://www.google.com

​

Web Server

: 웹 페이지가 들어있는 파일을 사용자들에게 제공하는 프로그램

웹 서비스를 하려면 웹 서버 프로그램을 설치해야 한다.

ex) Apache, IIS(인터넷 정보 서버), Enterprise Server

​

Client

: 서버가 제공하는 웹 페이지, 자원 등을 사용하는 사용자측

browser을 이용

​

FrontEnd

BackEnd

Client

Browser

Server

Database

FrontEnd

: Client, Browser을 관리한다.

HTML, JS, CSS등을 이용한다.

​

BackEnd

: Server, Database를 관리한다.

ASP.NET, php, nodeJS, Rails, JSP, 파이썬 등을 이용한다.

​

JSP (JAVA Server Page)

: HTML문서 안에 자바코드를 삽입하는 기술 (Java in HTML)

HTML문서를 자바를 통해 동적으로 생성할 수 있다.

​

DB (DataBase)

: 체계화된 데이터의 집합체

대규모 데이터 공유와 효과적인 운영을 위한 저장소

틀은 table이며 1)데이터 중복 최소화 2)데이터 공유 3)일관성, 무결성, 보안성을 유지 할 수 있다.

​

DBMS (DataBase Management Systemm)

: 저장, 조회, 수정, 삭제 등의 여러가지 명령을 사용할 수 있는 데이터베이스 관리 프로그램

종류: Oracle Database, Mysql, Ms-sql, mariaDB, PostgreSQL 등..

​

SQL (Structured Query language)

: 구조화된(Structured) 데이터베이스에게 질의(Query)하는 언어(Languagae)

Oracle SQL, MS SQL, MYSQL등...

!! CRUD를 할 수 있다.


명칭

이용코드

<b>C</b>

Create

생성

CREATE

<b>R</b>

Read

조회

SELECT

<b>U</b>

Update

갱신

UPDATE, ALTER

<b>D</b>

Delete

삭제

DELETE, DROP

<hr>

### 웹 서버(HTTP)
웹 서버는 http문서와 직접적으로 정보를 주고받는다.

톰캣의 경우 아파치가 이 웹 서버를 담당한다.

HTTP문서에서 사용자의 요청이 정적 데이터인지 동적 데이터인지를 판단한다.

정적 데이터인 경우에는 이미 준비된 html문서를 그대로 응답(response)한다.

동적 데이터인 경우 웹 컨테이너에 요청(request)을 보낸다.

### 웹 컨테이너(서블릿 컨테이너)
사용자의 동적 데이터를 JSP, 서블릿으로 연산 및 제어, DB접근 등을 통해 정제된 데이터(정적 데이터)로 가공 후 이를 응답해준다.

Javascript가 비교적 가벼운 연산과 HTML문서에 접근해서 값을 변경하는 역할을 한다면, 웹 컨테이너 안에서 Java를 이용한 비교적 무거운 연산을 한다.

WAS(Web Application Server)
톰캣이 WAS역할을 한다.

동적 데이터를 처리할 서블릿을 메모리에 할당하며, web.xml을 참조하여 해당 서블릿에 대한 Thread를 생성한다.

서블릿 요청과 서블릿 응답 객체 생성 후 서블릿에 전달한다.

WAS는 웹 컨테이너와 웹 서버를 포함한 공간이다.

### 서블릿(Servlet)
Java코드 안에 HTML코드를 작성할 수 있는 JAVA프로그램이다.

웹 컨테이너의 지시로 Thread를 생성하고 Thread에 의해 서블릿에 있는 service()메소드가 호출된다.

전송 방식 요청(GET방식, POST방식)에 맞게 doGet() 또는 doPost()메소드를 호출한다.

doGet(HttpServletRequest req, HttpServletResponse resp){}
doPost(HttpServletRequest req, HttpServletResponse resp){}
위와 같은 메소드를 이용한다.



WAS는 Response객체를 HttpResponse형태(정적 데이터)로 바꾸어서 웹 서버에 전달하고, 생성된 Thread를 종료해준다.

그 후에 HttpServletRequest와 HttpServletResponse를 제거한다.

간단히, 클라이언트와 웹 서버가 데이터를 전달할 때에는 HttpRequest, HttpResponse를 이용하고, 웹 서버와 웹 컨테이너간 데이터 전달 시 HttpServletRequest, HttpServletResponse를 이용한다.

### JSP(Java Server Page)
HTML을 중심으로 자바와 같이 연동하여 사용하는 웹 언어이다.

HTML코드 안에 JAVA코드를 작성할 수 있는 언어이다.



> 서블릿에서 HTML을 작성하는 것 보다는 JSP에서 JAVA를 작성하는 것이 이용하기에 편하기 때문에 서블릿을 단독으로 사용하지 않고, JSP를 사용한다. 하지만 JSP내부에서 서블릿을 자동으로 이용하기 때문에 Servlet의 개념 또한 잘 알고 있어야 한다.


