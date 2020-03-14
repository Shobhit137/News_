<%-- 
    Document   : tanku
    Created on : 8 Mar, 2020, 8:01:43 PM
    Author     : shobh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporter Registration</title>
        <jsp:include page="base.jsp"></jsp:include>
        <script>
            function readURL(input,preview)
            {
              if(input.files && input.files[0])
              {
                   var reader=new FileReader();
                   reader.onload=function(e)
                   {
                       preview.src=e.target.result;
                   };
                   reader.readAsDataURL(input.files[0]);
              }
            }
            function varifyUserid(x,y){
               ajax = new XMLHttpRequest();
                ajax.open("GET","ReporterController?op=varifyUserid&userid="+x,true);
                ajax.send();
                
                ajax.onreadystatechange=function(){
                    if (this.readyState===4 && this.status===200){
                        y.innerHTML=this.responseText;
                    }
                };
            }
            function varifyEmailid(x,y){
               ajax = new XMLHttpRequest();
                ajax.open("GET","ReporterController?op=varifyEmailid&email="+x,true);
                ajax.send();
                
                ajax.onreadystatechange=function(){
                    if (this.readyState===4 && this.status===200){
                        y.innerHTML=this.responseText;
                    }
                };
            }
            </script>
    </head>
    <body>
         <center>
    <jsp:useBean class="com.beans.Reporter" id="reporter" scope="session"></jsp:useBean>
        <div class="container">
            <div class="row">
                <div class="col-md-3" style="position: fixed; right:0px;">
                <% if(request.getParameter("submit")!=null){
                    %>
                    <jsp:setProperty name="reporter" property="*"></jsp:setProperty>
                    <form action="ReporterController?op=add" method="post" enctype="multipart/form-data">
                        <img src="" style="width:200px;height: 200px;" id="preview" class="form-control"/><br/>
                        <input type="file" name="image" onchange="readURL(this,preview);" class="form-control btn btn-primary"/>
                        <br/>
                        <input type="submit" value="Save to Database" class="btn btn-primary" name="submit"/>
                    </form>
                    <%
                }%>
                </div>
           
            
            <div class="col col-md-9">
               <form method="post" class="form">
                    <table class="table bg-light">
                        <tr><th colspan="2"><h2> <center>Enter Reporter Details!!!</center></h2></th></tr>
                        <tr>
                            <td><h5>Enter  Name</h5></td>
                            <td><input type="text" name="name"class="form-control"  value="${reporter.name}"/></td>
                        </tr>
                        <tr>
                            <td><h5>Enter DOB</h5></td>
                            <td><input type="date" name="dob"  class="form-control" value="${reporter.dob}"/></td>
                        </tr>
                        <tr>
                            <td><h5>Gender</h5></td>
                            <td><input type="radio" name="gender" value="Male" ${reporter.gender eq "Male" ? "checked" :""}/>Male
                                <input type="radio" name="gender" value="Female" ${reporter.gender eq "Female" ? "checked" :""}/>Female</td>
                        </tr>
                        <tr>
                            <td><h5>Enter Reporter Contact's</h5></td>
                            <td><input type="number" name="contact" value="${reporter.contact}" class="form-control"/></td>
                        </tr>
                        <tr>
                            <td><h5>Enter Reporter Email</h5></td>
                            <td><input type="email" name="email" value="${reporter.email}" class="form-control" onblur="varifyUserid(this.value,s1);"/><br/>
                                <span id="s1"></span>
                            </td>
                        </tr>
                        <tr>
                            <td><h5>Enter Reporter Address</h5></td>
                            <td><input type="text" name="address" class="form-control" value="${reporter.address}"/></td>
                        </tr>
                        <tr>
                            <td><h5>Enter Reporter user_id</h5></td>
                            <td><input type="email" name="userid" class="form-control" value="${reporter.userid}" onblur="varifyEmailid(this.value,s2);"/><br/>
                                <span id="s2"></span>
                            </td>
                        </tr>
                        <tr>
                            <td><h5>Enter Reporter Password</h5></td>
                            <td><input type="password" name="password" value="${reporter.password}" class="form-control" /></td>
                        </tr>
                        <input type="hidden" name="status" value="pending"/>
                    </table>
                        <input type="submit" value="save and next" name="submit" id="submit" class="form-control btn btn-primary"/>
                </form>
                    
            </div>
          </div>
        </div>
                </center>
    </body>
</html>
