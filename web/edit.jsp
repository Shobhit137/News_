
<%@page import="com.daos.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<jsp:include page="base.jsp"></jsp:include>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <jsp:useBean class="com.beans.User" id = "user" scope="session"></jsp:useBean>
        <script>
            
            function readURL(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) {
                   pic.src= e.target.result;
                };

                reader.readAsDataURL(input.files[0]);
            }
        }
            </script>
    </head>
    
    <body  class="bg-dark">
        <div class="container">
             <div class="row">
                 <div style="position: fixed; bottom: 0px; left: 400px;">
                     <% if (request.getParameter("submit")!=null){%>
                     <jsp:setProperty name="user" property="*"></jsp:setProperty>
                     <%
                         String hobbies[] = request.getParameterValues("hobbies");
                         String hbs="";
                         for (String s : hobbies)
                            hbs += s +",";
                         
                         user.setHobbies(hbs);
                         
                         %>
                     
                     
                     <form  id="2" action="UserController?op=update&id=${user.id}" method="post" enctype="multipart/form-data">
                         <center><table  class="bg-dart text-white font-weight-bold text-center" width="60%" border="5">
                          <tr><td rowspan="4">
                         <img src="${user.photo}" id="img1" class="img img-thumbnail" style="width:200px; height: 200px"/> <br/>
                     Change Profile Image<input type="file" name="photo" id="photo" onchange="readURL(this);" />
                     <br/></td>
                          </tr>
                         
                     
                      </table>
                     <input type="submit" value=" Update in Record"/></center>
                     </form>
                     <%}%>
                 </div>             
             </div>
            
            
        <% 
            int id=request.getParameter("id")==null?-1:Integer.parseInt(request.getParameter("id"));
           UserDao ud= new UserDao();
           if(user!=null && user.getId() !=id){
           user=ud.getById(id);
           session.setAttribute("user",user);
           }
            %>
            <form    id="1" method="post">
                <center>
                    <h1  class="text-light bg-dark shadow ">Update data</h1>
                    <table  class="bg-dart text-white font-weight-bold" width="60%" border="5">
                        <tr>
                <td>Name </td>
                <td><input type="text" name="name" required="required" autocomplete="off" value="${user.name}"/> </td>
               
            </tr> <tr>
                <td>Father's Name </td>
                <td><input type="text" name="fname" required="required" value="${user.fname}"/> </td>
            </tr>
             <tr>
                <td>your DOB  </td>
                <td><input type="date" name="dob" value="${user.dob}" /> </td>
            </tr>
             <tr>
                <td>Contact</td>
                <td><input type="number" name="contact" value="${user.contact}" /> </td>
            </tr>
             <tr>
                <td>Your Gender </td>
                <td> <input type="radio" name="gender"  value="Male"  ${user.gender eq "Male"?  " checked":""}/> Male<br/>
                    <input type="radio" name="gender" value="Female" ${user.gender eq "Female"?  " checked":""} />Female<br/>
                </td>
            </tr> 
                <td>Selected Hobbies : </td>
                <td>
                    <input type="checkbox" name="hobbies" value="Dancing"  ${user.hobbies.contains("Dancing")? " checked" :""} />Dancing
                     <input type="checkbox" name="hobbies" value="Singing" ${user.hobbies.contains("Singing")? " checked" :""}/>Singing <br/>
                    <input type="checkbox" name="hobbies" value="Cooking" ${user.hobbies.contains("Cooking")? " checked" :""}/>Cooking
                    <input type="checkbox" name="hobbies" value="Drawing" ${user.hobbies.contains("Drawing")? " checked" :""}  />Drawing
                 </td>
            </tr>
            
            <tr>
                 
                <th  class="text-center" colspan="2">
                    <input type="reset" value="Clear" />
                    <input type="submit" name="submit" value="Save and Next "/> 
                </th>
            </tr>
            
            
         </table>  
                        
                    </center>
            
            </form>
            
           %>
    </body>
</html>
