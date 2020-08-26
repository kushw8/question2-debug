package project.logic.model;

public class User {
    private String fName;
    // TODO : RQ - 1
    private String dateOfBirth;
    private String lName;
    private Address address;
    private Double salary;



    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }


    public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
   
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", DateOfBirth=" + dateOfBirth +
                ", lName='" + lName + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}
