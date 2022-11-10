public class Username {

    /**
     * caracteristicas del usuario
     */

    private static Integer name;
    private static Integer surbname1;
    private static Integer surbname2;
    private static Integer dni;
    private static String mobile_phone;
    private static String landline;
    private static String town;


    public static Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public static Integer getSurbname1() {
        return surbname1;
    }

    public void setSurbname1(Integer surbname1) {
        this.surbname1 = surbname1;
    }

    public static Integer getSurbname2() {
        return surbname2;
    }

    public void setSurbname2(Integer surbname2) {
        this.surbname2 = surbname2;
    }

    public static Integer getDni() {
        return dni;
    }

    public void setDni(Integer Dni) {
        this.dni = Dni;
    }

    public static String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone() {
        this.mobile_phone = mobile_phone;
    }

    public static String getlandline() {
        return landline;
    }

    public void setLandline() {
        this.landline = landline;
    }

    public static String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}