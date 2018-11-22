import java.util.Date;

public class course {
    String name;
    Date startDate;
    Date endDate;

    public course(String name, Date startDate, Date endDate) {
        this.name = name;

        this.startDate = startDate;
        try {
            if(checkEndDate(startDate,endDate))
                this.endDate = endDate;
        } catch (CourseDateException e) {
            e.printStackTrace();
        }


    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }


    public boolean checkEndDate(Date dates, Date dates2) throws CourseDateException{
        if(dates2.after(dates)){
            return true;
        }
        else
            throw new CourseDateException("End date is not after the Start date!");
    }

}

