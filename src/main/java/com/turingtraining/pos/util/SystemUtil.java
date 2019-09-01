/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.util;

import com.turingtraining.pos.model.User;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wailwinphyo
 */
public class SystemUtil {

    private static User user = null;
    private static DateFormat df2 = new SimpleDateFormat("dd/MM/YYYY");

    public static String getCurrentDateString() {
        DateFormat df = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
        return df.format(new Date());
    }

    public static Date formatDate(String date) {
        try {
            return df2.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(SystemUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static User getCurrentUser() {
        return user;
    }

    public static void setUser(User user) {
        if (user != null) {
            SystemUtil.user = user;
        }
    }

}
