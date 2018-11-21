import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SchoolEnviroment {
    private static School schoola;

    public static void main(String [] args) {
        String nama;
        String start;
        String end;
        String namaSekolah;
        String tglSekolah;

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert School Name ");
        namaSekolah = sc.next();
        System.out.println("Insert School Start Date:  ");
        tglSekolah = sc.next();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateSchool = null;

        {
            try {
                dateSchool = format.parse(tglSekolah);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        schoola = new School(namaSekolah, dateSchool);

        System.out.println("Insert Course Name: ");
        nama = sc.nextLine();
        System.out.println("Insert Course Start Date: ");
        start = sc.nextLine();
        System.out.println("Insert Course End Date ");
        end =  sc.nextLine();

        Date dateStart = null;
        Date dateEnd= null;
        {
            try {
                dateStart = format.parse(start);
                dateEnd = format.parse(end);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        course newCourse = new course(nama, dateStart, dateEnd);

        if(checkStartDate(dateStart) && checkEndDate(dateStart,dateEnd)){
            schoola.addCourses(newCourse);
        }
    }


    public static boolean checkStartDate(Date dates){
        Date a = schoola.getOpenDate();

        if(dates.after(a)){
            return true;
        }
        else
            return false;
    }

    public static boolean checkEndDate(Date dates, Date dates2){
        if(dates2.after(dates)){
            return true;
        }
        else
            return false;
    }
}
