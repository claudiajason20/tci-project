import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class courseTest {

    @Test
    public void getName() {
        //Arrange
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = format.parse("2018-10-20");
            endDate = format.parse("2018-11-20");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Act
        course c = new course("Gula", startDate, endDate);


        //Assert
        assertEquals("Gula",c.getName());

    }

    @Test
    public void getStartDate() {
        //Arrange
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = format.parse("2018-10-20");
            endDate = format.parse("2018-11-20");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Act
        course c = new course("Gula", startDate, endDate);


        //Assert
        assertEquals(startDate,c.getStartDate());
    }

    @Test
    public void getEndDate() {
        //Arrange
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;
        try {
            startDate = format.parse("2018-10-20");
            endDate = format.parse("2018-11-20");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //Act
        course c = new course("Gula", startDate, endDate);


        //Assert
        assertEquals(endDate,c.getEndDate());
    }

    @Test
    public void checkEndDate()throws CourseDateException{
        //Arrange
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date schoolStart = null;
        Date startDate = null;

        Date endDate = null;
        try {

            startDate = format.parse("2018-10-20");
            endDate = format.parse("2018-11-20");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        course c = new course("Gula", startDate, endDate);

        //Act
        boolean j = c.checkEndDate(startDate, endDate);

        //Assert
        assertTrue(j);

    }
}