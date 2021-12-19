/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import java.util.List;

/**
 *
 * @author user
 */
public class members {
    private static int cnt;
    private static String userId;
    private static String movieNo;
    private static String movieName;
    private static String movieTime;
    private static String movieDir;
    public static void logout(){
        userId = null;
    }

    public static String getMovieDir() {
        return movieDir;
    }

    public static void setMovieDir(String movieDir) {
        members.movieDir = movieDir;
    }
    private static int movieAge;

    public static int getMovieAge() {
        return movieAge;
    }

    public static void setMovieAge(int movieAge) {
        members.movieAge = movieAge;
    }
    private static List<String> seatList;
    private static  int totalP;
    private static String movieDay;

    public static String getMovieTime() {
        return movieTime;
    }

    public static void setMovieTime(String movieTime) {
        members.movieTime = movieTime;
    }

    

    public static String getMovieDay() {
        return movieDay;
    }

    public static void setMovieDay(String movieDay) {
        members.movieDay = movieDay;
    }

    public static String getMovieName() {
        return movieName;
    }

    public static void setMovieName(String movieName) {
        members.movieName = movieName;
    }
    

    public static int getTotalP() {
        return totalP;
    }

    public static void setTotalP(int totalP) {
        members.totalP = totalP;
    }
    

    public static List getSeatList() {
        return seatList;
    }

    public static void setSeatList(List seatList) {
        members.seatList = seatList;
    }
    

    public static int getCnt() {
        return cnt;
    }

    public static String getMovieNo() {
        return movieNo;
    }


    public static String getUserId() {
        return userId;
    }

    public static void setCnt(int cnt) {
        members.cnt = cnt;
    }

    public static void setMovieNo(String movieNo) {
        members.movieNo = movieNo;
    }



    public static void setUserId(String userId) {
        members.userId = userId;
    }

    
    
}
