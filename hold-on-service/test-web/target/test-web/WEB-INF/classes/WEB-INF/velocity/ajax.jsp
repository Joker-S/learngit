<%@ page contentType="text/html;charset=GBK"%>

<%String userName = request.getParameter("UserName");
if(userName!=null){
userName = new String(userName.getBytes("ISO-8859-1"), "utf-8");//������������
}
String returnString = "";
returnString="��ã�" + userName;
(returnString);
%>