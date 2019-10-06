package com.example.studykuy;

import java.util.ArrayList;

public class ScheduleData {
    public static String[][] data = new String[][]{
            {"Aransa Fitra Prawira", "Matematika", "https://scontent.fsub8-1.fna.fbcdn.net/v/t1.0-9/45015684_973651289492537_7605294883917529088_n.jpg?_nc_cat=101&_nc_eui2=AeGZooKDW27fUd2zVnRVLL3kC4Z5FwxZg3MDHxCWYMTJMQLtmxWZ7LszXTzy9R4A9T7vDrGFnovU0Ala9bZfTE2_V7J9Mt_BhBSPM_2Igze4FA&_nc_oc=AQmaknjpkn9fUeUTwChwDKLaz_4i5JaRwnkZSV-TbH8TMgheBSLYEBBsifFOQE2sgzU&_nc_ht=scontent.fsub8-1.fna&oh=3b01ce5c98cd63d93d5eedbfaa1f84a8&oe=5E2F2B81"},
    };

    public static ArrayList<Schedule> getListData(){
        ArrayList<Schedule> list = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            Schedule schedule = new Schedule();
            schedule.setNama(data[0][0]);
            schedule.setMatkul(data[0][1]);
            schedule.setPhoto(data[0][2]);

            list.add(schedule);
        }

//        for (String[] aData : data) {
//            Schedule schedule = new Schedule();
//            schedule.setNama(aData[0]);
//            schedule.setMatkul(aData[1]);
//            schedule.setPhoto(aData[2]);
//
//            list.add(schedule);
//        }

        return list;
    }
}
