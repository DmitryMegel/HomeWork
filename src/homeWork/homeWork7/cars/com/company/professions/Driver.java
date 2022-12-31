package homeWork.homeWork7.cars.com.company.professions;

public class Driver {

    /**
     * ФИО водителя
     */
    private String fio;

    /**
     * стаж вождения
     */
    private int experience;

    public Driver(String fio, int experience) {
        this.fio = fio;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
