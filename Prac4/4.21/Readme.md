
4.21 Inserting data from the HTML page to the database
------------------------------------------------------
In this program we are going to make program in which we are going to insert the values in the database table from the html form.
To make our program working we need to make one html form in which we will have two fields, one is for the name and the other one  is for entering the password. At last we will have the submit form, clicking on which the values will be passed to the server.
The values which we have entered in the Html form will be retrieved by the server side program which we are going to write. To accomplish our goal we first have to make a class named as ServletInsertingDataUsingHtml which must extends the abstract HttpServlet class, the name of the class should be such that the other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method which takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can insert the data in the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we firstly need to call the method forName() which is static in nature of the class Class. It takes one argument which tells about the database driver  we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method prepareStatement() of the Connection object which will return the PreparedStatement object and takes one a query which we want to fire as its input. The values which we have got from the html will be set in the database by using the setString() method of the PreparedStatement object.
If the record will get inserted in the table then output will show "record has been inserted"  otherwise "sorry! Failure".


![4 21 2](https://cloud.githubusercontent.com/assets/16961604/13395760/dcc9415e-df16-11e5-9b20-c233c554cf1c.png)
![4 21 3](https://cloud.githubusercontent.com/assets/16961604/13395762/ddf8eebc-df16-11e5-8005-94bf520d8744.png)
![4 21 1](https://cloud.githubusercontent.com/assets/16961604/13395764/dee058e2-df16-11e5-8526-72d80ec99f53.png)
