<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<h1>შინაური ცხოველების სარეგისტრაციო ფორმა</h1>
<form action="servlet/Register" method="post">

    სახელი:<input type="text" name="petName"/><br/><br/>
    ჯიში:<input type="text" name="petsJishi"/><br/><br/>
    სქესი:<input type="text" name="petGender"/><br/><br/>
    ასაკი:<input type="text" name="petAge"/><br/><br/>
    <br/><br/>
    <input type="submit" value="register"/>
</form>
</body>
</html>