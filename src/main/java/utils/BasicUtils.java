package utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

public class BasicUtils {

    private static final int MIN_BATCH = 6;
    private static final int MAX_BATCH = 27;
    //TODO: change this numbers
    private static final int HOURS_NUMBER = 4;
    private static final int ADDED_LIMIT = 5000;
    private static final int DELETED_LIMIT = 2000;

    public static int getMaxBatch() {
        return MAX_BATCH;
    }

    public static int getAddedLimit() {
        return ADDED_LIMIT;
    }

    public static int getDeletedLimit() {
        return DELETED_LIMIT;
    }

    public static Date getTimeToInterrupt() {
        Date date = new Date();
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        //TODO: change seconds to hours and use HOURS_NUMBER
        calendar.add(Calendar.SECOND, 30);
        date.setTime(calendar.getTime().getTime());
        return date;
    }

    public static int generateBatchSize() {
        return ThreadLocalRandom.current().nextInt(MIN_BATCH, MAX_BATCH);
    }

    public static long generateRnd() {
        return ThreadLocalRandom.current().nextLong(0, Counter.getVertexesNumber() * 1000);
    }

    public static long getRandomVertexId() {
        return ThreadLocalRandom.current().nextLong(1, Counter.getVertexesNumber());
    }

}
