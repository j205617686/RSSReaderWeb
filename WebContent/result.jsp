<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>

<html>
    <head>
    

    
    <%@ page import="java.util.ArrayList,java.util.List,home.*,org.json.*"%>
    <title>RSS Parse Result</title>
    <link type="text/css" rel="stylesheet" href="./jquery.mobile-1.0a3.min.css" />
    <script src="http://code.jquery.com/jquery-1.5.2.min.js"></script>
    <script src="http://code.jquery.com/mobile/1.0a4.1/jquery.mobile-1.0a4.1.min.js"></script>

<script type="text/javascript">
    
    function start() {
     var ul=document.getElementById("ro");
     
     
     ul.innerHTML+=("<li></li>");
    }
    
    
    window.addEventListener( "load", start, false );
    
    
</script>  

  
   
<style type="text/css">

.ui-li-desc {white-space:normal;}

</style>  

</head>
<body>
    
    
    
<%
String getjson = (String)request.getAttribute("JSONString");
//out.println(getjson);	

JSONObject jsonobj=new JSONObject(getjson);
JSONArray array = jsonobj.getJSONArray("list");

%>
<%out.println("length"+array.length());%>
    
    
    
    
    
    
    
    
    
    
    
<div data-role="page">
 	  <div data-role="header">
        <h1>Your subscribe RSS is:</h1>
      </div>
      <!-- /header -->
      <div data-role="content" id="ro">
<ul data-role="listview" id="list" data-inset="true" data-icon="false" >

<script type="text/javascript">
$( document ).ready( function() {
    for (i=0;i<30;i++){
               var listLink = $("<li><a href=\"\">");
               var listTitle = $("<h2></h2>");
               var listdesc = $("<p>"+responseText+"</p></a></li>");
               $("#list").append(listLink);
               $("#list").append(listTitle);
               $("#list").append(listdesc);
               $('ul').listview('refresh');
               
               }
	});
 </script>  
             
</ul>
      </div>
      <!-- /content -->
      <div data-role="footer" class="ui-bar"> <a href="#" data-role="button" id="more">more....</a> </div>
      <!-- /footer --> 
    </div>
    <!-- /page -->
</body>
</html>