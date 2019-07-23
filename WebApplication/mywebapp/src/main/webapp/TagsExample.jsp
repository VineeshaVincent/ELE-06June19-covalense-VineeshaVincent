
<%!
	public String name="vineesha";
	private int age=20;

	{
		System.out.println("Inside the block");
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getName(String name){
		return "Name Of The Person Is: "+name;
	}
%>
<!DOCTYPE html>
<html>
<body>
<h1>JSP Tags Example!!!!!!!!!!!</h1>
<br><br>
Name 1 : <%=name %><br>
Name 2 : <%=getName() %><br>
Name 3 : <%=getName("GEETHU") %><br>
Age 1 : <%=age %><br>
Age 2 : <%=getAge() %><br>

<br><br>

<%
for(int i=0;i<5;i++){
%>
	Name 1 :<%= name  %><br>
<%
	}
%>
</body>
</html>