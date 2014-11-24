<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="java.util.List"%>
<%@page import="com.xtivia.samples.books.model.*"%>
<portlet:defineObjects />

<% 
   	List<Book> books = (List<Book>) renderRequest.getAttribute("books");
%>
<table>
	<thead>
		<tr>
			<th>Title</th>
			<th>Author</th>
		</tr>
	</thead>
	<tbody>
	<%
        for(Book book : books) {
    %>
		<tr>
			<td><%=book.getTitle() %></td>
			<td><%=book.getAuthor() %></td>
		</tr>
    
    <%
        }
	%>
	</tbody>	
</table>