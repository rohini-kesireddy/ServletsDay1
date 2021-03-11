<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.dao.*,com.ltts.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Playerdao pd=new Playerdao();
List<Player> li=pd.showPlayer();
%>
<table>
<tr>
<th>pname</th>
<th>dateOfBirth</th>
<th> skill</th>
<th> noOfMatches</th>
<th>  runs</th>
<th>  Wickets</th>
<th> Nationality</th>
<th>  pid</th>
<th> teamid</th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%=p.getpName() %></td>
<td><%=p.getDateOfBirth()%></td>

<td><%=p.getSkill() %></td>
<td><%=p.getNoOfMatches() %></td>
<td><%=p.getRuns() %></td>
<td><%=p.getWickets() %></td>
<td><%=p.getNationality() %></td>
<td><%=p.getPid() %></td>
<td><%=p.getTeamId() %></td>

</tr>
<%} %>
</table>

</body>
</html>
