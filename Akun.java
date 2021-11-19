

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Class akun untuk mengelola akun admin dan pendaftar sistem PPDB
 * 
 * @author pakabar
 * @since 21.11.18
 * @version 21.11.18
 */

public class Akun {
    private String username;
    private String password;

    /**
     * Method constructor untuk class Akun.
     * 
     * @param username
     * @param password
     */
    public Akun(String username, String password) {
        this.username = username;
        this.password = password;

    }

    /**
     * Method getter untuk mendapatkan username
     * 
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Method getter untuk mendapatkan password
     * 
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public boolean cekUsernameAndPassword() throws IOException{
        // membuka file
        boolean login;
        FileReader inputFile = null;
        BufferedReader bufferInput = null;
        StringTokenizer stringToken;
        inputFile = new FileReader("database.txt");
        bufferInput = new BufferedReader(inputFile);

        String data;

        // mengecek inputan user dengan data didalam database
        while (true) {
            data = bufferInput.readLine();
            stringToken = new StringTokenizer(data, ",");
            String usernameDB = stringToken.nextToken();
            String passwordDB = stringToken.nextToken();

            
            if (this.username.equals(usernameDB) && this.password.equals(passwordDB)) {
                login = true;
                break;
            } else {
                login = false;
                break;
            }

        }
        // menutup buffer
        bufferInput.close();
        return login;


    }

}
