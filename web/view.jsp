
<%@page import="com.beans.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<jsp:include page="base.jsp"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function confirmation(){
                if(confirm("Do you really wanna delete"))
                {
                 return true;   
                }
                return false;
            }
            </script>
    </head>
    <body class="text-light bg-dark">
       <%!
           UserDao ud=new UserDao();
            int start=0,end=3,total=ud.getRecordsCount();
        %> 
    <center>
        <h1 class="text-black display-3">LIST OF USER</h1>
        <table class="table table-striped table-dark" width="60%" border="1" cellspacing="0">
            <tr>
                <th > ID</th>
                 <th>NAME</th>
                  <th> Father Name</th>
                   <th> Gender</th>
                    <th> Date of Birth</th>
                     <th> Hobbies</th>
                     <th>User Id</th>
                     <td>Photo</td>
                     <td>Contact</td>
                      <th> Edit</th>
                      <th> Delete</th>
            </tr>
            <%
                if(request.getParameter("start")!=null)
                    start=Integer.parseInt(request.getParameter("start"));
                ArrayList<User> records=ud.getRecordByLimit(start,end);
                
                    for(User user: records){%>  
                    <tr>
                    <td><%=user.getId()%></td>   
                     <td><%=user.getName()%></td>   
                      <td><%=user.getFname()%></td>   
                       <td><%=user.getGender()%></td>   
                        <td><%=user.getDob()%></td>
                         <td><%=user.getHobbies()%></td> 
                          <td><%=user.getUserid()%></td>
                        
                          <td><img src="<%=user.getPhoto()%>" style="width:64px;height:64px;" class="img img-thumbnail"/></td>
                          <td><%=user.getContact()%></td>
                         
                         <td><a href="edit.jsp?id=<%=user.getId()%> " class="btn btn-success"><i class="fa fa-pencil"> Edit</i>  </a></td>
                         <td><a href="UserController?op=delete&id=<%=user.getId()%>" class="btn btn-danger" onclick=" return confirmation()"><i class="fa fa-trash"  aria-hidden="true"> Delete</i></a></td>   
                    </tr>
           <% }

                
     
         %>       
        </table>
        <br>
        
         </center>
        <center>
        <span>    
            <a href="view.jsp?start=<%=start-end%>" class="btn btn-primary <%if(start==0)out.println(" disabled"); %>" ><< Previous</a>
             <a href="view.jsp?start=<%=start+end%>" class="btn btn-primary <%if(total-start <= end) out.println(" disabled");%>" style="float: right">Next >></a>
        
             
                 <% for(int i=0;i<=total/end;i++){%>
        <a href="view.jsp?start=<%=i*end%>" class="btn btn-danger <%if(i==Math.floor(start/end)) out.println(" btn-light");%>"><%=i+1%></a>
        <%}%>  
        </span>
       
        
        <br>
        <br>
         <a href="reg1.jsp" class="btn btn-primary row"> <i class="fa fa-plus-circle" > Add more Record</i></a>
         </center> 
    </body>
</html>
