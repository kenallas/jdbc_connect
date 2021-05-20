package jdbc_Connect;
import java.sql.*;
import java.util.Properties;
import java.lang.Throwable;
import java.util.Scanner;
import java.io.Printwriter;

public class jdbc_Connect 
{
	public static void main(String[] args) throws SQLException
	{
/*
 * eerst de String url vragen
 * en de user en password voor
 * input van de app
 */
	Scanner input = new Scanner(System.in);
	System.out.println("Wat is de url van de database? ");
	String url = input.next();
	System.out.println("Geef de username op van de database? ");
	String user = input.next();
	System.out.println("Geef het wachtwoord op van de database? ");
	String ww = input.next();
	
	Properties jdbc_ConnectDatabase = new Properties();
	jdbc_ConnectDatabase.setProperty("user", user);
	jdbc_ConnectDatabase.setProperty("password", ww);
	try
	{
		Connection conn = DriverManager.getConnection(url, jdbc_ConnectDatabase);
		Boolean jdbc_Connected = true;
		System.out.println("The database is connected! ");
	}
	catch (SQLException ex)
	{
		boolean jdbc_Connected = false;
		System.out.println("Sorry, the database is not connected");
		ex.printStackTrace();
	}
	
	Connection conn = DriverManager.getConnection(url, jdbc_ConnectDatabase);
	System.out.println(" ");
	System.out.println("Onderstaand de inhoud van resourcetype");
	System.out.println(" ");
	Statement st = conn .createStatement();
	ResultSet rs = st.executeQuery("SELECT * FROM public.resourcetype");
	
/*
 * Onderstaand wordt de tabel afgedrukt
 */
	while (rs.next())
	{
	System.out.print(" Veld 1 : ");
	System.out.printf("%20s", rs.getString(1));
	System.out.print(" Veld 2 : ");
	System.out.printf("%20s\n", rs.getString(2));
	}
	/*
	 * opnieuw een query uitvoeren op de database
	 */
	rs = st.executeQuery("SELECT * FROM public.componentdefinition");
	System.out.println(" ");
	System.out.println("Onderstaand de inhoud van componentdefinition");
	System.out.println(" ");
	while (rs.next())
	{
	System.out.print(" Veld 1 : ");
	System.out.printf("%20s", rs.getString(1));
	System.out.print(" Veld 2 : ");
	System.out.printf("%20s", rs.getString(2));
	System.out.print(" Veld 3 : ");
	System.out.printf("%20s", rs.getString(3));
	System.out.print(" Veld 4 : ");
	System.out.printf("%20s", rs.getString(4));
	System.out.print(" Veld 5 : ");
	System.out.printf("%20s", rs.getString(5));
	System.out.print(" Veld 6 : ");
	System.out.printf("%20s\n", rs.getString(6));
	}
	/*
	 * opnieuw een query uitvoeren op de database
	 */
	rs = st.executeQuery("SELECT * FROM public.componenttype");
	System.out.println(" ");
	System.out.println("Onderstaand de inhoud van componenttype");
	System.out.println(" ");
	while (rs.next())
	{
	System.out.print(" Veld 1 : ");
	System.out.printf("%20s", rs.getString(1));
	System.out.print(" Veld 2 : ");
	System.out.printf("%20s", rs.getString(2));
	System.out.print(" Veld 3 : ");
	System.out.printf("%20s", rs.getString(3));
	System.out.print(" Veld 4 : ");
	System.out.printf("%20s", rs.getString(4));
	System.out.print(" Veld 5 : ");
	System.out.printf("%20s", rs.getString(5));
	System.out.print(" Veld 6 : ");
	System.out.printf("%20s\n", rs.getString(6));
	}
	/*
	 * opnieuw een query uitvoeren op de database
	 */
	rs = st.executeQuery("SELECT * FROM public.resources");
	System.out.println(" ");
	System.out.println("Onderstaand de inhoud van resources");
	System.out.println(" ");
	while (rs.next())
	{
	System.out.print(" Veld 1 : ");
	System.out.printf("%20s", rs.getString(1));
	System.out.print(" Veld 2 : ");
	System.out.printf("%20s", rs.getString(2));
	System.out.print(" Veld 3 : ");
	System.out.printf("%20s", rs.getString(3));
	System.out.print(" Veld 4 : ");
	System.out.printf("%20s", rs.getString(4));
	System.out.print(" Veld 5 : ");
	System.out.printf("%20s", rs.getString(5));
	System.out.print(" Veld 6 : ");
	System.out.printf("%20s\n", rs.getString(6));
	}
	/*
	 * opnieuw een query uitvoeren op de database
	 */
	rs = st.executeQuery("SELECT * FROM public.resourcestate");
	System.out.println(" ");
	System.out.println("Onderstaand de inhoud van resourcestate");
	System.out.println(" ");
	while (rs.next())
	{
	System.out.print(" Veld 1 : ");
	System.out.printf("%20s", rs.getString(1));
	System.out.print(" Veld 2 : ");
	System.out.printf("%20s", rs.getString(2));
	System.out.print(" Veld 3 : ");
	System.out.printf("%20s", rs.getString(3));
	System.out.print(" Veld 4 : ");
	System.out.printf("%20s", rs.getString(4));
	System.out.print(" Veld 5 : ");
	System.out.printf("%20s", rs.getString(5));
	System.out.print(" Veld 6 : ");
	System.out.printf("%20s\n", rs.getString(6));
	}
	/*
	 * opnieuw een query uitvoeren op de database
	 */
	rs = st.executeQuery("SELECT * FROM public.comments");
	System.out.println(" ");
	System.out.println("Onderstaand de inhoud van *comments");
	System.out.println(" ");
	while (rs.next())
	{
	System.out.print(" Veld 1 : ");
	System.out.printf("%20s", rs.getString(1));
	System.out.print(" Veld 2 : ");
	System.out.printf("%20s", rs.getString(2));
	System.out.print(" Veld 3 : ");
	System.out.printf("%20s", rs.getString(3));
	System.out.print(" Veld 4 : ");
	System.out.printf("%20s\n", rs.getString(4));
	}
	rs.close();
	st.close();
	}
}
