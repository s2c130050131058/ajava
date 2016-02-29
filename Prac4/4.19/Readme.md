
4.19 Inserting Data In Database table using Statement
-----------------------------------------------------
In this program we are going to insert the data in the database from our java program in the table stored in the database.
To accomplish our goal we first have to make a class named as ServletInsertingData, which must extends the abstract HttpServlet class, the name of the class should be such that other person can understand what this program is going to perform. The logic of the program will be written inside the doGet() method that takes two arguments, first is HttpServletRequest interface and the second one is the HttpServletResponse interface and this method can throw ServletException.
Inside this method call the getWriter() method of the PrintWriter class. We can insert the data in the database only and only if there is a connectivity between our database and the java program. To establish the connection between our database and the java program we first need to call the method forName(), which is static in nature of the class Class. It takes one argument which tells about the database driver we are going to use. Now use the static method getConnection() of the DriverManager class. This method takes three arguments and returns the Connection object. SQL statements are executed and  results are returned within the context of a connection. Now your connection has been established. Now use the method createStatement() of the Connection object which will return the Statement object. This object is used for executing a static SQL statement and obtaining the results produced by it. We have to insert a values into the table so we need to write a query for inserting the values into the table. This query we will write inside the executeUpdate() method of the Statement object. This method returns int value.
If the record will get inserted in the table then output will show "record has been inserted"  otherwise "sorry! Failure".

![4 19 1](https://cloud.githubusercontent.com/assets/16961604/13395503/2c3e8e3a-df15-11e5-9aa0-67a6c814b373.png)
![4 19 2](https://cloud.githubusercontent.com/assets/16961604/13395502/2c2777f4-df15-11e5-965b-b2fe7fa4f431.png)


