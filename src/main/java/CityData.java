public class CityData
{
    private String state = " ";
    private String city = " ";
    private String area = " ";
    private String height_NUM = " ";
    private String climate_type = " ";
    private String time_zone = " ";
    private String population = " ";
    private String description = " ";
    private String car_code = " ";
    private String telephone_code = " ";

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setHeight_NUM(String height_NUM) {
        this.height_NUM = height_NUM;
    }

    public void setClimate_type(String climate_type) {
        this.climate_type = climate_type;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCar_code(String car_code) {
        this.car_code = car_code;
    }

    public void setTelephone_code(String telephone_code) {
        this.telephone_code = telephone_code;
    }


    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public String getHeight_NUM() {
        return height_NUM;
    }

    public String getClimate_type() {
        return climate_type;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public String getPopulation() {
        return population;
    }

    public String getDescription() {
        return description;
    }

    public String getCar_code() {
        return car_code;
    }

    public String getTelephone_code() {
        return telephone_code;
    }

    @Override
    public String toString() {
        return "state "+state+
                "\ncity "+city+
                "\narea "+area+
                "\nheight_NUM "+height_NUM+
                "\nclimate_type "+climate_type+
                "\ntime_zone "+time_zone+
                "\npopulation "+population+
                "\ndescription "+description+
                "\ncar_code "+car_code+
                "\ntelephone_code "+telephone_code;
    }
}
