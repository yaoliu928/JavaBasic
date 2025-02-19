public class Family {
    private String familyNumber;
    private float familyScore;
    private String regTime;

    public Family() {
    }

    public Family(String familyNumber, float familyScore, String regTime) {
        this.familyNumber = familyNumber;
        this.familyScore = familyScore;
        this.regTime = regTime;
    }

    public String getFamilyNumber() {
        return familyNumber;
    }

    public void setFamilyNumber(String familyNumber) {
        this.familyNumber = familyNumber;
    }

    public float getFamilyScore() {
        return familyScore;
    }

    public void setFamilyScore(float familyScore) {
        this.familyScore = familyScore;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    @Override
    public String toString() {
        return "Family{" +
                "familyNumber='" + familyNumber + '\'' +
                ", familyScore=" + familyScore +
                ", regTime='" + regTime + '\'' +
                '}';
    }
}
