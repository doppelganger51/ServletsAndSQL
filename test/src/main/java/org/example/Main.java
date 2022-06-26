package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

//import static jdk.internal.net.http.HttpRequestImpl.USER_AGENT;

public class Main {
    private static final String GET_URL_BROKEN_CARS = "http://localhost:8080/ile_zepsutych";
    private static final String GET_URL_ALL_CARS = "http://localhost:8080/ile_w_calosci";
    private static final String GET_URL_ = "http://localhost:8080/ile_naprawionych";
    private static final String GET_URL = "http://localhost:8080/addCar";
    private static final String GET_URL = "http://localhost:8080//fixCar";

    public static void main(String[] args) throws IOException {

        sendGET();
        System.out.println("GET DONE");
        //       sendPOST();
        //System.out.println("POST DONE");
    }

    private static void sendGET() throws IOException {
        URL obj = new URL(GET_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("org.example.User-Agent", "test");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        System.out.println(response.toString());
    }

//    private static void sendPOST() throws IOException {
//        URL obj = new URL(POST_URL);
//        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//        con.setRequestMethod("POST");
//        con.setRequestProperty("org.example.User-Agent", "test");
//
//        con.setDoOutput(true);
//        OutputStream os = con.getOutputStream();
//        os.write(POST_PARAMS.getBytes());
//        os.flush();
//        os.close();
//
//        int responseCode = con.getResponseCode();
//        System.out.println("POST Response Code :: " + responseCode);
//
//        if (responseCode == HttpURLConnection.HTTP_OK) { //success
//            BufferedReader in = new BufferedReader(new InputStreamReader(
//                    con.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();
//
//            System.out.println(response.toString());
//        } else {
//            System.out.println("POST request not worked");
//        }
//    }

}