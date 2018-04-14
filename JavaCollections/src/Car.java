public class Car {
    private String registrationNumber;

    public Car(String registrationNumber){
        this.registrationNumber=registrationNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Car) {
            String regNumber = ((Car) obj).getRegistrationNumber();
            if (regNumber != null && regNumber.equals(this.registrationNumber)) {
                return true;
            }
        }
    }

    @Override
    public String toString(){
        return this.registrationNumber;
    }
}
