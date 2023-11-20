import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JoseVicente {
    public static void main(String[] args) {
        ResultSet resultado;

        try {
            ///NUMERO 1
            resultado = conexionBBDD("SELECT COUNT(n1) AS veces, n1 AS numero FROM euromillones GROUP BY n1 ORDER BY veces DESC LIMIT 1");

            while (resultado.next()) {

                int veces = resultado.getInt("veces");
                int numero = resultado.getInt("numero");

                System.out.println("Para ganar en el euromillones debes jugar a los números " + numero + " porque el número "+ numero + " ya ha salido " + veces + " en la columna 1.");

            }

            ///NUMERO 2
            resultado = conexionBBDD("SELECT COUNT(n2) AS veces, n2 AS numero FROM euromillones GROUP BY n2 ORDER BY veces DESC LIMIT 1");

            while (resultado.next()) {

                int veces = resultado.getInt("veces");
                int numero = resultado.getInt("numero");

                System.out.println("Para ganar en el euromillones debes jugar a los números " + numero + " porque el número "+ numero + " ya ha salido " + veces + " en la columna 2.");

            }
            ///NUMERO 3
            resultado = conexionBBDD("SELECT COUNT(n3) AS veces, n3 AS numero FROM euromillones GROUP BY n3 ORDER BY veces DESC LIMIT 1");

            while (resultado.next()) {

                int veces = resultado.getInt("veces");
                int numero = resultado.getInt("numero");

                System.out.println("Para ganar en el euromillones debes jugar a los números " + numero + " porque el número "+ numero + " ya ha salido " + veces + " en la columna 3.");

            }
            ///NUMERO 4
            resultado = conexionBBDD("SELECT COUNT(n4) AS veces, n4 AS numero FROM euromillones GROUP BY n4 ORDER BY veces DESC LIMIT 1");

            while (resultado.next()) {

                int veces = resultado.getInt("veces");
                int numero = resultado.getInt("numero");

                System.out.println("Para ganar en el euromillones debes jugar a los números " + numero + " porque el número "+ numero + " ya ha salido " + veces + " en la columna 4.");

            }
            ///NUMERO 5
            resultado = conexionBBDD("SELECT COUNT(n5) AS veces, n5 AS numero FROM euromillones GROUP BY n5 ORDER BY veces DESC LIMIT 1");

            while (resultado.next()) {

                int veces = resultado.getInt("veces");
                int numero = resultado.getInt("numero");

                System.out.println("Para ganar en el euromillones debes jugar a los números " + numero + " porque el número "+ numero + " ya ha salido " + veces + " en la columna 5.");

            }
            ///ESTRELLA 1
            resultado = conexionBBDD("SELECT COUNT(e1) AS veces, e1 AS numero FROM euromillones GROUP BY e1 ORDER BY veces DESC LIMIT 1");

            while (resultado.next()) {

                int veces = resultado.getInt("veces");
                int numero = resultado.getInt("numero");

                System.out.println("Para ganar en el euromillones debes jugar a los números " + numero + " porque el número "+ numero + " ya ha salido " + veces + " en la columna 6.");

            }
            ///ESTRELLA 2
            resultado = conexionBBDD("SELECT COUNT(e2) AS veces, e2 AS numero FROM euromillones GROUP BY e2 ORDER BY veces DESC LIMIT 1");

            while (resultado.next()) {

                int veces = resultado.getInt("veces");
                int numero = resultado.getInt("numero");

                System.out.println("Para ganar en el euromillones debes jugar a los números " + numero + " porque el número "+ numero + " ya ha salido " + veces + " en la columna 7.");

            }
            resultado.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
    public static ResultSet conexionBBDD(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String user = "examenjava";
            String password = "examenjava";
            String database = "euromillones";
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, user, password);

            Statement peticion = conexion.createStatement();


            return peticion.executeQuery(query);

        } catch (Exception error) {
            error.printStackTrace();
        }

        return null;
    }
}