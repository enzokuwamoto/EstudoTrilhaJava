package Lenum.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start-up");

    public int DB_VALUE;
    public String reportedValue;

    CustomerType(int dbValue, String reportedValue){
        this.DB_VALUE = dbValue;
        this.reportedValue = reportedValue;
    }

    public static CustomerType getByReportValue(String reportedValue){
        for (CustomerType customerType : values()) {
            if (customerType.getReportedValue().equalsIgnoreCase(reportedValue)){
                return customerType;
            }
        }
        return null;

    }

    public int getDB_VALUE() {
        return DB_VALUE;
    }

    public String getReportedValue() {
        return reportedValue;
    }
}
